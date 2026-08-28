import java.util.Arrays;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ffw {
   private static final float b = 4.0F;
   private static final Vector3f c = new Vector3f(0.0F, 0.0F, -1.0F);
   private static final Vector3f d = new Vector3f(0.0F, 1.0F, 0.0F);
   private static final Vector3f e = new Vector3f(-1.0F, 0.0F, 0.0F);
   private boolean f;
   private dcc g;
   private bsr h;
   private exa i = exa.b;
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

   public void a(dcc $$0, bsr $$1, boolean $$2, boolean $$3, float $$4) {
      this.f = true;
      this.g = $$0;
      this.h = $$1;
      this.q = $$2;
      this.t = $$4;
      this.a($$1.i($$4), $$1.h($$4));
      this.a(ayo.d((double)$$4, $$1.L, $$1.du()), ayo.d((double)$$4, $$1.M, $$1.dw()) + (double)ayo.i($$4, this.s, this.r), ayo.d((double)$$4, $$1.N, $$1.dA()));
      if ($$2) {
         if ($$3) {
            this.a(this.o + 180.0F, -this.n);
         }

         float $$6 = $$1 instanceof btn $$5 ? $$5.ec() : 1.0F;
         this.a(-this.a(4.0F * $$6), 0.0F, 0.0F);
      } else if ($$1 instanceof btn && ((btn)$$1).fI()) {
         ji $$7 = ((btn)$$1).fK();
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
         exa $$6 = this.i.b((double)($$3 * 0.1F), (double)($$4 * 0.1F), (double)($$5 * 0.1F));
         exa $$7 = $$6.e(new exa(this.k).a((double)(-$$0)));
         ewy $$8 = this.g.a(new dcf($$6, $$7, dcf.a.c, dcf.b.a, this.h));
         if ($$8.c() != ewy.a.a) {
            float $$9 = (float)$$8.e().g(this.i);
            if ($$9 < ayo.k($$0)) {
               $$0 = ayo.c($$9);
            }
         }
      }

      return $$0;
   }

   protected void a(float $$0, float $$1, float $$2) {
      Vector3f $$3 = new Vector3f($$2, $$1, -$$0).rotate(this.p);
      this.a(new exa(this.i.c + (double)$$3.x, this.i.d + (double)$$3.y, this.i.e + (double)$$3.z));
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
      this.a(new exa($$0, $$1, $$2));
   }

   protected void a(exa $$0) {
      this.i = $$0;
      this.j.b($$0.c, $$0.d, $$0.e);
   }

   public exa b() {
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

   public bsr g() {
      return this.h;
   }

   public boolean h() {
      return this.f;
   }

   public boolean i() {
      return this.q;
   }

   public ffw.a j() {
      fgm $$0 = fgm.Q();
      double $$1 = (double)$$0.aM().l() / (double)$$0.aM().m();
      double $$2 = Math.tan((double)((float)$$0.m.ah().c().intValue() * (float) (Math.PI / 180.0)) / 2.0) * 0.05F;
      double $$3 = $$2 * $$1;
      exa $$4 = new exa(this.k).a(0.05F);
      exa $$5 = new exa(this.m).a($$3);
      exa $$6 = new exa(this.l).a($$2);
      return new ffw.a($$4, $$5, $$6);
   }

   public epe k() {
      if (!this.f) {
         return epe.d;
      } else {
         epc $$0 = this.g.b_(this.j);
         if ($$0.a(awk.a) && this.i.d < (double)((float)this.j.v() + $$0.a(this.g, this.j))) {
            return epe.b;
         } else {
            ffw.a $$1 = this.j();

            for (exa $$3 : Arrays.asList($$1.a, $$1.a(), $$1.b(), $$1.c(), $$1.d())) {
               exa $$4 = this.i.e($$3);
               jd $$5 = jd.a((jw)$$4);
               epc $$6 = this.g.b_($$5);
               if ($$6.a(awk.b)) {
                  if ($$4.d <= (double)($$6.a(this.g, $$5) + (float)$$5.v())) {
                     return epe.a;
                  }
               } else {
                  dtc $$7 = this.g.a_($$5);
                  if ($$7.a(dga.qP)) {
                     return epe.c;
                  }
               }
            }

            return epe.d;
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
      final exa a;
      private final exa b;
      private final exa c;

      a(exa $$0, exa $$1, exa $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public exa a() {
         return this.a.e(this.c).e(this.b);
      }

      public exa b() {
         return this.a.e(this.c).d(this.b);
      }

      public exa c() {
         return this.a.d(this.c).e(this.b);
      }

      public exa d() {
         return this.a.d(this.c).d(this.b);
      }

      public exa a(float $$0, float $$1) {
         return this.a.e(this.c.a((double)$$1)).d(this.b.a((double)$$0));
      }
   }
}
