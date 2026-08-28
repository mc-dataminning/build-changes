import java.util.Arrays;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fpy {
   private static final float b = 4.0F;
   private static final Vector3f c = new Vector3f(0.0F, 0.0F, -1.0F);
   private static final Vector3f d = new Vector3f(0.0F, 1.0F, 0.0F);
   private static final Vector3f e = new Vector3f(-1.0F, 0.0F, 0.0F);
   private boolean f;
   private djn g;
   private bxe h;
   private fgc i = fgc.c;
   private final iw.a j = new iw.a();
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

   public void a(djn $$0, bxe $$1, boolean $$2, boolean $$3, float $$4) {
      this.f = true;
      this.g = $$0;
      this.h = $$1;
      this.q = $$2;
      this.t = $$4;
      if ($$1.bY() && $$1.dk() instanceof cvc $$5 && $$5.f() instanceof cvk $$6 && $$6.o()) {
         fgc $$7 = $$5.m($$1).d($$5.dt()).d($$1.l($$5)).e(new fgc(0.0, (double)azz.h($$4, this.s, this.r), 0.0));
         this.a($$1.j($$4), $$1.i($$4));
         this.a($$6.e($$4).e($$7));
      } else {
         this.a($$1.j($$4), $$1.i($$4));
         this.a(
            azz.d((double)$$4, $$1.K, $$1.dA()), azz.d((double)$$4, $$1.L, $$1.dC()) + (double)azz.h($$4, this.s, this.r), azz.d((double)$$4, $$1.M, $$1.dG())
         );
      }

      if ($$2) {
         if ($$3) {
            this.a(this.o + 180.0F, -this.n);
         }

         float $$9 = $$1 instanceof byf $$8 ? $$8.el() : 1.0F;
         this.a(-this.a(4.0F * $$9), 0.0F, 0.0F);
      } else if ($$1 instanceof byf && ((byf)$$1).fR()) {
         jc $$10 = ((byf)$$1).fT();
         this.a($$10 != null ? $$10.p() - 180.0F : 0.0F, 0.0F);
         this.a(0.0F, 0.3F, 0.0F);
      }
   }

   public void a() {
      if (this.h != null) {
         this.s = this.r;
         this.r = this.r + (this.h.cS() - this.r) * 0.5F;
      }
   }

   private float a(float $$0) {
      float $$1 = 0.1F;

      for (int $$2 = 0; $$2 < 8; $$2++) {
         float $$3 = (float)(($$2 & 1) * 2 - 1);
         float $$4 = (float)(($$2 >> 1 & 1) * 2 - 1);
         float $$5 = (float)(($$2 >> 2 & 1) * 2 - 1);
         fgc $$6 = this.i.b((double)($$3 * 0.1F), (double)($$4 * 0.1F), (double)($$5 * 0.1F));
         fgc $$7 = $$6.e(new fgc(this.k).c((double)(-$$0)));
         fga $$8 = this.g.a(new djq($$6, $$7, djq.a.c, djq.b.a, this.h));
         if ($$8.d() != fga.a.a) {
            float $$9 = (float)$$8.g().g(this.i);
            if ($$9 < azz.l($$0)) {
               $$0 = azz.c($$9);
            }
         }
      }

      return $$0;
   }

   protected void a(float $$0, float $$1, float $$2) {
      Vector3f $$3 = new Vector3f($$2, $$1, -$$0).rotate(this.p);
      this.a(new fgc(this.i.d + (double)$$3.x, this.i.e + (double)$$3.y, this.i.f + (double)$$3.z));
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
      this.a(new fgc($$0, $$1, $$2));
   }

   protected void a(fgc $$0) {
      this.i = $$0;
      this.j.b($$0.d, $$0.e, $$0.f);
   }

   public fgc b() {
      return this.i;
   }

   public iw c() {
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

   public bxe g() {
      return this.h;
   }

   public boolean h() {
      return this.f;
   }

   public boolean i() {
      return this.q;
   }

   public fpy.a j() {
      fqq $$0 = fqq.Q();
      double $$1 = (double)$$0.aO().k() / (double)$$0.aO().l();
      double $$2 = Math.tan((double)((float)$$0.n.ak().c().intValue() * (float) (Math.PI / 180.0)) / 2.0) * 0.05F;
      double $$3 = $$2 * $$1;
      fgc $$4 = new fgc(this.k).c(0.05F);
      fgc $$5 = new fgc(this.m).c($$3);
      fgc $$6 = new fgc(this.l).c($$2);
      return new fpy.a($$4, $$5, $$6);
   }

   public eyc k() {
      if (!this.f) {
         return eyc.d;
      } else {
         eya $$0 = this.g.b_(this.j);
         if ($$0.a(axs.a) && this.i.e < (double)((float)this.j.v() + $$0.a(this.g, this.j))) {
            return eyc.b;
         } else {
            fpy.a $$1 = this.j();

            for (fgc $$3 : Arrays.asList($$1.a, $$1.a(), $$1.b(), $$1.c(), $$1.d())) {
               fgc $$4 = this.i.e($$3);
               iw $$5 = iw.a((jq)$$4);
               eya $$6 = this.g.b_($$5);
               if ($$6.a(axs.b)) {
                  if ($$4.e <= (double)($$6.a(this.g, $$5) + (float)$$5.v())) {
                     return eyc.a;
                  }
               } else {
                  ebq $$7 = this.g.a_($$5);
                  if ($$7.a(dnq.rx)) {
                     return eyc.c;
                  }
               }
            }

            return eyc.d;
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
      final fgc a;
      private final fgc b;
      private final fgc c;

      a(fgc $$0, fgc $$1, fgc $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public fgc a() {
         return this.a.e(this.c).e(this.b);
      }

      public fgc b() {
         return this.a.e(this.c).d(this.b);
      }

      public fgc c() {
         return this.a.d(this.c).e(this.b);
      }

      public fgc d() {
         return this.a.d(this.c).d(this.b);
      }

      public fgc a(float $$0, float $$1) {
         return this.a.e(this.c.c((double)$$1)).d(this.b.c((double)$$0));
      }
   }
}
