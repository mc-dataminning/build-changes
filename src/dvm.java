import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvm implements AutoCloseable {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 4096;
   @VisibleForTesting
   protected static final int a = 1024;
   private static final int e = 5;
   private static final int f = 0;
   private static final ByteBuffer g = ByteBuffer.allocateDirect(1);
   private static final String h = ".mcc";
   private static final int i = 128;
   private static final int j = 256;
   private static final int k = 0;
   final dvp l;
   private final Path m;
   private final FileChannel n;
   private final Path o;
   final dvo p;
   private final ByteBuffer q = ByteBuffer.allocateDirect(8192);
   private final IntBuffer r;
   private final IntBuffer s;
   @VisibleForTesting
   protected final dvl b = new dvl();

   public dvm(dvp $$0, Path $$1, Path $$2, boolean $$3) throws IOException {
      this($$0, $$1, $$2, dvo.a(), $$3);
   }

   public dvm(dvp $$0, Path $$1, Path $$2, dvo $$3, boolean $$4) throws IOException {
      this.l = $$0;
      this.m = $$1;
      this.p = $$3;
      if (!Files.isDirectory($$2)) {
         throw new IllegalArgumentException("Expected directory, got " + $$2.toAbsolutePath());
      } else {
         this.o = $$2;
         this.r = this.q.asIntBuffer();
         this.r.limit(1024);
         this.q.position(4096);
         this.s = this.q.asIntBuffer();
         if ($$4) {
            this.n = FileChannel.open($$1, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.DSYNC);
         } else {
            this.n = FileChannel.open($$1, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE);
         }

         this.b.a(0, 2);
         this.q.position(0);
         int $$5 = this.n.read(this.q, 0L);
         if ($$5 != -1) {
            if ($$5 != 8192) {
               c.warn("Region file {} has truncated header: {}", $$1, $$5);
            }

            long $$6 = Files.size($$1);

            for (int $$7 = 0; $$7 < 1024; $$7++) {
               int $$8 = this.r.get($$7);
               if ($$8 != 0) {
                  int $$9 = b($$8);
                  int $$10 = a($$8);
                  if ($$9 < 2) {
                     c.warn("Region file {} has invalid sector at index: {}; sector {} overlaps with header", new Object[]{$$1, $$7, $$9});
                     this.r.put($$7, 0);
                  } else if ($$10 == 0) {
                     c.warn("Region file {} has an invalid sector at index: {}; size has to be > 0", $$1, $$7);
                     this.r.put($$7, 0);
                  } else if ((long)$$9 * 4096L > $$6) {
                     c.warn("Region file {} has an invalid sector at index: {}; sector {} is out of bounds", new Object[]{$$1, $$7, $$9});
                     this.r.put($$7, 0);
                  } else {
                     this.b.a($$9, $$10);
                  }
               }
            }
         }
      }
   }

   public Path a() {
      return this.m;
   }

   private Path f(dbg $$0) {
      String $$1 = "c." + $$0.e + "." + $$0.f + ".mcc";
      return this.o.resolve($$1);
   }

   @Nullable
   public synchronized DataInputStream a(dbg $$0) throws IOException {
      int $$1 = this.g($$0);
      if ($$1 == 0) {
         return null;
      } else {
         int $$2 = b($$1);
         int $$3 = a($$1);
         int $$4 = $$3 * 4096;
         ByteBuffer $$5 = ByteBuffer.allocate($$4);
         this.n.read($$5, (long)($$2 * 4096));
         $$5.flip();
         if ($$5.remaining() < 5) {
            c.error("Chunk {} header is truncated: expected {} but read {}", new Object[]{$$0, $$4, $$5.remaining()});
            return null;
         } else {
            int $$6 = $$5.getInt();
            byte $$7 = $$5.get();
            if ($$6 == 0) {
               c.warn("Chunk {} is allocated, but stream is missing", $$0);
               return null;
            } else {
               int $$8 = $$6 - 1;
               if (a($$7)) {
                  if ($$8 != 0) {
                     c.warn("Chunk has both internal and external streams");
                  }

                  return this.a($$0, b($$7));
               } else if ($$8 > $$5.remaining()) {
                  c.error("Chunk {} stream is truncated: expected {} but read {}", new Object[]{$$0, $$8, $$5.remaining()});
                  return null;
               } else if ($$8 < 0) {
                  c.error("Declared size {} of chunk {} is negative", $$6, $$0);
                  return null;
               } else {
                  bnp.f.a(this.l, $$0, this.p, $$8);
                  return this.a($$0, $$7, a($$5, $$8));
               }
            }
         }
      }
   }

   private static int c() {
      return (int)(ac.e() / 1000L);
   }

   private static boolean a(byte $$0) {
      return ($$0 & 128) != 0;
   }

   private static byte b(byte $$0) {
      return (byte)($$0 & -129);
   }

   @Nullable
   private DataInputStream a(dbg $$0, byte $$1, InputStream $$2) throws IOException {
      dvo $$3 = dvo.a($$1);
      if ($$3 == dvo.e) {
         String $$4 = new DataInputStream($$2).readUTF();
         alf $$5 = alf.a($$4);
         if ($$5 != null) {
            c.error("Unrecognized custom compression {}", $$5);
            return null;
         } else {
            c.error("Invalid custom compression id {}", $$4);
            return null;
         }
      } else if ($$3 == null) {
         c.error("Chunk {} has invalid chunk stream version {}", $$0, $$1);
         return null;
      } else {
         return new DataInputStream($$3.a($$2));
      }
   }

   @Nullable
   private DataInputStream a(dbg $$0, byte $$1) throws IOException {
      Path $$2 = this.f($$0);
      if (!Files.isRegularFile($$2)) {
         c.error("External chunk path {} is not file", $$2);
         return null;
      } else {
         return this.a($$0, $$1, Files.newInputStream($$2));
      }
   }

   private static ByteArrayInputStream a(ByteBuffer $$0, int $$1) {
      return new ByteArrayInputStream($$0.array(), $$0.position(), $$1);
   }

   private int a(int $$0, int $$1) {
      return $$0 << 8 | $$1;
   }

   private static int a(int $$0) {
      return $$0 & 0xFF;
   }

   private static int b(int $$0) {
      return $$0 >> 8 & 16777215;
   }

   private static int c(int $$0) {
      return ($$0 + 4096 - 1) / 4096;
   }

   public boolean b(dbg $$0) {
      int $$1 = this.g($$0);
      if ($$1 == 0) {
         return false;
      } else {
         int $$2 = b($$1);
         int $$3 = a($$1);
         ByteBuffer $$4 = ByteBuffer.allocate(5);

         try {
            this.n.read($$4, (long)($$2 * 4096));
            $$4.flip();
            if ($$4.remaining() != 5) {
               return false;
            } else {
               int $$5 = $$4.getInt();
               byte $$6 = $$4.get();
               if (a($$6)) {
                  if (!dvo.b(b($$6))) {
                     return false;
                  }

                  if (!Files.isRegularFile(this.f($$0))) {
                     return false;
                  }
               } else {
                  if (!dvo.b($$6)) {
                     return false;
                  }

                  if ($$5 == 0) {
                     return false;
                  }

                  int $$7 = $$5 - 1;
                  if ($$7 < 0 || $$7 > 4096 * $$3) {
                     return false;
                  }
               }

               return true;
            }
         } catch (IOException var9) {
            return false;
         }
      }
   }

   public DataOutputStream c(dbg $$0) throws IOException {
      return new DataOutputStream(this.p.a(new dvm.a($$0)));
   }

   public void b() throws IOException {
      this.n.force(true);
   }

   public void d(dbg $$0) throws IOException {
      int $$1 = h($$0);
      int $$2 = this.r.get($$1);
      if ($$2 != 0) {
         this.r.put($$1, 0);
         this.s.put($$1, c());
         this.e();
         Files.deleteIfExists(this.f($$0));
         this.b.b(b($$2), a($$2));
      }
   }

   protected synchronized void a(dbg $$0, ByteBuffer $$1) throws IOException {
      int $$2 = h($$0);
      int $$3 = this.r.get($$2);
      int $$4 = b($$3);
      int $$5 = a($$3);
      int $$6 = $$1.remaining();
      int $$7 = c($$6);
      int $$9;
      dvm.b $$10;
      if ($$7 >= 256) {
         Path $$8 = this.f($$0);
         c.warn("Saving oversized chunk {} ({} bytes} to external file {}", new Object[]{$$0, $$6, $$8});
         $$7 = 1;
         $$9 = this.b.a($$7);
         $$10 = this.a($$8, $$1);
         ByteBuffer $$11 = this.d();
         this.n.write($$11, (long)($$9 * 4096));
      } else {
         $$9 = this.b.a($$7);
         $$10 = () -> Files.deleteIfExists(this.f($$0));
         this.n.write($$1, (long)($$9 * 4096));
      }

      this.r.put($$2, this.a($$9, $$7));
      this.s.put($$2, c());
      this.e();
      $$10.run();
      if ($$4 != 0) {
         this.b.b($$4, $$5);
      }
   }

   private ByteBuffer d() {
      ByteBuffer $$0 = ByteBuffer.allocate(5);
      $$0.putInt(1);
      $$0.put((byte)(this.p.b() | 128));
      $$0.flip();
      return $$0;
   }

   private dvm.b a(Path $$0, ByteBuffer $$1) throws IOException {
      Path $$2 = Files.createTempFile(this.o, "tmp", null);

      try (FileChannel $$3 = FileChannel.open($$2, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
         $$1.position(5);
         $$3.write($$1);
      }

      return () -> Files.move($$2, $$0, StandardCopyOption.REPLACE_EXISTING);
   }

   private void e() throws IOException {
      this.q.position(0);
      this.n.write(this.q, 0L);
   }

   private int g(dbg $$0) {
      return this.r.get(h($$0));
   }

   public boolean e(dbg $$0) {
      return this.g($$0) != 0;
   }

   private static int h(dbg $$0) {
      return $$0.j() + $$0.k() * 32;
   }

   @Override
   public void close() throws IOException {
      try {
         this.f();
      } finally {
         try {
            this.n.force(true);
         } finally {
            this.n.close();
         }
      }
   }

   private void f() throws IOException {
      int $$0 = (int)this.n.size();
      int $$1 = c($$0) * 4096;
      if ($$0 != $$1) {
         ByteBuffer $$2 = g.duplicate();
         $$2.position(0);
         this.n.write($$2, (long)($$1 - 1));
      }
   }

   class a extends ByteArrayOutputStream {
      private final dbg b;

      public a(final dbg $$0) {
         super(8096);
         super.write(0);
         super.write(0);
         super.write(0);
         super.write(0);
         super.write(dvm.this.p.b());
         this.b = $$0;
      }

      @Override
      public void close() throws IOException {
         ByteBuffer $$0 = ByteBuffer.wrap(this.buf, 0, this.count);
         int $$1 = this.count - 5 + 1;
         bnp.f.b(dvm.this.l, this.b, dvm.this.p, $$1);
         $$0.putInt(0, $$1);
         dvm.this.a(this.b, $$0);
      }
   }

   interface b {
      void run() throws IOException;
   }
}
