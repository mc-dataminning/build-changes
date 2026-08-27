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

public class elm extends elq implements elo {
   private static final int f = 2097152;
   private static final Logger g = LogUtils.getLogger();
   private ByteBuffer h;
   private int i;
   private int j;
   private int k;
   private int l;
   @Nullable
   private elx m;
   private int n;
   private elw o;
   private elw.b p;
   private boolean q;
   private boolean r;
   private boolean s;
   @Nullable
   private Vector3f[] t;
   @Nullable
   private elz u;
   private boolean v;

   public elm(int $$0) {
      this.h = ekp.a($$0 * 6);
   }

   private void l() {
      this.d(this.o.b());
   }

   private void d(int $$0) {
      if (this.k + $$0 > this.h.capacity()) {
         int $$1 = this.h.capacity();
         int $$2 = $$1 + e($$0);
         g.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", $$1, $$2);
         ByteBuffer $$3 = ekp.a(this.h, $$2);
         $$3.rewind();
         this.h = $$3;
      }
   }

   private static int e(int $$0) {
      int $$1 = 2097152;
      if ($$0 == 0) {
         return $$1;
      } else {
         if ($$0 < 0) {
            $$1 *= -1;
         }

         int $$2 = $$0 % $$1;
         return $$2 == 0 ? $$0 : $$0 + $$1 - $$2;
      }
   }

   public void a(elz $$0) {
      if (this.p == elw.b.h) {
         this.u = $$0;
         if (this.t == null) {
            this.t = this.m();
         }
      }
   }

   public elm.c a() {
      return new elm.c(this.p, this.l, this.t, this.u);
   }

   public void a(elm.c $$0) {
      this.h.rewind();
      this.p = $$0.a;
      this.l = $$0.b;
      this.k = this.j;
      this.t = $$0.c;
      this.u = $$0.d;
      this.v = true;
   }

   public void a(elw.b $$0, elw $$1) {
      if (this.s) {
         throw new IllegalStateException("Already building!");
      } else {
         this.s = true;
         this.p = $$0;
         this.a($$1);
         this.m = (elx)$$1.c().get(0);
         this.n = 0;
         this.h.rewind();
      }
   }

   private void a(elw $$0) {
      if (this.o != $$0) {
         this.o = $$0;
         boolean $$1 = $$0 == elp.k;
         boolean $$2 = $$0 == elp.j;
         this.q = $$1 || $$2;
         this.r = $$1;
      }
   }

   private IntConsumer a(int $$0, elw.a $$1) {
      MutableInt $$2 = new MutableInt($$0);

      return switch ($$1) {
         case a -> $$1x -> this.h.putShort($$2.getAndAdd(2), (short)$$1x);
         case b -> $$1x -> this.h.putInt($$2.getAndAdd(4), $$1x);
      };
   }

   private Vector3f[] m() {
      FloatBuffer $$0 = this.h.asFloatBuffer();
      int $$1 = this.j / 4;
      int $$2 = this.o.a();
      int $$3 = $$2 * this.p.k;
      int $$4 = this.l / this.p.k;
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

   private void a(elw.a $$0) {
      if (this.t != null && this.u != null) {
         int[] $$1 = this.u.sort(this.t);
         IntConsumer $$2 = this.a(this.k, $$0);

         for (int $$3 : $$1) {
            $$2.accept($$3 * this.p.k + 0);
            $$2.accept($$3 * this.p.k + 1);
            $$2.accept($$3 * this.p.k + 2);
            $$2.accept($$3 * this.p.k + 2);
            $$2.accept($$3 * this.p.k + 3);
            $$2.accept($$3 * this.p.k + 0);
         }
      } else {
         throw new IllegalStateException("Sorting state uninitialized");
      }
   }

   public boolean b() {
      return this.l == 0;
   }

   @Nullable
   public elm.b c() {
      this.n();
      if (this.b()) {
         this.p();
         return null;
      } else {
         elm.b $$0 = this.o();
         this.p();
         return $$0;
      }
   }

   public elm.b d() {
      this.n();
      elm.b $$0 = this.o();
      this.p();
      return $$0;
   }

   private void n() {
      if (!this.s) {
         throw new IllegalStateException("Not building!");
      }
   }

   private elm.b o() {
      int $$0 = this.p.a(this.l);
      int $$1 = !this.v ? this.l * this.o.b() : 0;
      elw.a $$2 = elw.a.a($$0);
      boolean $$4;
      int $$5;
      if (this.t != null) {
         int $$3 = ary.d($$0 * $$2.d, 4);
         this.d($$3);
         this.a($$2);
         $$4 = false;
         this.k += $$3;
         $$5 = $$1 + $$3;
      } else {
         $$4 = true;
         $$5 = $$1;
      }

      int $$8 = this.j;
      this.j += $$5;
      this.i++;
      elm.a $$9 = new elm.a(this.o, this.l, $$0, this.p, $$2, this.v, $$4);
      return new elm.b($$8, $$9);
   }

   private void p() {
      this.s = false;
      this.l = 0;
      this.m = null;
      this.n = 0;
      this.t = null;
      this.u = null;
      this.v = false;
   }

   @Override
   public void a(int $$0, byte $$1) {
      this.h.put(this.k + $$0, $$1);
   }

   @Override
   public void a(int $$0, short $$1) {
      this.h.putShort(this.k + $$0, $$1);
   }

   @Override
   public void a(int $$0, float $$1) {
      this.h.putFloat(this.k + $$0, $$1);
   }

   @Override
   public void e() {
      if (this.n != 0) {
         throw new IllegalStateException("Not filled all elements of the vertex");
      } else {
         this.l++;
         this.l();
         if (this.p == elw.b.a || this.p == elw.b.b) {
            int $$0 = this.o.b();
            this.h.put(this.k, this.h, this.k - $$0, $$0);
            this.k += $$0;
            this.l++;
            this.l();
         }
      }
   }

   @Override
   public void f() {
      ImmutableList<elx> $$0 = this.o.c();
      this.n = (this.n + 1) % $$0.size();
      this.k = this.k + this.m.e();
      elx $$1 = (elx)$$0.get(this.n);
      this.m = $$1;
      if ($$1.b() == elx.b.e) {
         this.f();
      }

      if (this.a && this.m.b() == elx.b.c) {
         elo.super.a(this.b, this.c, this.d, this.e);
      }
   }

   @Override
   public elv a(int $$0, int $$1, int $$2, int $$3) {
      if (this.a) {
         throw new IllegalStateException();
      } else {
         return elo.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void a(
      float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, int $$9, int $$10, float $$11, float $$12, float $$13
   ) {
      if (this.a) {
         throw new IllegalStateException();
      } else if (this.q) {
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
         if (this.r) {
            this.a(24, (short)($$9 & 65535));
            this.a(26, (short)($$9 >> 16 & 65535));
            $$14 = 28;
         } else {
            $$14 = 24;
         }

         this.a($$14 + 0, (short)($$10 & 65535));
         this.a($$14 + 2, (short)($$10 >> 16 & 65535));
         this.a($$14 + 4, elo.a($$11));
         this.a($$14 + 5, elo.a($$12));
         this.a($$14 + 6, elo.a($$13));
         this.k += $$14 + 8;
         this.e();
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, $$13);
      }
   }

   void q() {
      if (this.i > 0 && --this.i == 0) {
         this.g();
      }
   }

   public void g() {
      if (this.i > 0) {
         g.warn("Clearing BufferBuilder with unused batches");
      }

      this.h();
   }

   public void h() {
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   @Override
   public elx i() {
      if (this.m == null) {
         throw new IllegalStateException("BufferBuilder not started");
      } else {
         return this.m;
      }
   }

   public boolean j() {
      return this.s;
   }

   ByteBuffer c(int $$0, int $$1) {
      return MemoryUtil.memSlice(this.h, $$0, $$1 - $$0);
   }

   public static record a(elw a, int b, int c, elw.b d, elw.a e, boolean f, boolean g) {

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

      public elw g() {
         return this.a;
      }

      public int h() {
         return this.b;
      }

      public int i() {
         return this.c;
      }

      public elw.b j() {
         return this.d;
      }

      public elw.a k() {
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
      private final elm.a c;
      private boolean d;

      b(int $$1, elm.a $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public ByteBuffer a() {
         int $$0 = this.b + this.c.b();
         int $$1 = this.b + this.c.c();
         return elm.this.c($$0, $$1);
      }

      public ByteBuffer b() {
         int $$0 = this.b + this.c.d();
         int $$1 = this.b + this.c.e();
         return elm.this.c($$0, $$1);
      }

      public elm.a c() {
         return this.c;
      }

      public boolean d() {
         return this.c.b == 0;
      }

      public void e() {
         if (this.d) {
            throw new IllegalStateException("Buffer has already been released!");
         } else {
            elm.this.q();
            this.d = true;
         }
      }
   }

   public static class c {
      final elw.b a;
      final int b;
      @Nullable
      final Vector3f[] c;
      @Nullable
      final elz d;

      c(elw.b $$0, int $$1, @Nullable Vector3f[] $$2, @Nullable elz $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }
   }
}
