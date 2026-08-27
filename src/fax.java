import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntConsumer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class fax extends fbb implements faz {
   private static final int f = 2097152;
   private static final Logger g = LogUtils.getLogger();
   private ByteBuffer h;
   private boolean i;
   private int j;
   private int k;
   private int l;
   private int m;
   @Nullable
   private fbi n;
   private int o;
   private fbh p;
   private fbh.b q;
   private boolean r;
   private boolean s;
   private boolean t;
   @Nullable
   private Vector3f[] u;
   @Nullable
   private fbk v;
   private boolean w;

   public fax(int $$0) {
      this.h = faa.a($$0);
   }

   private void m() {
      this.d(this.p.b());
   }

   private void d(int $$0) {
      if (this.l + $$0 > this.h.capacity()) {
         int $$1 = this.h.capacity();
         int $$2 = Math.min($$1, 2097152);
         int $$3 = $$1 + $$0;
         int $$4 = Math.max($$1 + $$2, $$3);
         g.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", $$1, $$4);
         ByteBuffer $$5 = faa.a(this.h, $$4);
         $$5.rewind();
         this.h = $$5;
      }
   }

   public void a(fbk $$0) {
      if (this.q == fbh.b.h) {
         this.v = $$0;
         if (this.u == null) {
            this.u = this.o();
         }
      }
   }

   public fax.c a() {
      return new fax.c(this.q, this.m, this.u, this.v);
   }

   private void n() {
      if (this.i) {
         throw new IllegalStateException("This BufferBuilder has been closed");
      }
   }

   public void a(fax.c $$0) {
      this.n();
      this.h.rewind();
      this.q = $$0.a;
      this.m = $$0.b;
      this.l = this.k;
      this.u = $$0.c;
      this.v = $$0.d;
      this.w = true;
   }

   public void a(fbh.b $$0, fbh $$1) {
      if (this.t) {
         throw new IllegalStateException("Already building!");
      } else {
         this.n();
         this.t = true;
         this.q = $$0;
         this.a($$1);
         this.n = (fbi)$$1.c().get(0);
         this.o = 0;
         this.h.rewind();
      }
   }

   private void a(fbh $$0) {
      if (this.p != $$0) {
         this.p = $$0;
         boolean $$1 = $$0 == fba.k;
         boolean $$2 = $$0 == fba.j;
         this.r = $$1 || $$2;
         this.s = $$1;
      }
   }

   private IntConsumer a(int $$0, fbh.a $$1) {
      MutableInt $$2 = new MutableInt($$0);

      return switch ($$1) {
         case a -> $$1x -> this.h.putShort($$2.getAndAdd(2), (short)$$1x);
         case b -> $$1x -> this.h.putInt($$2.getAndAdd(4), $$1x);
      };
   }

   private Vector3f[] o() {
      FloatBuffer $$0 = this.h.asFloatBuffer();
      int $$1 = this.k / 4;
      int $$2 = this.p.a();
      int $$3 = $$2 * this.q.k;
      int $$4 = this.m / this.q.k;
      Vector3f[] $$5 = new Vector3f[$$4];

      for (int $$6 = 0; $$6 < $$4; $$6++) {
         float $$7 = $$0.get($$1 + $$6 * $$3 + 0);
         float $$8 = $$0.get($$1 + $$6 * $$3 + 1);
         float $$9 = $$0.get($$1 + $$6 * $$3 + 2);
         float $$10 = $$0.get($$1 + $$6 * $$3 + $$2 * 2 + 0);
         float $$11 = $$0.get($$1 + $$6 * $$3 + $$2 * 2 + 1);
         float $$12 = $$0.get($$1 + $$6 * $$3 + $$2 * 2 + 2);
         float $$13 = ($$7 + $$10) / 2.0F;
         float $$14 = ($$8 + $$11) / 2.0F;
         float $$15 = ($$9 + $$12) / 2.0F;
         $$5[$$6] = new Vector3f($$13, $$14, $$15);
      }

      return $$5;
   }

   private void a(fbh.a $$0) {
      if (this.u != null && this.v != null) {
         int[] $$1 = this.v.sort(this.u);
         IntConsumer $$2 = this.a(this.l, $$0);

         for (int $$3 : $$1) {
            $$2.accept($$3 * this.q.k + 0);
            $$2.accept($$3 * this.q.k + 1);
            $$2.accept($$3 * this.q.k + 2);
            $$2.accept($$3 * this.q.k + 2);
            $$2.accept($$3 * this.q.k + 3);
            $$2.accept($$3 * this.q.k + 0);
         }
      } else {
         throw new IllegalStateException("Sorting state uninitialized");
      }
   }

   public boolean b() {
      return this.m == 0;
   }

   @Nullable
   public fax.b c() {
      this.p();
      if (this.b()) {
         this.r();
         return null;
      } else {
         fax.b $$0 = this.q();
         this.r();
         return $$0;
      }
   }

   public fax.b d() {
      this.p();
      fax.b $$0 = this.q();
      this.r();
      return $$0;
   }

   private void p() {
      if (!this.t) {
         throw new IllegalStateException("Not building!");
      }
   }

   private fax.b q() {
      int $$0 = this.q.a(this.m);
      int $$1 = !this.w ? this.m * this.p.b() : 0;
      fbh.a $$2 = fbh.a.a(this.m);
      boolean $$4;
      int $$5;
      if (this.u != null) {
         int $$3 = aym.d($$0 * $$2.d, 4);
         this.d($$3);
         this.a($$2);
         $$4 = false;
         this.l += $$3;
         $$5 = $$1 + $$3;
      } else {
         $$4 = true;
         $$5 = $$1;
      }

      int $$8 = this.k;
      this.k += $$5;
      this.j++;
      fax.a $$9 = new fax.a(this.p, this.m, $$0, this.q, $$2, this.w, $$4);
      return new fax.b($$8, $$9);
   }

   private void r() {
      this.t = false;
      this.m = 0;
      this.n = null;
      this.o = 0;
      this.u = null;
      this.v = null;
      this.w = false;
   }

   @Override
   public void a(int $$0, byte $$1) {
      this.h.put(this.l + $$0, $$1);
   }

   @Override
   public void a(int $$0, short $$1) {
      this.h.putShort(this.l + $$0, $$1);
   }

   @Override
   public void a(int $$0, float $$1) {
      this.h.putFloat(this.l + $$0, $$1);
   }

   @Override
   public void e() {
      if (this.o != 0) {
         throw new IllegalStateException("Not filled all elements of the vertex");
      } else {
         this.m++;
         this.m();
         if (this.q == fbh.b.a || this.q == fbh.b.b) {
            int $$0 = this.p.b();
            this.h.put(this.l, this.h, this.l - $$0, $$0);
            this.l += $$0;
            this.m++;
            this.m();
         }
      }
   }

   @Override
   public void f() {
      ImmutableList<fbi> $$0 = this.p.c();
      this.o = (this.o + 1) % $$0.size();
      this.l = this.l + this.n.e();
      fbi $$1 = (fbi)$$0.get(this.o);
      this.n = $$1;
      if ($$1.b() == fbi.b.e) {
         this.f();
      }

      if (this.a && this.n.b() == fbi.b.c) {
         faz.super.a(this.b, this.c, this.d, this.e);
      }
   }

   @Override
   public fbg a(int $$0, int $$1, int $$2, int $$3) {
      if (this.a) {
         throw new IllegalStateException();
      } else {
         return faz.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void a(
      float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, int $$9, int $$10, float $$11, float $$12, float $$13
   ) {
      if (this.a) {
         throw new IllegalStateException();
      } else if (this.r) {
         this.a(0, $$0);
         this.a(4, $$1);
         this.a(8, $$2);
         this.a(12, (byte)((int)($$3 * 255.0F)));
         this.a(13, (byte)((int)($$4 * 255.0F)));
         this.a(14, (byte)((int)($$5 * 255.0F)));
         this.a(15, (byte)((int)($$6 * 255.0F)));
         this.a(16, $$7);
         this.a(20, $$8);
         int $$14;
         if (this.s) {
            this.a(24, (short)($$9 & 65535));
            this.a(26, (short)($$9 >> 16 & 65535));
            $$14 = 28;
         } else {
            $$14 = 24;
         }

         this.a($$14 + 0, (short)($$10 & 65535));
         this.a($$14 + 2, (short)($$10 >> 16 & 65535));
         this.a($$14 + 4, faz.a($$11));
         this.a($$14 + 5, faz.a($$12));
         this.a($$14 + 6, faz.a($$13));
         this.l += $$14 + 8;
         this.e();
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, $$13);
      }
   }

   void s() {
      if (this.j > 0 && --this.j == 0) {
         this.g();
      }
   }

   public void g() {
      if (this.j > 0) {
         g.warn("Clearing BufferBuilder with unused batches");
      }

      this.h();
   }

   public void h() {
      this.j = 0;
      this.k = 0;
      this.l = 0;
   }

   public void i() {
      if (this.j > 0) {
         throw new IllegalStateException("BufferBuilder closed with unused batches");
      } else if (this.t) {
         throw new IllegalStateException("Cannot close BufferBuilder while it is building");
      } else if (!this.i) {
         this.i = true;
         faa.a(this.h);
      }
   }

   @Override
   public fbi j() {
      if (this.n == null) {
         throw new IllegalStateException("BufferBuilder not started");
      } else {
         return this.n;
      }
   }

   public boolean k() {
      return this.t;
   }

   ByteBuffer c(int $$0, int $$1) {
      return MemoryUtil.memSlice(this.h, $$0, $$1 - $$0);
   }

   public static record a(fbh a, int b, int c, fbh.b d, fbh.a e, boolean f, boolean g) {

      public int a() {
         return this.b * this.a.b();
      }

      public int b() {
         return 0;
      }

      public int c() {
         return this.a();
      }

      public int d() {
         return this.f ? 0 : this.c();
      }

      public int e() {
         return this.d() + this.n();
      }

      private int n() {
         return this.g ? 0 : this.c * this.e.d;
      }

      public int f() {
         return this.e();
      }

      public fbh g() {
         return this.a;
      }

      public int h() {
         return this.b;
      }

      public int i() {
         return this.c;
      }

      public fbh.b j() {
         return this.d;
      }

      public fbh.a k() {
         return this.e;
      }

      public boolean l() {
         return this.f;
      }

      public boolean m() {
         return this.g;
      }
   }

   public class b {
      private final int b;
      private final fax.a c;
      private boolean d;

      b(int $$1, fax.a $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      public ByteBuffer a() {
         if (this.c.l()) {
            return null;
         } else {
            int $$0 = this.b + this.c.b();
            int $$1 = this.b + this.c.c();
            return fax.this.c($$0, $$1);
         }
      }

      @Nullable
      public ByteBuffer b() {
         if (this.c.m()) {
            return null;
         } else {
            int $$0 = this.b + this.c.d();
            int $$1 = this.b + this.c.e();
            return fax.this.c($$0, $$1);
         }
      }

      public fax.a c() {
         return this.c;
      }

      public boolean d() {
         return this.c.b == 0;
      }

      public void e() {
         if (this.d) {
            throw new IllegalStateException("Buffer has already been released!");
         } else {
            fax.this.s();
            this.d = true;
         }
      }
   }

   public static class c {
      final fbh.b a;
      final int b;
      @Nullable
      final Vector3f[] c;
      @Nullable
      final fbk d;

      c(fbh.b $$0, int $$1, @Nullable Vector3f[] $$2, @Nullable fbk $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }
   }
}
