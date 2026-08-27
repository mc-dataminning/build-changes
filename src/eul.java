import java.util.Arrays;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class eul {
   private boolean b;
   private cso c;
   private blp d;
   private elm e = elm.b;
   private final hx.a f = new hx.a();
   private final Vector3f g = new Vector3f(0.0F, 0.0F, 1.0F);
   private final Vector3f h = new Vector3f(0.0F, 1.0F, 0.0F);
   private final Vector3f i = new Vector3f(1.0F, 0.0F, 0.0F);
   private float j;
   private float k;
   private final Quaternionf l = new Quaternionf(0.0F, 0.0F, 0.0F, 1.0F);
   private boolean m;
   private float n;
   private float o;
   private float p;
   public static final float a = 0.083333336F;

   public void a(cso $$0, blp $$1, boolean $$2, boolean $$3, float $$4) {
      this.b = true;
      this.c = $$0;
      this.d = $$1;
      this.m = $$2;
      this.p = $$4;
      this.a($$1.h($$4), $$1.g($$4));
      this.b(aui.d((double)$$4, $$1.K, $$1.dr()), aui.d((double)$$4, $$1.L, $$1.dt()) + (double)aui.i($$4, this.o, this.n), aui.d((double)$$4, $$1.M, $$1.dx()));
      if ($$2) {
         if ($$3) {
            this.a(this.k + 180.0F, -this.j);
         }

         this.a(-this.a(4.0), 0.0, 0.0);
      } else if ($$1 instanceof bmf && ((bmf)$$1).fD()) {
         ic $$5 = ((bmf)$$1).fF();
         this.a($$5 != null ? $$5.p() - 180.0F : 0.0F, 0.0F);
         this.a(0.0, 0.3, 0.0);
      }
   }

   public void a() {
      if (this.d != null) {
         this.o = this.n;
         this.n = this.n + (this.d.cI() - this.n) * 0.5F;
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
         elm $$5 = this.e.b((double)$$2, (double)$$3, (double)$$4);
         elm $$6 = new elm(
            this.e.c - (double)this.g.x() * $$0 + (double)$$2,
            this.e.d - (double)this.g.y() * $$0 + (double)$$3,
            this.e.e - (double)this.g.z() * $$0 + (double)$$4
         );
         elk $$7 = this.c.a(new csr($$5, $$6, csr.a.c, csr.b.a, this.d));
         if ($$7.c() != elk.a.a) {
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
      this.a(new elm(this.e.c + $$3, this.e.d + $$4, this.e.e + $$5));
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
      this.a(new elm($$0, $$1, $$2));
   }

   protected void a(elm $$0) {
      this.e = $$0;
      this.f.b($$0.c, $$0.d, $$0.e);
   }

   public elm b() {
      return this.e;
   }

   public hx c() {
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

   public blp g() {
      return this.d;
   }

   public boolean h() {
      return this.b;
   }

   public boolean i() {
      return this.m;
   }

   public eul.a j() {
      eva $$0 = eva.N();
      double $$1 = (double)$$0.aL().k() / (double)$$0.aL().l();
      double $$2 = Math.tan((double)((float)$$0.m.ae().c().intValue() * (float) (Math.PI / 180.0)) / 2.0) * 0.05F;
      double $$3 = $$2 * $$1;
      elm $$4 = new elm(this.g).a(0.05F);
      elm $$5 = new elm(this.i).a($$3);
      elm $$6 = new elm(this.h).a($$2);
      return new eul.a($$4, $$5, $$6);
   }

   public eem k() {
      if (!this.b) {
         return eem.d;
      } else {
         eek $$0 = this.c.b_(this.f);
         if ($$0.a(asg.a) && this.e.d < (double)((float)this.f.v() + $$0.a(this.c, this.f))) {
            return eem.b;
         } else {
            eul.a $$1 = this.j();

            for (elm $$3 : Arrays.asList($$1.a, $$1.a(), $$1.b(), $$1.c(), $$1.d())) {
               elm $$4 = this.e.e($$3);
               hx $$5 = hx.a($$4);
               eek $$6 = this.c.b_($$5);
               if ($$6.a(asg.b)) {
                  if ($$4.d <= (double)($$6.a(this.c, $$5) + (float)$$5.v())) {
                     return eem.a;
                  }
               } else {
                  dja $$7 = this.c.a_($$5);
                  if ($$7.a(cwl.qP)) {
                     return eem.c;
                  }
               }
            }

            return eem.d;
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

   public float p() {
      return this.p;
   }

   public static class a {
      final elm a;
      private final elm b;
      private final elm c;

      a(elm $$0, elm $$1, elm $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public elm a() {
         return this.a.e(this.c).e(this.b);
      }

      public elm b() {
         return this.a.e(this.c).d(this.b);
      }

      public elm c() {
         return this.a.d(this.c).e(this.b);
      }

      public elm d() {
         return this.a.d(this.c).d(this.b);
      }

      public elm a(float $$0, float $$1) {
         return this.a.e(this.c.a((double)$$1)).d(this.b.a((double)$$0));
      }
   }
}
