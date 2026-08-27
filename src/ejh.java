import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.stb.STBVorbis;
import org.lwjgl.stb.STBVorbisInfo;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class ejh implements gde {
   private static final int a = 8192;
   private long b;
   private final AudioFormat c;
   private final InputStream d;
   private ByteBuffer e = MemoryUtil.memAlloc(8192);

   public ejh(InputStream $$0) throws IOException {
      this.d = $$0;
      this.e.limit(0);
      MemoryStack $$1 = MemoryStack.stackPush();

      try {
         IntBuffer $$2 = $$1.mallocInt(1);
         IntBuffer $$3 = $$1.mallocInt(1);

         while (this.b == 0L) {
            if (!this.c()) {
               throw new IOException("Failed to find Ogg header");
            }

            int $$4 = this.e.position();
            this.e.position(0);
            this.b = STBVorbis.stb_vorbis_open_pushdata(this.e, $$2, $$3, null);
            this.e.position($$4);
            int $$5 = $$3.get(0);
            if ($$5 == 1) {
               this.d();
            } else if ($$5 != 0) {
               throw new IOException("Failed to read Ogg file " + $$5);
            }
         }

         this.e.position(this.e.position() + $$2.get(0));
         STBVorbisInfo $$6 = STBVorbisInfo.mallocStack($$1);
         STBVorbis.stb_vorbis_get_info(this.b, $$6);
         this.c = new AudioFormat((float)$$6.sample_rate(), 16, $$6.channels(), true, false);
      } catch (Throwable var8) {
         if ($$1 != null) {
            try {
               $$1.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if ($$1 != null) {
         $$1.close();
      }
   }

   private boolean c() throws IOException {
      int $$0 = this.e.limit();
      int $$1 = this.e.capacity() - $$0;
      if ($$1 == 0) {
         return true;
      } else {
         byte[] $$2 = new byte[$$1];
         int $$3 = this.d.read($$2);
         if ($$3 == -1) {
            return false;
         } else {
            int $$4 = this.e.position();
            this.e.limit($$0 + $$3);
            this.e.position($$0);
            this.e.put($$2, 0, $$3);
            this.e.position($$4);
            return true;
         }
      }
   }

   private void d() {
      boolean $$0 = this.e.position() == 0;
      boolean $$1 = this.e.position() == this.e.limit();
      if ($$1 && !$$0) {
         this.e.position(0);
         this.e.limit(0);
      } else {
         ByteBuffer $$2 = MemoryUtil.memAlloc($$0 ? 2 * this.e.capacity() : this.e.capacity());
         $$2.put(this.e);
         MemoryUtil.memFree(this.e);
         $$2.flip();
         this.e = $$2;
      }
   }

   private boolean a(ejh.a $$0) throws IOException {
      if (this.b == 0L) {
         return false;
      } else {
         MemoryStack $$1 = MemoryStack.stackPush();

         int $$5;
         label79: {
            boolean var15;
            label80: {
               try {
                  PointerBuffer $$2 = $$1.mallocPointer(1);
                  IntBuffer $$3 = $$1.mallocInt(1);
                  IntBuffer $$4 = $$1.mallocInt(1);

                  while (true) {
                     $$5 = STBVorbis.stb_vorbis_decode_frame_pushdata(this.b, this.e, $$3, $$2, $$4);
                     this.e.position(this.e.position() + $$5);
                     int $$6 = STBVorbis.stb_vorbis_get_error(this.b);
                     if ($$6 == 1) {
                        this.d();
                        if (!this.c()) {
                           $$5 = 0;
                           break label79;
                        }
                     } else {
                        if ($$6 != 0) {
                           throw new IOException("Failed to read Ogg file " + $$6);
                        }

                        int $$7 = $$4.get(0);
                        if ($$7 != 0) {
                           int $$8 = $$3.get(0);
                           PointerBuffer $$9 = $$2.getPointerBuffer($$8);
                           if ($$8 == 1) {
                              this.a($$9.getFloatBuffer(0, $$7), $$0);
                              var15 = true;
                              break label80;
                           }

                           if ($$8 != 2) {
                              throw new IllegalStateException("Invalid number of channels: " + $$8);
                           }

                           this.a($$9.getFloatBuffer(0, $$7), $$9.getFloatBuffer(1, $$7), $$0);
                           var15 = true;
                           break;
                        }
                     }
                  }
               } catch (Throwable var13) {
                  if ($$1 != null) {
                     try {
                        $$1.close();
                     } catch (Throwable var12) {
                        var13.addSuppressed(var12);
                     }
                  }

                  throw var13;
               }

               if ($$1 != null) {
                  $$1.close();
               }

               return var15;
            }

            if ($$1 != null) {
               $$1.close();
            }

            return var15;
         }

         if ($$1 != null) {
            $$1.close();
         }

         return (boolean)$$5;
      }
   }

   private void a(FloatBuffer $$0, ejh.a $$1) {
      while ($$0.hasRemaining()) {
         $$1.a($$0.get());
      }
   }

   private void a(FloatBuffer $$0, FloatBuffer $$1, ejh.a $$2) {
      while ($$0.hasRemaining() && $$1.hasRemaining()) {
         $$2.a($$0.get());
         $$2.a($$1.get());
      }
   }

   @Override
   public void close() throws IOException {
      if (this.b != 0L) {
         STBVorbis.stb_vorbis_close(this.b);
         this.b = 0L;
      }

      MemoryUtil.memFree(this.e);
      this.d.close();
   }

   @Override
   public AudioFormat a() {
      return this.c;
   }

   @Override
   public ByteBuffer a(int $$0) throws IOException {
      ejh.a $$1 = new ejh.a($$0 + 8192);

      while (this.a($$1) && $$1.c < $$0) {
      }

      return $$1.a();
   }

   public ByteBuffer b() throws IOException {
      ejh.a $$0 = new ejh.a(16384);

      while (this.a($$0)) {
      }

      return $$0.a();
   }

   static class a {
      private final List<ByteBuffer> a = Lists.newArrayList();
      private final int b;
      int c;
      private ByteBuffer d;

      public a(int $$0) {
         this.b = $$0 + 1 & -2;
         this.b();
      }

      private void b() {
         this.d = BufferUtils.createByteBuffer(this.b);
      }

      public void a(float $$0) {
         if (this.d.remaining() == 0) {
            this.d.flip();
            this.a.add(this.d);
            this.b();
         }

         int $$1 = asb.a((int)($$0 * 32767.5F - 0.5F), -32768, 32767);
         this.d.putShort((short)$$1);
         this.c += 2;
      }

      public ByteBuffer a() {
         this.d.flip();
         if (this.a.isEmpty()) {
            return this.d;
         } else {
            ByteBuffer $$0 = BufferUtils.createByteBuffer(this.c);
            this.a.forEach($$0::put);
            $$0.put(this.d);
            $$0.flip();
            return $$0;
         }
      }
   }
}
