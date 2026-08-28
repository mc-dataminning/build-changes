import java.util.Arrays;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ffs {
   private static final float b = 4.0F;
   private static final Vector3f c = new Vector3f(0.0F, 0.0F, -1.0F);
   private static final Vector3f d = new Vector3f(0.0F, 1.0F, 0.0F);
   private static final Vector3f e = new Vector3f(-1.0F, 0.0F, 0.0F);
   private boolean f;
   private dca g;
   private bsq h;
   private eww i = eww.b;
   private final jd.a j = new jd.a();
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

   public void a(dca $$0, bsq $$1, boolean $$2, boolean $$3, float $$4) {
      this.f = true;
      this.g = $$0;
      this.h = $$1;
      this.q = $$2;
      this.t = $$4;
      this.a($$1.i($$4), $$1.h($$4));
      this.a(ayn.d((double)$$4, $$1.L, $$1.dv()), ayn.d((double)$$4, $$1.M, $$1.dx()) + (double)ayn.i($$4, this.s, this.r), ayn.d((double)$$4, $$1.N, $$1.dB()));
      if ($$2) {
         if ($$3) {
            this.a(this.o + 180.0F, -this.n);
         }

         float $$6 = $$1 instanceof btl $$5 ? $$5.ec() : 1.0F;
         this.a(-this.a(4.0F * $$6), 0.0F, 0.0F);
      } else if ($$1 instanceof btl && ((btl)$$1).fI()) {
         ji $$7 = ((btl)$$1).fK();
         this.a($$7 != null ? $$7.p() - 180.0F : 0.0F, 0.0F);
         this.a(0.0F, 0.3F, 0.0F);
      }
   }

   public void a() {
      if (this.h != null) {
         this.s = this.r;
         this.r = this.r + (this.h.cM() - this.r) * 0.5F;
      }
   }

   private float a(float $$0) {
      float $$1 = 0.1F;

      for (int $$2 = 0; $$2 < 8; $$2++) {
         float $$3 = (float)(($$2 & 1) * 2 - 1);
         float $$4 = (float)(($$2 >> 1 & 1) * 2 - 1);
         float $$5 = (float)(($$2 >> 2 & 1) * 2 - 1);
         eww $$6 = this.i.b((double)($$3 * 0.1F), (double)($$4 * 0.1F), (double)($$5 * 0.1F));
         eww $$7 = $$6.e(new eww(this.k).a((double)(-$$0)));
         ewu $$8 = this.g.a(new dcd($$6, $$7, dcd.a.c, dcd.b.a, this.h));
         if ($$8.c() != ewu.a.a) {
            float $$9 = (float)$$8.e().g(this.i);
            if ($$9 < ayn.k($$0)) {
               $$0 = ayn.c($$9);
            }
         }
      }

      return $$0;
   }

   protected void a(float $$0, float $$1, float $$2) {
      Vector3f $$3 = new Vector3f($$2, $$1, -$$0).rotate(this.p);
      this.a(new eww(this.i.c + (double)$$3.x, this.i.d + (double)$$3.y, this.i.e + (double)$$3.z));
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
      this.a(new eww($$0, $$1, $$2));
   }

   protected void a(eww $$0) {
      this.i = $$0;
      this.j.b($$0.c, $$0.d, $$0.e);
   }

   public eww b() {
      return this.i;
   }

   public jd c() {
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

   public bsq g() {
      return this.h;
   }

   public boolean h() {
      return this.f;
   }

   public boolean i() {
      return this.q;
   }

   public ffs.a j() {
      fgi $$0 = fgi.Q();
      double $$1 = (double)$$0.aM().l() / (double)$$0.aM().m();
      double $$2 = Math.tan((double)((float)$$0.m.ah().c().intValue() * (float) (Math.PI / 180.0)) / 2.0) * 0.05F;
      double $$3 = $$2 * $$1;
      eww $$4 = new eww(this.k).a(0.05F);
      eww $$5 = new eww(this.m).a($$3);
      eww $$6 = new eww(this.l).a($$2);
      return new ffs.a($$4, $$5, $$6);
   }

   public epa k() {
      if (!this.f) {
         return epa.d;
      } else {
         eoy $$0 = this.g.b_(this.j);
         if ($$0.a(awj.a) && this.i.d < (double)((float)this.j.v() + $$0.a(this.g, this.j))) {
            return epa.b;
         } else {
            ffs.a $$1 = this.j();

            for (eww $$3 : Arrays.asList($$1.a, $$1.a(), $$1.b(), $$1.c(), $$1.d())) {
               eww $$4 = this.i.e($$3);
               jd $$5 = jd.a((jw)$$4);
               eoy $$6 = this.g.b_($$5);
               if ($$6.a(awj.b)) {
                  if ($$4.d <= (double)($$6.a(this.g, $$5) + (float)$$5.v())) {
                     return epa.a;
                  }
               } else {
                  dta $$7 = this.g.a_($$5);
                  if ($$7.a(dfy.qP)) {
                     return epa.c;
                  }
               }
            }

            return epa.d;
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
      final eww a;
      private final eww b;
      private final eww c;

      a(eww $$0, eww $$1, eww $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public eww a() {
         return this.a.e(this.c).e(this.b);
      }

      public eww b() {
         return this.a.e(this.c).d(this.b);
      }

      public eww c() {
         return this.a.d(this.c).e(this.b);
      }

      public eww d() {
         return this.a.d(this.c).d(this.b);
      }

      public eww a(float $$0, float $$1) {
         return this.a.e(this.c.a((double)$$1)).d(this.b.a((double)$$0));
      }
   }
}
