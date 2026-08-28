import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class clx extends buv implements cln {
   public static final float b = 7.448451F;
   public static final int c = azn.f(24.166098F);
   private static final ako<Integer> d = aks.a(clx.class, akq.b);
   ezr e = ezr.c;
   jh bX = jh.c;
   clx.a bY = clx.a.a;

   public clx(bup<? extends clx> $$0, dff $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new clx.g(this);
      this.bO = new clx.f(this);
   }

   @Override
   public boolean bc() {
      return (this.t() + this.ag) % c == 0;
   }

   @Override
   protected cba J() {
      return new clx.d(this);
   }

   @Override
   protected void D() {
      this.bS.a(1, new clx.c());
      this.bS.a(2, new clx.i());
      this.bS.a(3, new clx.e());
      this.bT.a(1, new clx.b());
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.am.a(d, azn.a($$0, 0, 64));
   }

   private void y() {
      this.j_();
      this.g(bwm.c).a((double)(6 + this.q()));
   }

   public int q() {
      return this.am.a(d);
   }

   @Override
   public void a(ako<?> $$0) {
      if (d.equals($$0)) {
         this.y();
      }

      super.a($$0);
   }

   public int t() {
      return this.as() * 3;
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dY().C) {
         float $$0 = azn.b((float)(this.t() + this.ag) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = azn.b((float)(this.t() + this.ag + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dY().a(this.dD(), this.dF(), this.dJ(), awo.tw, this.do(), 0.95F + this.af.i() * 0.05F, 0.95F + this.af.i() * 0.05F, false);
         }

         float $$2 = this.dt() * 1.48F;
         float $$3 = azn.b(this.dO() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = azn.a(this.dO() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.du() * 2.5F;
         this.dY().a(ls.Z, this.dD() + (double)$$3, this.dF() + (double)$$5, this.dJ() + (double)$$4, 0.0, 0.0, 0.0);
         this.dY().a(ls.Z, this.dD() - (double)$$3, this.dF() + (double)$$5, this.dJ() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void n_() {
      if (this.bN() && this.gn()) {
         this.d(8.0F);
      }

      super.n_();
   }

   @Override
   protected void ac() {
      super.ac();
   }

   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      this.bX = this.dy().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bX = new jh($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("AX", this.bX.u());
      $$0.a("AY", this.bX.v());
      $$0.a("AZ", this.bX.w());
      $$0.a("Size", this.q());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public awp do() {
      return awp.f;
   }

   @Override
   protected awn w() {
      return awo.tt;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.tx;
   }

   @Override
   protected awn o_() {
      return awo.tv;
   }

   @Override
   protected float fj() {
      return 1.0F;
   }

   @Override
   public boolean a(bup<?> $$0) {
      return true;
   }

   @Override
   public bul e(bvq $$0) {
      int $$1 = this.q();
      bul $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends ccc {
      private final cfv b = cfv.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cor> $$0 = clx.this.dY().a(this.b, clx.this, clx.this.cT().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bui::dF).reversed());

               for (cor $$1 : $$0) {
                  if (clx.this.a($$1, cfv.a)) {
                     clx.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bve $$0 = clx.this.m();
         return $$0 != null ? clx.this.a($$0, cfv.a) : false;
      }
   }

   class c extends ccc {
      private int b;

      @Override
      public boolean b() {
         bve $$0 = clx.this.m();
         return $$0 != null ? clx.this.a($$0, cfv.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         clx.this.bY = clx.a.a;
         this.h();
      }

      @Override
      public void e() {
         clx.this.bX = clx.this.dY().a(ebj.a.e, clx.this.bX).b(10 + clx.this.af.a(20));
      }

      @Override
      public void a() {
         if (clx.this.bY == clx.a.a) {
            this.b--;
            if (this.b <= 0) {
               clx.this.bY = clx.a.b;
               this.h();
               this.b = this.a((8 + clx.this.af.a(4)) * 20);
               clx.this.a(awo.ty, 10.0F, 0.95F + clx.this.af.i() * 0.1F);
            }
         }
      }

      private void h() {
         clx.this.bX = clx.this.m().dy().b(20 + clx.this.af.a(20));
         if (clx.this.bX.v() < clx.this.dY().N()) {
            clx.this.bX = new jh(clx.this.bX.u(), clx.this.dY().N() + 1, clx.this.bX.w());
         }
      }
   }

   class d extends cba {
      public d(final bvg $$0) {
         super($$0);
      }

      @Override
      public void a() {
         clx.this.aZ = clx.this.aX;
         clx.this.aX = clx.this.dO();
      }
   }

   class e extends clx.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return clx.this.m() == null || clx.this.bY == clx.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + clx.this.af.i() * 10.0F;
         this.e = -4.0F + clx.this.af.i() * 9.0F;
         this.f = clx.this.af.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (clx.this.af.a(this.a(350)) == 0) {
            this.e = -4.0F + clx.this.af.i() * 9.0F;
         }

         if (clx.this.af.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (clx.this.af.a(this.a(450)) == 0) {
            this.c = clx.this.af.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (clx.this.e.e < clx.this.dF() && !clx.this.dY().u(clx.this.dy().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (clx.this.e.e > clx.this.dF() && !clx.this.dY().u(clx.this.dy().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (jh.c.equals(clx.this.bX)) {
            clx.this.bX = clx.this.dy();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         clx.this.e = ezr.a(clx.this.bX).b((double)(this.d * azn.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * azn.a(this.c)));
      }
   }

   class f extends cbe {
      public f(final bvg $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends cbf {
      private float m = 0.1F;

      public g(final bvg $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (clx.this.Q) {
            clx.this.v(clx.this.dO() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = clx.this.e.d - clx.this.dD();
         double $$1 = clx.this.e.e - clx.this.dF();
         double $$2 = clx.this.e.f - clx.this.dJ();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = clx.this.dO();
            float $$7 = (float)azn.d($$2, $$0);
            float $$8 = azn.h(clx.this.dO() + 90.0F);
            float $$9 = azn.h($$7 * (180.0F / (float)Math.PI));
            clx.this.v(azn.e($$8, $$9, 4.0F) - 90.0F);
            clx.this.aX = clx.this.dO();
            if (azn.d($$6, clx.this.dO()) < 3.0F) {
               this.m = azn.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = azn.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(azn.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            clx.this.w($$10);
            float $$11 = clx.this.dO() + 90.0F;
            double $$12 = (double)(this.m * azn.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * azn.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * azn.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ezr $$15 = clx.this.dB();
            clx.this.h($$15.e(new ezr($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends ccc {
      public h() {
         this.a(EnumSet.of(ccc.a.a));
      }

      protected boolean h() {
         return clx.this.e.c(clx.this.dD(), clx.this.dF(), clx.this.dJ()) < 4.0;
      }
   }

   class i extends clx.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return clx.this.m() != null && clx.this.bY == clx.a.b;
      }

      @Override
      public boolean c() {
         bve $$0 = clx.this.m();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bN()) {
            return false;
         } else {
            if ($$0 instanceof cor $$1 && ($$0.R_() || $$1.f())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (clx.this.ag > this.e) {
                  this.e = clx.this.ag + 20;
                  List<cgy> $$2 = clx.this.dY().a(cgy.class, clx.this.cT().g(16.0), bun.a);

                  for (cgy $$3 : $$2) {
                     $$3.gK();
                  }

                  this.d = !$$2.isEmpty();
               }

               return !this.d;
            }
         }
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         clx.this.h(null);
         clx.this.bY = clx.a.a;
      }

      @Override
      public void a() {
         bve $$0 = clx.this.m();
         if ($$0 != null) {
            clx.this.e = new ezr($$0.dD(), $$0.e(0.5), $$0.dJ());
            if (clx.this.cT().g(0.2F).c($$0.cT())) {
               clx.this.E($$0);
               clx.this.bY = clx.a.a;
               if (!clx.this.bd()) {
                  clx.this.dY().c(1039, clx.this.dy(), 0);
               }
            } else if (clx.this.Q || clx.this.aN > 0) {
               clx.this.bY = clx.a.a;
            }
         }
      }
   }
}
