import java.util.Arrays;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ffu {
   private static final float b = 4.0F;
   private boolean c;
   private dbg d;
   private brv e;
   private ewu f = ewu.b;
   private final ir.a g = new ir.a();
   private final Vector3f h = new Vector3f(0.0F, 0.0F, 1.0F);
   private final Vector3f i = new Vector3f(0.0F, 1.0F, 0.0F);
   private final Vector3f j = new Vector3f(1.0F, 0.0F, 0.0F);
   private float k;
   private float l;
   private final Quaternionf m = new Quaternionf(0.0F, 0.0F, 0.0F, 1.0F);
   private boolean n;
   private float o;
   private float p;
   private float q;
   public static final float a = 0.083333336F;

   public void a(dbg $$0, brv $$1, boolean $$2, boolean $$3, float $$4) {
      this.c = true;
      this.d = $$0;
      this.e = $$1;
      this.n = $$2;
      this.q = $$4;
      this.a($$1.h($$4), $$1.g($$4));
      this.b(aym.d((double)$$4, $$1.M, $$1.dz()), aym.d((double)$$4, $$1.N, $$1.dB()) + (double)aym.i($$4, this.p, this.o), aym.d((double)$$4, $$1.O, $$1.dF()));
      if ($$2) {
         if ($$3) {
            this.a(this.l + 180.0F, -this.k);
         }

         float $$6 = $$1 instanceof bso $$5 ? $$5.em() : 1.0F;
         this.a(-this.a((double)(4.0F * $$6)), 0.0, 0.0);
      } else if ($$1 instanceof bso && ((bso)$$1).fU()) {
         iw $$7 = ((bso)$$1).fW();
         this.a($$7 != null ? $$7.p() - 180.0F : 0.0F, 0.0F);
         this.a(0.0, 0.3, 0.0);
      }
   }

   public void a() {
      if (this.e != null) {
         this.p = this.o;
         this.o = this.o + (this.e.cQ() - this.o) * 0.5F;
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
         ewu $$5 = this.f.b((double)$$2, (double)$$3, (double)$$4);
         ewu $$6 = new ewu(
            this.f.c - (double)this.h.x() * $$0 + (double)$$2,
            this.f.d - (double)this.h.y() * $$0 + (double)$$3,
            this.f.e - (double)this.h.z() * $$0 + (double)$$4
         );
         ews $$7 = this.d.a(new dbj($$5, $$6, dbj.a.c, dbj.b.a, this.e));
         if ($$7.c() != ews.a.a) {
            double $$8 = $$7.e().f(this.f);
            if ($$8 < $$0) {
               $$0 = $$8;
            }
         }
      }

      return $$0;
   }

   protected void a(double $$0, double $$1, double $$2) {
      double $$3 = (double)this.h.x() * $$0 + (double)this.i.x() * $$1 + (double)this.j.x() * $$2;
      double $$4 = (double)this.h.y() * $$0 + (double)this.i.y() * $$1 + (double)this.j.y() * $$2;
      double $$5 = (double)this.h.z() * $$0 + (double)this.i.z() * $$1 + (double)this.j.z() * $$2;
      this.a(new ewu(this.f.c + $$3, this.f.d + $$4, this.f.e + $$5));
   }

   protected void a(float $$0, float $$1) {
      this.k = $$1;
      this.l = $$0;
      this.m.rotationYXZ(-$$0 * (float) (Math.PI / 180.0), $$1 * (float) (Math.PI / 180.0), 0.0F);
      this.h.set(0.0F, 0.0F, 1.0F).rotate(this.m);
      this.i.set(0.0F, 1.0F, 0.0F).rotate(this.m);
      this.j.set(1.0F, 0.0F, 0.0F).rotate(this.m);
   }

   protected void b(double $$0, double $$1, double $$2) {
      this.a(new ewu($$0, $$1, $$2));
   }

   protected void a(ewu $$0) {
      this.f = $$0;
      this.g.b($$0.c, $$0.d, $$0.e);
   }

   public ewu b() {
      return this.f;
   }

   public ir c() {
      return this.g;
   }

   public float d() {
      return this.k;
   }

   public float e() {
      return this.l;
   }

   public Quaternionf f() {
      return this.m;
   }

   public brv g() {
      return this.e;
   }

   public boolean h() {
      return this.c;
   }

   public boolean i() {
      return this.n;
   }

   public ffu.a j() {
      fgj $$0 = fgj.Q();
      double $$1 = (double)$$0.aP().k() / (double)$$0.aP().l();
      double $$2 = Math.tan((double)((float)$$0.m.ah().c().intValue() * (float) (Math.PI / 180.0)) / 2.0) * 0.05F;
      double $$3 = $$2 * $$1;
      ewu $$4 = new ewu(this.h).a(0.05F);
      ewu $$5 = new ewu(this.j).a($$3);
      ewu $$6 = new ewu(this.i).a($$2);
      return new ffu.a($$4, $$5, $$6);
   }

   public epg k() {
      if (!this.c) {
         return epg.d;
      } else {
         epe $$0 = this.d.b_(this.g);
         if ($$0.a(awj.a) && this.f.d < (double)((float)this.g.v() + $$0.a(this.d, this.g))) {
            return epg.b;
         } else {
            ffu.a $$1 = this.j();

            for (ewu $$3 : Arrays.asList($$1.a, $$1.a(), $$1.b(), $$1.c(), $$1.d())) {
               ewu $$4 = this.f.e($$3);
               ir $$5 = ir.a($$4);
               epe $$6 = this.d.b_($$5);
               if ($$6.a(awj.b)) {
                  if ($$4.d <= (double)($$6.a(this.d, $$5) + (float)$$5.v())) {
                     return epg.a;
                  }
               } else {
                  dtc $$7 = this.d.a_($$5);
                  if ($$7.a(dfe.sa)) {
                     return epg.c;
                  }
               }
            }

            return epg.d;
         }
      }
   }

   public final Vector3f l() {
      return this.h;
   }

   public final Vector3f m() {
      return this.i;
   }

   public final Vector3f n() {
      return this.j;
   }

   public void o() {
      this.d = null;
      this.e = null;
      this.c = false;
   }

   public float p() {
      return this.q;
   }

   public static class a {
      final ewu a;
      private final ewu b;
      private final ewu c;

      a(ewu $$0, ewu $$1, ewu $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ewu a() {
         return this.a.e(this.c).e(this.b);
      }

      public ewu b() {
         return this.a.e(this.c).d(this.b);
      }

      public ewu c() {
         return this.a.d(this.c).e(this.b);
      }

      public ewu d() {
         return this.a.d(this.c).d(this.b);
      }

      public ewu a(float $$0, float $$1) {
         return this.a.e(this.c.a((double)$$1)).d(this.b.a((double)$$0));
      }
   }
}
