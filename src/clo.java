import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class clo extends bum implements cle {
   public static final float b = 7.448451F;
   public static final int c = azj.f(24.166098F);
   private static final akk<Integer> d = ako.a(clo.class, akm.b);
   ezh e = ezh.c;
   jg bX = jg.c;
   clo.a bY = clo.a.a;

   public clo(bug<? extends clo> $$0, dev $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new clo.g(this);
      this.bO = new clo.f(this);
   }

   @Override
   public boolean bb() {
      return (this.t() + this.ag) % c == 0;
   }

   @Override
   protected car J() {
      return new clo.d(this);
   }

   @Override
   protected void D() {
      this.bS.a(1, new clo.c());
      this.bS.a(2, new clo.i());
      this.bS.a(3, new clo.e());
      this.bT.a(1, new clo.b());
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.am.a(d, azj.a($$0, 0, 64));
   }

   private void y() {
      this.j_();
      this.g(bwd.c).a((double)(6 + this.q()));
   }

   public int q() {
      return this.am.a(d);
   }

   @Override
   public void a(akk<?> $$0) {
      if (d.equals($$0)) {
         this.y();
      }

      super.a($$0);
   }

   public int t() {
      return this.ar() * 3;
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dX().C) {
         float $$0 = azj.b((float)(this.t() + this.ag) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = azj.b((float)(this.t() + this.ag + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dX().a(this.dC(), this.dE(), this.dI(), awk.tw, this.dn(), 0.95F + this.af.i() * 0.05F, 0.95F + this.af.i() * 0.05F, false);
         }

         float $$2 = this.ds() * 1.48F;
         float $$3 = azj.b(this.dN() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = azj.a(this.dN() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dt() * 2.5F;
         this.dX().a(lq.Z, this.dC() + (double)$$3, this.dE() + (double)$$5, this.dI() + (double)$$4, 0.0, 0.0, 0.0);
         this.dX().a(lq.Z, this.dC() - (double)$$3, this.dE() + (double)$$5, this.dI() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void n_() {
      if (this.bM() && this.gn()) {
         this.d(8.0F);
      }

      super.n_();
   }

   @Override
   protected void ac() {
      super.ac();
   }

   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      this.bX = this.dx().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bX = new jg($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(uj $$0) {
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
   public awl dn() {
      return awl.f;
   }

   @Override
   protected awj w() {
      return awk.tt;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.tx;
   }

   @Override
   protected awj o_() {
      return awk.tv;
   }

   @Override
   protected float fi() {
      return 1.0F;
   }

   @Override
   public boolean a(bug<?> $$0) {
      return true;
   }

   @Override
   public buc e(bvh $$0) {
      int $$1 = this.q();
      buc $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cbt {
      private final cfm b = cfm.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<coh> $$0 = clo.this.dX().a(this.b, clo.this, clo.this.cS().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(btz::dE).reversed());

               for (coh $$1 : $$0) {
                  if (clo.this.a($$1, cfm.a)) {
                     clo.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         buv $$0 = clo.this.m();
         return $$0 != null ? clo.this.a($$0, cfm.a) : false;
      }
   }

   class c extends cbt {
      private int b;

      @Override
      public boolean b() {
         buv $$0 = clo.this.m();
         return $$0 != null ? clo.this.a($$0, cfm.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         clo.this.bY = clo.a.a;
         this.h();
      }

      @Override
      public void e() {
         clo.this.bX = clo.this.dX().a(eaz.a.e, clo.this.bX).b(10 + clo.this.af.a(20));
      }

      @Override
      public void a() {
         if (clo.this.bY == clo.a.a) {
            this.b--;
            if (this.b <= 0) {
               clo.this.bY = clo.a.b;
               this.h();
               this.b = this.a((8 + clo.this.af.a(4)) * 20);
               clo.this.a(awk.ty, 10.0F, 0.95F + clo.this.af.i() * 0.1F);
            }
         }
      }

      private void h() {
         clo.this.bX = clo.this.m().dx().b(20 + clo.this.af.a(20));
         if (clo.this.bX.v() < clo.this.dX().N()) {
            clo.this.bX = new jg(clo.this.bX.u(), clo.this.dX().N() + 1, clo.this.bX.w());
         }
      }
   }

   class d extends car {
      public d(final bux $$0) {
         super($$0);
      }

      @Override
      public void a() {
         clo.this.aW = clo.this.aU;
         clo.this.aU = clo.this.dN();
      }
   }

   class e extends clo.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return clo.this.m() == null || clo.this.bY == clo.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + clo.this.af.i() * 10.0F;
         this.e = -4.0F + clo.this.af.i() * 9.0F;
         this.f = clo.this.af.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (clo.this.af.a(this.a(350)) == 0) {
            this.e = -4.0F + clo.this.af.i() * 9.0F;
         }

         if (clo.this.af.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (clo.this.af.a(this.a(450)) == 0) {
            this.c = clo.this.af.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (clo.this.e.e < clo.this.dE() && !clo.this.dX().u(clo.this.dx().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (clo.this.e.e > clo.this.dE() && !clo.this.dX().u(clo.this.dx().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (jg.c.equals(clo.this.bX)) {
            clo.this.bX = clo.this.dx();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         clo.this.e = ezh.a(clo.this.bX).b((double)(this.d * azj.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * azj.a(this.c)));
      }
   }

   class f extends cav {
      public f(final bux $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends caw {
      private float m = 0.1F;

      public g(final bux $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (clo.this.Q) {
            clo.this.v(clo.this.dN() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = clo.this.e.d - clo.this.dC();
         double $$1 = clo.this.e.e - clo.this.dE();
         double $$2 = clo.this.e.f - clo.this.dI();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = clo.this.dN();
            float $$7 = (float)azj.d($$2, $$0);
            float $$8 = azj.h(clo.this.dN() + 90.0F);
            float $$9 = azj.h($$7 * (180.0F / (float)Math.PI));
            clo.this.v(azj.e($$8, $$9, 4.0F) - 90.0F);
            clo.this.aU = clo.this.dN();
            if (azj.d($$6, clo.this.dN()) < 3.0F) {
               this.m = azj.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = azj.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(azj.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            clo.this.w($$10);
            float $$11 = clo.this.dN() + 90.0F;
            double $$12 = (double)(this.m * azj.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * azj.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * azj.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ezh $$15 = clo.this.dA();
            clo.this.h($$15.e(new ezh($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends cbt {
      public h() {
         this.a(EnumSet.of(cbt.a.a));
      }

      protected boolean h() {
         return clo.this.e.c(clo.this.dC(), clo.this.dE(), clo.this.dI()) < 4.0;
      }
   }

   class i extends clo.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return clo.this.m() != null && clo.this.bY == clo.a.b;
      }

      @Override
      public boolean c() {
         buv $$0 = clo.this.m();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bM()) {
            return false;
         } else {
            if ($$0 instanceof coh $$1 && ($$0.R_() || $$1.f())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (clo.this.ag > this.e) {
                  this.e = clo.this.ag + 20;
                  List<cgp> $$2 = clo.this.dX().a(cgp.class, clo.this.cS().g(16.0), bue.a);

                  for (cgp $$3 : $$2) {
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
         clo.this.h(null);
         clo.this.bY = clo.a.a;
      }

      @Override
      public void a() {
         buv $$0 = clo.this.m();
         if ($$0 != null) {
            clo.this.e = new ezh($$0.dC(), $$0.e(0.5), $$0.dI());
            if (clo.this.cS().g(0.2F).c($$0.cS())) {
               clo.this.E($$0);
               clo.this.bY = clo.a.a;
               if (!clo.this.bc()) {
                  clo.this.dX().c(1039, clo.this.dx(), 0);
               }
            } else if (clo.this.Q || clo.this.aK > 0) {
               clo.this.bY = clo.a.a;
            }
         }
      }
   }
}
