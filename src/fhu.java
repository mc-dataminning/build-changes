import java.util.Arrays;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fhu {
   private static final float b = 4.0F;
   private static final Vector3f c = new Vector3f(0.0F, 0.0F, -1.0F);
   private static final Vector3f d = new Vector3f(0.0F, 1.0F, 0.0F);
   private static final Vector3f e = new Vector3f(-1.0F, 0.0F, 0.0F);
   private boolean f;
   private ddl g;
   private bto h;
   private eys i = eys.c;
   private final je.a j = new je.a();
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

   public void a(ddl $$0, bto $$1, boolean $$2, boolean $$3, float $$4) {
      this.f = true;
      this.g = $$0;
      this.h = $$1;
      this.q = $$2;
      this.t = $$4;
      if ($$1.bW() && $$1.dg() instanceof cpy $$5 && $$5.m() instanceof cqg $$6 && $$6.u()) {
         eys $$7 = $$5.m($$1).d($$5.dq()).d($$1.l($$5)).e(new eys(0.0, (double)azd.h($$4, this.s, this.r), 0.0));
         this.a($$1.i($$4), $$1.h($$4));
         this.a($$6.e($$4).e($$7));
      } else {
         this.a($$1.i($$4), $$1.h($$4));
         this.a(
            azd.d((double)$$4, $$1.L, $$1.dx()), azd.d((double)$$4, $$1.M, $$1.dz()) + (double)azd.h($$4, this.s, this.r), azd.d((double)$$4, $$1.N, $$1.dD())
         );
      }

      if ($$2) {
         if ($$3) {
            this.a(this.o + 180.0F, -this.n);
         }

         float $$9 = $$1 instanceof buk $$8 ? $$8.ef() : 1.0F;
         this.a(-this.a(4.0F * $$9), 0.0F, 0.0F);
      } else if ($$1 instanceof buk && ((buk)$$1).fM()) {
         jj $$10 = ((buk)$$1).fO();
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
         eys $$6 = this.i.b((double)($$3 * 0.1F), (double)($$4 * 0.1F), (double)($$5 * 0.1F));
         eys $$7 = $$6.e(new eys(this.k).c((double)(-$$0)));
         eyq $$8 = this.g.a(new ddo($$6, $$7, ddo.a.c, ddo.b.a, this.h));
         if ($$8.d() != eyq.a.a) {
            float $$9 = (float)$$8.g().g(this.i);
            if ($$9 < azd.k($$0)) {
               $$0 = azd.c($$9);
            }
         }
      }

      return $$0;
   }

   protected void a(float $$0, float $$1, float $$2) {
      Vector3f $$3 = new Vector3f($$2, $$1, -$$0).rotate(this.p);
      this.a(new eys(this.i.d + (double)$$3.x, this.i.e + (double)$$3.y, this.i.f + (double)$$3.z));
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
      this.a(new eys($$0, $$1, $$2));
   }

   protected void a(eys $$0) {
      this.i = $$0;
      this.j.b($$0.d, $$0.e, $$0.f);
   }

   public eys b() {
      return this.i;
   }

   public je c() {
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

   public bto g() {
      return this.h;
   }

   public boolean h() {
      return this.f;
   }

   public boolean i() {
      return this.q;
   }

   public fhu.a j() {
      fil $$0 = fil.Q();
      double $$1 = (double)$$0.aP().l() / (double)$$0.aP().m();
      double $$2 = Math.tan((double)((float)$$0.n.aj().c().intValue() * (float) (Math.PI / 180.0)) / 2.0) * 0.05F;
      double $$3 = $$2 * $$1;
      eys $$4 = new eys(this.k).c(0.05F);
      eys $$5 = new eys(this.m).c($$3);
      eys $$6 = new eys(this.l).c($$2);
      return new fhu.a($$4, $$5, $$6);
   }

   public eqr k() {
      if (!this.f) {
         return eqr.d;
      } else {
         eqp $$0 = this.g.b_(this.j);
         if ($$0.a(awz.a) && this.i.e < (double)((float)this.j.v() + $$0.a(this.g, this.j))) {
            return eqr.b;
         } else {
            fhu.a $$1 = this.j();

            for (eys $$3 : Arrays.asList($$1.a, $$1.a(), $$1.b(), $$1.c(), $$1.d())) {
               eys $$4 = this.i.e($$3);
               je $$5 = je.a((jx)$$4);
               eqp $$6 = this.g.b_($$5);
               if ($$6.a(awz.b)) {
                  if ($$4.e <= (double)($$6.a(this.g, $$5) + (float)$$5.v())) {
                     return eqr.a;
                  }
               } else {
                  duo $$7 = this.g.a_($$5);
                  if ($$7.a(dhl.qP)) {
                     return eqr.c;
                  }
               }
            }

            return eqr.d;
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
      final eys a;
      private final eys b;
      private final eys c;

      a(eys $$0, eys $$1, eys $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public eys a() {
         return this.a.e(this.c).e(this.b);
      }

      public eys b() {
         return this.a.e(this.c).d(this.b);
      }

      public eys c() {
         return this.a.d(this.c).e(this.b);
      }

      public eys d() {
         return this.a.d(this.c).d(this.b);
      }

      public eys a(float $$0, float $$1) {
         return this.a.e(this.c.c((double)$$1)).d(this.b.c((double)$$0));
      }
   }
}
