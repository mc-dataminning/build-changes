import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class clc extends bub implements cks {
   public static final float b = 7.448451F;
   public static final int c = azd.f(24.166098F);
   private static final akg<Integer> d = akk.a(clc.class, aki.b);
   eys e = eys.c;
   je bX = je.c;
   clc.a bY = clc.a.a;

   public clc(btv<? extends clc> $$0, deg $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new clc.g(this);
      this.bO = new clc.f(this);
   }

   @Override
   public boolean aZ() {
      return (this.t() + this.ag) % c == 0;
   }

   @Override
   protected caf J() {
      return new clc.d(this);
   }

   @Override
   protected void D() {
      this.bS.a(1, new clc.c());
      this.bS.a(2, new clc.i());
      this.bS.a(3, new clc.e());
      this.bT.a(1, new clc.b());
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.am.a(d, azd.a($$0, 0, 64));
   }

   private void y() {
      this.i_();
      this.g(bvr.c).a((double)(6 + this.q()));
   }

   public int q() {
      return this.am.a(d);
   }

   @Override
   public void a(akg<?> $$0) {
      if (d.equals($$0)) {
         this.y();
      }

      super.a($$0);
   }

   public int t() {
      return this.ap() * 3;
   }

   @Override
   protected boolean ab() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().B) {
         float $$0 = azd.b((float)(this.t() + this.ag) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = azd.b((float)(this.t() + this.ag + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dS().a(this.dx(), this.dz(), this.dD(), awe.ty, this.di(), 0.95F + this.af.i() * 0.05F, 0.95F + this.af.i() * 0.05F, false);
         }

         float $$2 = this.dn() * 1.48F;
         float $$3 = azd.b(this.dI() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = azd.a(this.dI() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.do() * 2.5F;
         this.dS().a(ln.Z, this.dx() + (double)$$3, this.dz() + (double)$$5, this.dD() + (double)$$4, 0.0, 0.0, 0.0);
         this.dS().a(ln.Z, this.dx() - (double)$$3, this.dz() + (double)$$5, this.dD() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void m_() {
      if (this.bI() && this.gj()) {
         this.d(8.0F);
      }

      super.m_();
   }

   @Override
   protected void ad() {
      super.ad();
   }

   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      this.bX = this.ds().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bX = new je($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(uf $$0) {
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
   public awf di() {
      return awf.f;
   }

   @Override
   protected awd w() {
      return awe.tv;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.tz;
   }

   @Override
   protected awd n_() {
      return awe.tx;
   }

   @Override
   protected float fd() {
      return 1.0F;
   }

   @Override
   public boolean a(btv<?> $$0) {
      return true;
   }

   @Override
   public btr e(buw $$0) {
      int $$1 = this.q();
      btr $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cbh {
      private final cfa b = cfa.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cnu> $$0 = clc.this.dS().a(this.b, clc.this, clc.this.cO().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bto::dz).reversed());

               for (cnu $$1 : $$0) {
                  if (clc.this.a($$1, cfa.a)) {
                     clc.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         buk $$0 = clc.this.m();
         return $$0 != null ? clc.this.a($$0, cfa.a) : false;
      }
   }

   class c extends cbh {
      private int b;

      @Override
      public boolean b() {
         buk $$0 = clc.this.m();
         return $$0 != null ? clc.this.a($$0, cfa.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         clc.this.bY = clc.a.a;
         this.h();
      }

      @Override
      public void e() {
         clc.this.bX = clc.this.dS().a(eak.a.e, clc.this.bX).b(10 + clc.this.af.a(20));
      }

      @Override
      public void a() {
         if (clc.this.bY == clc.a.a) {
            this.b--;
            if (this.b <= 0) {
               clc.this.bY = clc.a.b;
               this.h();
               this.b = this.a((8 + clc.this.af.a(4)) * 20);
               clc.this.a(awe.tA, 10.0F, 0.95F + clc.this.af.i() * 0.1F);
            }
         }
      }

      private void h() {
         clc.this.bX = clc.this.m().ds().b(20 + clc.this.af.a(20));
         if (clc.this.bX.v() < clc.this.dS().N()) {
            clc.this.bX = new je(clc.this.bX.u(), clc.this.dS().N() + 1, clc.this.bX.w());
         }
      }
   }

   class d extends caf {
      public d(final bum $$0) {
         super($$0);
      }

      @Override
      public void a() {
         clc.this.aV = clc.this.aT;
         clc.this.aT = clc.this.dI();
      }
   }

   class e extends clc.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return clc.this.m() == null || clc.this.bY == clc.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + clc.this.af.i() * 10.0F;
         this.e = -4.0F + clc.this.af.i() * 9.0F;
         this.f = clc.this.af.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (clc.this.af.a(this.a(350)) == 0) {
            this.e = -4.0F + clc.this.af.i() * 9.0F;
         }

         if (clc.this.af.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (clc.this.af.a(this.a(450)) == 0) {
            this.c = clc.this.af.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (clc.this.e.e < clc.this.dz() && !clc.this.dS().u(clc.this.ds().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (clc.this.e.e > clc.this.dz() && !clc.this.dS().u(clc.this.ds().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (je.c.equals(clc.this.bX)) {
            clc.this.bX = clc.this.ds();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         clc.this.e = eys.a(clc.this.bX).b((double)(this.d * azd.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * azd.a(this.c)));
      }
   }

   class f extends caj {
      public f(final bum $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends cak {
      private float m = 0.1F;

      public g(final bum $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (clc.this.Q) {
            clc.this.v(clc.this.dI() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = clc.this.e.d - clc.this.dx();
         double $$1 = clc.this.e.e - clc.this.dz();
         double $$2 = clc.this.e.f - clc.this.dD();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = clc.this.dI();
            float $$7 = (float)azd.d($$2, $$0);
            float $$8 = azd.g(clc.this.dI() + 90.0F);
            float $$9 = azd.g($$7 * (180.0F / (float)Math.PI));
            clc.this.v(azd.e($$8, $$9, 4.0F) - 90.0F);
            clc.this.aT = clc.this.dI();
            if (azd.d($$6, clc.this.dI()) < 3.0F) {
               this.m = azd.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = azd.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(azd.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            clc.this.w($$10);
            float $$11 = clc.this.dI() + 90.0F;
            double $$12 = (double)(this.m * azd.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * azd.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * azd.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            eys $$15 = clc.this.dv();
            clc.this.h($$15.e(new eys($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends cbh {
      public h() {
         this.a(EnumSet.of(cbh.a.a));
      }

      protected boolean h() {
         return clc.this.e.c(clc.this.dx(), clc.this.dz(), clc.this.dD()) < 4.0;
      }
   }

   class i extends clc.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return clc.this.m() != null && clc.this.bY == clc.a.b;
      }

      @Override
      public boolean c() {
         buk $$0 = clc.this.m();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bI()) {
            return false;
         } else {
            if ($$0 instanceof cnu $$1 && ($$0.P_() || $$1.f())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (clc.this.ag > this.e) {
                  this.e = clc.this.ag + 20;
                  List<cgd> $$2 = clc.this.dS().a(cgd.class, clc.this.cO().g(16.0), btt.a);

                  for (cgd $$3 : $$2) {
                     $$3.gE();
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
         clc.this.h(null);
         clc.this.bY = clc.a.a;
      }

      @Override
      public void a() {
         buk $$0 = clc.this.m();
         if ($$0 != null) {
            clc.this.e = new eys($$0.dx(), $$0.e(0.5), $$0.dD());
            if (clc.this.cO().g(0.2F).c($$0.cO())) {
               clc.this.E($$0);
               clc.this.bY = clc.a.a;
               if (!clc.this.ba()) {
                  clc.this.dS().c(1039, clc.this.ds(), 0);
               }
            } else if (clc.this.Q || clc.this.aJ > 0) {
               clc.this.bY = clc.a.a;
            }
         }
      }
   }
}
