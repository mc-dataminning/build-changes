import java.util.Arrays;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fqn {
   private static final float b = 4.0F;
   private static final Vector3f c = new Vector3f(0.0F, 0.0F, -1.0F);
   private static final Vector3f d = new Vector3f(0.0F, 1.0F, 0.0F);
   private static final Vector3f e = new Vector3f(-1.0F, 0.0F, 0.0F);
   private boolean f;
   private djd g;
   private bwv h;
   private ffs i = ffs.c;
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

   public void a(djd $$0, bwv $$1, boolean $$2, boolean $$3, float $$4) {
      this.f = true;
      this.g = $$0;
      this.h = $$1;
      this.q = $$2;
      this.t = $$4;
      if ($$1.bY() && $$1.dk() instanceof cut $$5 && $$5.f() instanceof cvb $$6 && $$6.o()) {
         ffs $$7 = $$5.m($$1).d($$5.dt()).d($$1.l($$5)).e(new ffs(0.0, (double)azq.h($$4, this.s, this.r), 0.0));
         this.a($$1.j($$4), $$1.i($$4));
         this.a($$6.e($$4).e($$7));
      } else {
         this.a($$1.j($$4), $$1.i($$4));
         this.a(
            azq.d((double)$$4, $$1.K, $$1.dA()), azq.d((double)$$4, $$1.L, $$1.dC()) + (double)azq.h($$4, this.s, this.r), azq.d((double)$$4, $$1.M, $$1.dG())
         );
      }

      if ($$2) {
         if ($$3) {
            this.a(this.o + 180.0F, -this.n);
         }

         float $$9 = $$1 instanceof bxw $$8 ? $$8.el() : 1.0F;
         this.a(-this.a(4.0F * $$9), 0.0F, 0.0F);
      } else if ($$1 instanceof bxw && ((bxw)$$1).fR()) {
         jc $$10 = ((bxw)$$1).fT();
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
         ffs $$6 = this.i.b((double)($$3 * 0.1F), (double)($$4 * 0.1F), (double)($$5 * 0.1F));
         ffs $$7 = $$6.e(new ffs(this.k).c((double)(-$$0)));
         ffq $$8 = this.g.a(new djg($$6, $$7, djg.a.c, djg.b.a, this.h));
         if ($$8.d() != ffq.a.a) {
            float $$9 = (float)$$8.g().g(this.i);
            if ($$9 < azq.l($$0)) {
               $$0 = azq.c($$9);
            }
         }
      }

      return $$0;
   }

   protected void a(float $$0, float $$1, float $$2) {
      Vector3f $$3 = new Vector3f($$2, $$1, -$$0).rotate(this.p);
      this.a(new ffs(this.i.d + (double)$$3.x, this.i.e + (double)$$3.y, this.i.f + (double)$$3.z));
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
      this.a(new ffs($$0, $$1, $$2));
   }

   protected void a(ffs $$0) {
      this.i = $$0;
      this.j.b($$0.d, $$0.e, $$0.f);
   }

   public ffs b() {
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

   public bwv g() {
      return this.h;
   }

   public boolean h() {
      return this.f;
   }

   public boolean i() {
      return this.q;
   }

   public fqn.a j() {
      frf $$0 = frf.Q();
      double $$1 = (double)$$0.aO().k() / (double)$$0.aO().l();
      double $$2 = Math.tan((double)((float)$$0.n.ak().c().intValue() * (float) (Math.PI / 180.0)) / 2.0) * 0.05F;
      double $$3 = $$2 * $$1;
      ffs $$4 = new ffs(this.k).c(0.05F);
      ffs $$5 = new ffs(this.m).c($$3);
      ffs $$6 = new ffs(this.l).c($$2);
      return new fqn.a($$4, $$5, $$6);
   }

   public exs k() {
      if (!this.f) {
         return exs.d;
      } else {
         exq $$0 = this.g.b_(this.j);
         if ($$0.a(axl.a) && this.i.e < (double)((float)this.j.v() + $$0.a(this.g, this.j))) {
            return exs.b;
         } else {
            fqn.a $$1 = this.j();

            for (ffs $$3 : Arrays.asList($$1.a, $$1.a(), $$1.b(), $$1.c(), $$1.d())) {
               ffs $$4 = this.i.e($$3);
               iw $$5 = iw.a((jq)$$4);
               exq $$6 = this.g.b_($$5);
               if ($$6.a(axl.b)) {
                  if ($$4.e <= (double)($$6.a(this.g, $$5) + (float)$$5.v())) {
                     return exs.a;
                  }
               } else {
                  ebg $$7 = this.g.a_($$5);
                  if ($$7.a(dng.rx)) {
                     return exs.c;
                  }
               }
            }

            return exs.d;
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
      final ffs a;
      private final ffs b;
      private final ffs c;

      a(ffs $$0, ffs $$1, ffs $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ffs a() {
         return this.a.e(this.c).e(this.b);
      }

      public ffs b() {
         return this.a.e(this.c).d(this.b);
      }

      public ffs c() {
         return this.a.d(this.c).e(this.b);
      }

      public ffs d() {
         return this.a.d(this.c).d(this.b);
      }

      public ffs a(float $$0, float $$1) {
         return this.a.e(this.c.c((double)$$1)).d(this.b.c((double)$$0));
      }
   }
}
