import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class eab extends dzx implements bvm {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jp<dak> q = jp.a(27, dak.l);
   private int r;
   private eab.a s = eab.a.a;
   private float t;
   private float u;
   @Nullable
   private final czi v;

   public eab(@Nullable czi $$0, iw $$1, ebq $$2) {
      super(dyq.y, $$1, $$2);
      this.v = $$0;
   }

   public eab(iw $$0, ebq $$1) {
      super(dyq.y, $$0, $$1);
      this.v = $$1.b() instanceof dux $$2 ? $$2.b() : null;
   }

   public static void a(dkj $$0, iw $$1, ebq $$2, eab $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dkj $$0, iw $$1, ebq $$2) {
      this.u = this.t;
      switch (this.s) {
         case a:
            this.t = 0.0F;
            break;
         case b:
            this.t += 0.1F;
            if (this.u == 0.0F) {
               d($$0, $$1, $$2);
            }

            if (this.t >= 1.0F) {
               this.s = eab.a.c;
               this.t = 1.0F;
               d($$0, $$1, $$2);
            }

            this.c($$0, $$1, $$2);
            break;
         case c:
            this.t = 1.0F;
            break;
         case d:
            this.t -= 0.1F;
            if (this.u == 1.0F) {
               d($$0, $$1, $$2);
            }

            if (this.t <= 0.0F) {
               this.s = eab.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public eab.a k() {
      return this.s;
   }

   public ffx a(ebq $$0) {
      fgc $$1 = new fgc(0.5, 0.0, 0.5);
      return cpq.a(1.0F, $$0.c(dux.c), 0.5F * this.a(1.0F), $$1);
   }

   private void c(dkj $$0, iw $$1, ebq $$2) {
      if ($$2.b() instanceof dux) {
         jc $$3 = $$2.c(dux.c);
         ffx $$4 = cpq.a(1.0F, $$3, this.u, this.t, $$1.c());
         List<bxe> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bxe $$6 : $$5) {
               if ($$6.j_() != eyf.d) {
                  $$6.a(byj.d, new fgc(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
               }
            }
         }
      }
   }

   @Override
   public int b() {
      return this.q.size();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.r = $$1;
         if ($$1 == 0) {
            this.s = eab.a.d;
         }

         if ($$1 == 1) {
            this.s = eab.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dkj $$0, iw $$1, ebq $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void a(iw $$0, ebq $$1) {
   }

   @Override
   public void c_(csi $$0) {
      if (!this.p && !$$0.aa_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, egq.k, this.o);
            this.n.a(null, this.o, awy.xD, awz.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(csi $$0) {
      if (!this.p && !$$0.aa_()) {
         this.r--;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, egq.j, this.o);
            this.n.a(null, this.o, awy.xC, awz.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected xg j() {
      return xg.c("container.shulkerBox");
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         buw.a($$0, this.q, false, $$1);
      }
   }

   public void e(ua $$0, ji.a $$1) {
      this.q = jp.a(this.b(), dak.l);
      if (!this.b_($$0)) {
         buw.b($$0, this.q, $$1);
      }
   }

   @Override
   protected jp<dak> f() {
      return this.q;
   }

   @Override
   protected void a(jp<dak> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(jc $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, dak $$1, @Nullable jc $$2) {
      return !(dno.a($$1.h()) instanceof dux);
   }

   @Override
   public boolean b(int $$0, dak $$1, jc $$2) {
      return true;
   }

   public float a(float $$0) {
      return azz.h($$0, this.u, this.t);
   }

   @Nullable
   public czi s() {
      return this.v;
   }

   @Override
   protected cwb a(int $$0, csh $$1) {
      return new cxw($$0, $$1, this);
   }

   public boolean t() {
      return this.s == eab.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
