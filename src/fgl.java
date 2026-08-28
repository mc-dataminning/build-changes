import java.nio.ByteOrder;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.lwjgl.system.MemoryUtil;

public class fgl implements fgu {
   private static final long a = -1L;
   private static final long b = -1L;
   private static final boolean c = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
   private final fgn d;
   private long e = -1L;
   private int f;
   private final fgv g;
   private final fgv.c h;
   private final boolean i;
   private final boolean j;
   private final int k;
   private final int l;
   private final int[] m;
   private int n;
   private boolean o = true;

   public fgl(fgn $$0, fgv.c $$1, fgv $$2) {
      if (!$$2.b(fgw.b)) {
         throw new IllegalArgumentException("Cannot build mesh with no position element");
      } else {
         this.d = $$0;
         this.h = $$1;
         this.g = $$2;
         this.k = $$2.b();
         this.l = $$2.f() & ~fgw.b.a();
         this.m = $$2.e();
         boolean $$3 = $$2 == fgo.c;
         boolean $$4 = $$2 == fgo.b;
         this.i = $$3 || $$4;
         this.j = $$3;
      }
   }

   @Nullable
   public fgp a() {
      this.c();
      this.f();
      fgp $$0 = this.d();
      this.o = false;
      this.e = -1L;
      return $$0;
   }

   public fgp b() {
      fgp $$0 = this.a();
      if ($$0 == null) {
         throw new IllegalStateException("BufferBuilder was empty");
      } else {
         return $$0;
      }
   }

   private void c() {
      if (!this.o) {
         throw new IllegalStateException("Not building!");
      }
   }

   @Nullable
   private fgp d() {
      if (this.f == 0) {
         return null;
      } else {
         fgn.a $$0 = this.d.a();
         if ($$0 == null) {
            return null;
         } else {
            int $$1 = this.h.a(this.f);
            fgv.b $$2 = fgv.b.a(this.f);
            return new fgp($$0, new fgp.a(this.g, this.f, $$1, this.h, $$2));
         }
      }
   }

   private long e() {
      this.c();
      this.f();
      this.f++;
      long $$0 = this.d.a(this.k);
      this.e = $$0;
      return $$0;
   }

   private long a(fgw $$0) {
      int $$1 = this.n;
      int $$2 = $$1 & ~$$0.a();
      if ($$2 == $$1) {
         return -1L;
      } else {
         this.n = $$2;
         long $$3 = this.e;
         if ($$3 == -1L) {
            throw new IllegalArgumentException("Not currently building vertex");
         } else {
            return $$3 + (long)this.m[$$0.c()];
         }
      }
   }

   private void f() {
      if (this.f != 0) {
         if (this.n != 0) {
            String $$0 = fgw.b(this.n).map(this.g::c).collect(Collectors.joining(", "));
            throw new IllegalStateException("Missing elements in vertex: " + $$0);
         } else {
            if (this.h == fgv.c.a || this.h == fgv.c.b) {
               long $$1 = this.d.a(this.k);
               MemoryUtil.memCopy($$1 - (long)this.k, $$1, (long)this.k);
               this.f++;
            }
         }
      }
   }

   private static void a(long $$0, int $$1) {
      int $$2 = ayp.j($$1);
      MemoryUtil.memPutInt($$0, c ? $$2 : Integer.reverseBytes($$2));
   }

   private static void b(long $$0, int $$1) {
      if (c) {
         MemoryUtil.memPutInt($$0, $$1);
      } else {
         MemoryUtil.memPutShort($$0, (short)($$1 & 65535));
         MemoryUtil.memPutShort($$0 + 2L, (short)($$1 >> 16 & 65535));
      }
   }

   @Override
   public fgu a(float $$0, float $$1, float $$2) {
      long $$3 = this.e() + (long)this.m[fgw.b.c()];
      this.n = this.l;
      MemoryUtil.memPutFloat($$3, $$0);
      MemoryUtil.memPutFloat($$3 + 4L, $$1);
      MemoryUtil.memPutFloat($$3 + 8L, $$2);
      return this;
   }

   @Override
   public fgu a(int $$0, int $$1, int $$2, int $$3) {
      long $$4 = this.a(fgw.c);
      if ($$4 != -1L) {
         MemoryUtil.memPutByte($$4, (byte)$$0);
         MemoryUtil.memPutByte($$4 + 1L, (byte)$$1);
         MemoryUtil.memPutByte($$4 + 2L, (byte)$$2);
         MemoryUtil.memPutByte($$4 + 3L, (byte)$$3);
      }

      return this;
   }

   @Override
   public fgu a(int $$0) {
      long $$1 = this.a(fgw.c);
      if ($$1 != -1L) {
         a($$1, $$0);
      }

      return this;
   }

   @Override
   public fgu a(float $$0, float $$1) {
      long $$2 = this.a(fgw.d);
      if ($$2 != -1L) {
         MemoryUtil.memPutFloat($$2, $$0);
         MemoryUtil.memPutFloat($$2 + 4L, $$1);
      }

      return this;
   }

   @Override
   public fgu a(int $$0, int $$1) {
      return this.a((short)$$0, (short)$$1, fgw.f);
   }

   @Override
   public fgu b(int $$0) {
      long $$1 = this.a(fgw.f);
      if ($$1 != -1L) {
         b($$1, $$0);
      }

      return this;
   }

   @Override
   public fgu b(int $$0, int $$1) {
      return this.a((short)$$0, (short)$$1, fgw.g);
   }

   @Override
   public fgu c(int $$0) {
      long $$1 = this.a(fgw.g);
      if ($$1 != -1L) {
         b($$1, $$0);
      }

      return this;
   }

   private fgu a(short $$0, short $$1, fgw $$2) {
      long $$3 = this.a($$2);
      if ($$3 != -1L) {
         MemoryUtil.memPutShort($$3, $$0);
         MemoryUtil.memPutShort($$3 + 2L, $$1);
      }

      return this;
   }

   @Override
   public fgu b(float $$0, float $$1, float $$2) {
      long $$3 = this.a(fgw.h);
      if ($$3 != -1L) {
         MemoryUtil.memPutByte($$3, a($$0));
         MemoryUtil.memPutByte($$3 + 1L, a($$1));
         MemoryUtil.memPutByte($$3 + 2L, a($$2));
      }

      return this;
   }

   private static byte a(float $$0) {
      return (byte)((int)(bae.a($$0, -1.0F, 1.0F) * 127.0F) & 0xFF);
   }

   @Override
   public void a(float $$0, float $$1, float $$2, int $$3, float $$4, float $$5, int $$6, int $$7, float $$8, float $$9, float $$10) {
      if (this.i) {
         long $$11 = this.e();
         MemoryUtil.memPutFloat($$11 + 0L, $$0);
         MemoryUtil.memPutFloat($$11 + 4L, $$1);
         MemoryUtil.memPutFloat($$11 + 8L, $$2);
         a($$11 + 12L, $$3);
         MemoryUtil.memPutFloat($$11 + 16L, $$4);
         MemoryUtil.memPutFloat($$11 + 20L, $$5);
         long $$12;
         if (this.j) {
            b($$11 + 24L, $$6);
            $$12 = $$11 + 28L;
         } else {
            $$12 = $$11 + 24L;
         }

         b($$12 + 0L, $$7);
         MemoryUtil.memPutByte($$12 + 4L, a($$8));
         MemoryUtil.memPutByte($$12 + 5L, a($$9));
         MemoryUtil.memPutByte($$12 + 6L, a($$10));
      } else {
         fgu.super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }
}
