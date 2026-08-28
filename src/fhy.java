import java.util.Arrays;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fhy {
   private static final float b = 4.0F;
   private static final Vector3f c = new Vector3f(0.0F, 0.0F, -1.0F);
   private static final Vector3f d = new Vector3f(0.0F, 1.0F, 0.0F);
   private static final Vector3f e = new Vector3f(-1.0F, 0.0F, 0.0F);
   private boolean f;
   private ddo g;
   private btr h;
   private eyw i = eyw.c;
   private final jf.a j = new jf.a();
   private final Vector3f k = new Vector3f(c);
   private final Vector3f l = new Vector3f(d);
   private final Vector3f m = new Vector3f(e);
   private float n;
   private float o;
   private final Quaternionf p = new Quaternionf();
   private boolean q;
   private float r;
   private float s;
   private float t;
   public static final float a = 0.083333336F;

   public void a(ddo $$0, btr $$1, boolean $$2, boolean $$3, float $$4) {
      this.f = true;
      this.g = $$0;
      this.h = $$1;
      this.q = $$2;
      this.t = $$4;
      if ($$1.bW() && $$1.dg() instanceof cqb $$5 && $$5.m() instanceof cqj $$6 && $$6.u()) {
         eyw $$7 = $$5.m($$1).d($$5.dq()).d($$1.l($$5)).e(new eyw(0.0, (double)azf.h($$4, this.s, this.r), 0.0));
         this.a($$1.i($$4), $$1.h($$4));
         this.a($$6.e($$4).e($$7));
      } else {
         this.a($$1.i($$4), $$1.h($$4));
         this.a(
            azf.d((double)$$4, $$1.L, $$1.dx()), azf.d((double)$$4, $$1.M, $$1.dz()) + (double)azf.h($$4, this.s, this.r), azf.d((double)$$4, $$1.N, $$1.dD())
         );
      }

      if ($$2) {
         if ($$3) {
            this.a(this.o + 180.0F, -this.n);
         }

         float $$9 = $$1 instanceof bun $$8 ? $$8.eg() : 1.0F;
         this.a(-this.a(4.0F * $$9), 0.0F, 0.0F);
      } else if ($$1 instanceof bun && ((bun)$$1).fN()) {
         jk $$10 = ((bun)$$1).fP();
         this.a($$10 != null ? $$10.p() - 180.0F : 0.0F, 0.0F);
         this.a(0.0F, 0.3F, 0.0F);
      }
   }

   public void a() {
      if (this.h != null) {
         this.s = this.r;
         this.r = this.r + (this.h.cP() - this.r) * 0.5F;
      }
   }

   private float a(float $$0) {
      float $$1 = 0.1F;

      for (int $$2 = 0; $$2 < 8; $$2++) {
         float $$3 = (float)(($$2 & 1) * 2 - 1);
         float $$4 = (float)(($$2 >> 1 & 1) * 2 - 1);
         float $$5 = (float)(($$2 >> 2 & 1) * 2 - 1);
         eyw $$6 = this.i.b((double)($$3 * 0.1F), (double)($$4 * 0.1F), (double)($$5 * 0.1F));
         eyw $$7 = $$6.e(new eyw(this.k).c((double)(-$$0)));
         eyu $$8 = this.g.a(new ddr($$6, $$7, ddr.a.c, ddr.b.a, this.h));
         if ($$8.d() != eyu.a.a) {
            float $$9 = (float)$$8.g().g(this.i);
            if ($$9 < azf.l($$0)) {
               $$0 = azf.c($$9);
            }
         }
      }

      return $$0;
   }

   protected void a(float $$0, float $$1, float $$2) {
      Vector3f $$3 = new Vector3f($$2, $$1, -$$0).rotate(this.p);
      this.a(new eyw(this.i.d + (double)$$3.x, this.i.e + (double)$$3.y, this.i.f + (double)$$3.z));
   }

   protected void a(float $$0, float $$1) {
      this.n = $$1;
      this.o = $$0;
      this.p.rotationYXZ((float) Math.PI - $$0 * (float) (Math.PI / 180.0), -$$1 * (float) (Math.PI / 180.0), 0.0F);
      c.rotate(this.p, this.k);
      d.rotate(this.p, this.l);
      e.rotate(this.p, this.m);
   }

   protected void a(double $$0, double $$1, double $$2) {
      this.a(new eyw($$0, $$1, $$2));
   }

   protected void a(eyw $$0) {
      this.i = $$0;
      this.j.b($$0.d, $$0.e, $$0.f);
   }

   public eyw b() {
      return this.i;
   }

   public jf c() {
      return this.j;
   }

   public float d() {
      return this.n;
   }

   public float e() {
      return this.o;
   }

   public Quaternionf f() {
      return this.p;
   }

   public btr g() {
      return this.h;
   }

   public boolean h() {
      return this.f;
   }

   public boolean i() {
      return this.q;
   }

   public fhy.a j() {
      fip $$0 = fip.Q();
      double $$1 = (double)$$0.aP().l() / (double)$$0.aP().m();
      double $$2 = Math.tan((double)((float)$$0.n.aj().c().intValue() * (float) (Math.PI / 180.0)) / 2.0) * 0.05F;
      double $$3 = $$2 * $$1;
      eyw $$4 = new eyw(this.k).c(0.05F);
      eyw $$5 = new eyw(this.m).c($$3);
      eyw $$6 = new eyw(this.l).c($$2);
      return new fhy.a($$4, $$5, $$6);
   }

   public eqv k() {
      if (!this.f) {
         return eqv.d;
      } else {
         eqt $$0 = this.g.b_(this.j);
         if ($$0.a(axb.a) && this.i.e < (double)((float)this.j.v() + $$0.a(this.g, this.j))) {
            return eqv.b;
         } else {
            fhy.a $$1 = this.j();

            for (eyw $$3 : Arrays.asList($$1.a, $$1.a(), $$1.b(), $$1.c(), $$1.d())) {
               eyw $$4 = this.i.e($$3);
               jf $$5 = jf.a((jy)$$4);
               eqt $$6 = this.g.b_($$5);
               if ($$6.a(axb.b)) {
                  if ($$4.e <= (double)($$6.a(this.g, $$5) + (float)$$5.v())) {
                     return eqv.a;
                  }
               } else {
                  dus $$7 = this.g.a_($$5);
                  if ($$7.a(dho.qP)) {
                     return eqv.c;
                  }
               }
            }

            return eqv.d;
         }
      }
   }

   public final Vector3f l() {
      return this.k;
   }

   public final Vector3f m() {
      return this.l;
   }

   public final Vector3f n() {
      return this.m;
   }

   public void o() {
      this.g = null;
      this.h = null;
      this.f = false;
   }

   public float p() {
      return this.t;
   }

   public static class a {
      final eyw a;
      private final eyw b;
      private final eyw c;

      a(eyw $$0, eyw $$1, eyw $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public eyw a() {
         return this.a.e(this.c).e(this.b);
      }

      public eyw b() {
         return this.a.e(this.c).d(this.b);
      }

      public eyw c() {
         return this.a.d(this.c).e(this.b);
      }

      public eyw d() {
         return this.a.d(this.c).d(this.b);
      }

      public eyw a(float $$0, float $$1) {
         return this.a.e(this.c.c((double)$$1)).d(this.b.c((double)$$0));
      }
   }
}
