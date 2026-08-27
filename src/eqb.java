import java.util.Arrays;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class eqb {
   private boolean b;
   private cow c;
   private bil d;
   private ehi e = ehi.b;
   private final gw.a f = new gw.a();
   private final Vector3f g = new Vector3f(0.0F, 0.0F, 1.0F);
   private final Vector3f h = new Vector3f(0.0F, 1.0F, 0.0F);
   private final Vector3f i = new Vector3f(1.0F, 0.0F, 0.0F);
   private float j;
   private float k;
   private final Quaternionf l = new Quaternionf(0.0F, 0.0F, 0.0F, 1.0F);
   private boolean m;
   private float n;
   private float o;
   public static final float a = 0.083333336F;

   public void a(cow $$0, bil $$1, boolean $$2, boolean $$3, float $$4) {
      this.b = true;
      this.c = $$0;
      this.d = $$1;
      this.m = $$2;
      this.a($$1.h($$4), $$1.g($$4));
      this.b(ars.d((double)$$4, $$1.K, $$1.dp()), ars.d((double)$$4, $$1.L, $$1.dr()) + (double)ars.i($$4, this.o, this.n), ars.d((double)$$4, $$1.M, $$1.dv()));
      if ($$2) {
         if ($$3) {
            this.a(this.k + 180.0F, -this.j);
         }

         this.a(-this.a(4.0), 0.0, 0.0);
      } else if ($$1 instanceof bjb && ((bjb)$$1).fB()) {
         hc $$5 = ((bjb)$$1).fD();
         this.a($$5 != null ? $$5.p() - 180.0F : 0.0F, 0.0F);
         this.a(0.0, 0.3, 0.0);
      }
   }

   public void a() {
      if (this.d != null) {
         this.o = this.n;
         this.n = this.n + (this.d.cH() - this.n) * 0.5F;
      }
   }

   private double a(double $$0) {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         float $$2 = (float)(($$1 & 1) * 2 - 1);
         float $$3 = (float)(($$1 >> 1 & 1) * 2 - 1);
         float $$4 = (float)(($$1 >> 2 & 1) * 2 - 1);
         $$2 *= 0.1F;
         $$3 *= 0.1F;
         $$4 *= 0.1F;
         ehi $$5 = this.e.b((double)$$2, (double)$$3, (double)$$4);
         ehi $$6 = new ehi(
            this.e.c - (double)this.g.x() * $$0 + (double)$$2,
            this.e.d - (double)this.g.y() * $$0 + (double)$$3,
            this.e.e - (double)this.g.z() * $$0 + (double)$$4
         );
         ehg $$7 = this.c.a(new coz($$5, $$6, coz.a.c, coz.b.a, this.d));
         if ($$7.c() != ehg.a.a) {
            double $$8 = $$7.e().f(this.e);
            if ($$8 < $$0) {
               $$0 = $$8;
            }
         }
      }

      return $$0;
   }

   protected void a(double $$0, double $$1, double $$2) {
      double $$3 = (double)this.g.x() * $$0 + (double)this.h.x() * $$1 + (double)this.i.x() * $$2;
      double $$4 = (double)this.g.y() * $$0 + (double)this.h.y() * $$1 + (double)this.i.y() * $$2;
      double $$5 = (double)this.g.z() * $$0 + (double)this.h.z() * $$1 + (double)this.i.z() * $$2;
      this.a(new ehi(this.e.c + $$3, this.e.d + $$4, this.e.e + $$5));
   }

   protected void a(float $$0, float $$1) {
      this.j = $$1;
      this.k = $$0;
      this.l.rotationYXZ(-$$0 * (float) (Math.PI / 180.0), $$1 * (float) (Math.PI / 180.0), 0.0F);
      this.g.set(0.0F, 0.0F, 1.0F).rotate(this.l);
      this.h.set(0.0F, 1.0F, 0.0F).rotate(this.l);
      this.i.set(1.0F, 0.0F, 0.0F).rotate(this.l);
   }

   protected void b(double $$0, double $$1, double $$2) {
      this.a(new ehi($$0, $$1, $$2));
   }

   protected void a(ehi $$0) {
      this.e = $$0;
      this.f.b($$0.c, $$0.d, $$0.e);
   }

   public ehi b() {
      return this.e;
   }

   public gw c() {
      return this.f;
   }

   public float d() {
      return this.j;
   }

   public float e() {
      return this.k;
   }

   public Quaternionf f() {
      return this.l;
   }

   public bil g() {
      return this.d;
   }

   public boolean h() {
      return this.b;
   }

   public boolean i() {
      return this.m;
   }

   public eqb.a j() {
      eqq $$0 = eqq.O();
      double $$1 = (double)$$0.aM().k() / (double)$$0.aM().l();
      double $$2 = Math.tan((double)((float)$$0.m.ad().c().intValue() * (float) (Math.PI / 180.0)) / 2.0) * 0.05F;
      double $$3 = $$2 * $$1;
      ehi $$4 = new ehi(this.g).a(0.05F);
      ehi $$5 = new ehi(this.i).a($$3);
      ehi $$6 = new ehi(this.h).a($$2);
      return new eqb.a($$4, $$5, $$6);
   }

   public eaj k() {
      if (!this.b) {
         return eaj.d;
      } else {
         eah $$0 = this.c.b_(this.f);
         if ($$0.a(apt.a) && this.e.d < (double)((float)this.f.v() + $$0.a(this.c, this.f))) {
            return eaj.b;
         } else {
            eqb.a $$1 = this.j();

            for (ehi $$3 : Arrays.asList($$1.a, $$1.a(), $$1.b(), $$1.c(), $$1.d())) {
               ehi $$4 = this.e.e($$3);
               gw $$5 = gw.a($$4);
               eah $$6 = this.c.b_($$5);
               if ($$6.a(apt.b)) {
                  if ($$4.d <= (double)($$6.a(this.c, $$5) + (float)$$5.v())) {
                     return eaj.a;
                  }
               } else {
                  dfe $$7 = this.c.a_($$5);
                  if ($$7.a(csr.qC)) {
                     return eaj.c;
                  }
               }
            }

            return eaj.d;
         }
      }
   }

   public final Vector3f l() {
      return this.g;
   }

   public final Vector3f m() {
      return this.h;
   }

   public final Vector3f n() {
      return this.i;
   }

   public void o() {
      this.c = null;
      this.d = null;
      this.b = false;
   }

   public static class a {
      final ehi a;
      private final ehi b;
      private final ehi c;

      a(ehi $$0, ehi $$1, ehi $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ehi a() {
         return this.a.e(this.c).e(this.b);
      }

      public ehi b() {
         return this.a.e(this.c).d(this.b);
      }

      public ehi c() {
         return this.a.d(this.c).e(this.b);
      }

      public ehi d() {
         return this.a.d(this.c).d(this.b);
      }

      public ehi a(float $$0, float $$1) {
         return this.a.e(this.c.a((double)$$1)).d(this.b.a((double)$$0));
      }
   }
}
