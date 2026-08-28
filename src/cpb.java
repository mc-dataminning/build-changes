import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cpb extends bxi implements cor {
   public static final float a = 7.448451F;
   public static final int b = azo.f(24.166098F);
   private static final akl<Integer> c = akp.a(cpb.class, akn.b);
   ffq d = ffq.c;
   @Nullable
   iv e;
   cpb.a f = cpb.a.a;

   public cpb(bxc<? extends cpb> $$0, djx $$1) {
      super($$0, $$1);
      this.bA = 5;
      this.bC = new cpb.g(this);
      this.bB = new cpb.f(this);
   }

   @Override
   public boolean aZ() {
      return (this.m() + this.af) % b == 0;
   }

   @Override
   protected cdo I() {
      return new cpb.d(this);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cpb.c());
      this.bF.a(2, new cpb.i());
      this.bF.a(3, new cpb.e());
      this.bG.a(1, new cpb.b());
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   public void b(int $$0) {
      this.al.a(c, azo.a($$0, 0, 64));
   }

   private void n() {
      this.i_();
      this.g(bza.c).a((double)(6 + this.j()));
   }

   public int j() {
      return this.al.a(c);
   }

   @Override
   public void a(akl<?> $$0) {
      if (c.equals($$0)) {
         this.n();
      }

      super.a($$0);
   }

   public int m() {
      return this.ao() * 3;
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         float $$0 = azo.b((float)(this.m() + this.af) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = azo.b((float)(this.m() + this.af + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awp.ul, this.dm(), 0.95F + this.ae.i() * 0.05F, 0.95F + this.ae.i() * 0.05F, false);
         }

         float $$2 = this.dq() * 1.48F;
         float $$3 = azo.b(this.dL() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = azo.a(this.dL() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dr() * 2.5F;
         this.dV().a(ly.ac, this.dA() + (double)$$3, this.dC() + (double)$$5, this.dG() + (double)$$4, 0.0, 0.0, 0.0);
         this.dV().a(ly.ac, this.dA() - (double)$$3, this.dC() + (double)$$5, this.dG() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void k_() {
      if (this.bJ() && this.go()) {
         this.e(8.0F);
      }

      super.k_();
   }

   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      this.e = this.dv().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.e = $$0.<iv>a("anchor_pos", iv.a).orElse(null);
      this.b($$0.b("size", 0));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.b("anchor_pos", iv.a, this.e);
      $$0.a("size", this.j());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public awq dm() {
      return awq.f;
   }

   @Override
   protected awo u() {
      return awp.ui;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.um;
   }

   @Override
   protected awo l_() {
      return awp.uk;
   }

   @Override
   protected float fe() {
      return 1.0F;
   }

   @Override
   public boolean a(bxc<?> $$0) {
      return true;
   }

   @Override
   public bww e(byg $$0) {
      int $$1 = this.j();
      bww $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   boolean a(ars $$0, bxu $$1, cij $$2) {
      return $$2.a($$0, this, $$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends ceq {
      private final cij b = cij.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            ars $$0 = a(cpb.this.dV());
            List<crx> $$1 = $$0.a(this.b, cpb.this, cpb.this.cR().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
               $$1.sort(Comparator.comparing(bwt::dC).reversed());

               for (crx $$2 : $$1) {
                  if (cpb.this.a($$0, $$2, cij.a)) {
                     cpb.this.g($$2);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bxu $$0 = cpb.this.f();
         return $$0 != null ? cpb.this.a(a(cpb.this.dV()), $$0, cij.a) : false;
      }
   }

   class c extends ceq {
      private int b;

      @Override
      public boolean b() {
         bxu $$0 = cpb.this.f();
         return $$0 != null ? cpb.this.a(a(cpb.this.dV()), $$0, cij.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         cpb.this.f = cpb.a.a;
         this.h();
      }

      @Override
      public void e() {
         if (cpb.this.e != null) {
            cpb.this.e = cpb.this.dV().a(ehd.a.e, cpb.this.e).b(10 + cpb.this.ae.a(20));
         }
      }

      @Override
      public void a() {
         if (cpb.this.f == cpb.a.a) {
            this.b--;
            if (this.b <= 0) {
               cpb.this.f = cpb.a.b;
               this.h();
               this.b = this.a((8 + cpb.this.ae.a(4)) * 20);
               cpb.this.a(awp.un, 10.0F, 0.95F + cpb.this.ae.i() * 0.1F);
            }
         }
      }

      private void h() {
         if (cpb.this.e != null) {
            cpb.this.e = cpb.this.f().dv().b(20 + cpb.this.ae.a(20));
            if (cpb.this.e.v() < cpb.this.dV().P()) {
               cpb.this.e = new iv(cpb.this.e.u(), cpb.this.dV().P() + 1, cpb.this.e.w());
            }
         }
      }
   }

   class d extends cdo {
      public d(final bxw $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cpb.this.aX = cpb.this.aV;
         cpb.this.aV = cpb.this.dL();
      }
   }

   class e extends cpb.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return cpb.this.f() == null || cpb.this.f == cpb.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + cpb.this.ae.i() * 10.0F;
         this.e = -4.0F + cpb.this.ae.i() * 9.0F;
         this.f = cpb.this.ae.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (cpb.this.ae.a(this.a(350)) == 0) {
            this.e = -4.0F + cpb.this.ae.i() * 9.0F;
         }

         if (cpb.this.ae.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cpb.this.ae.a(this.a(450)) == 0) {
            this.c = cpb.this.ae.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cpb.this.d.e < cpb.this.dC() && !cpb.this.dV().v(cpb.this.dv().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cpb.this.d.e > cpb.this.dC() && !cpb.this.dV().v(cpb.this.dv().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (cpb.this.e == null) {
            cpb.this.e = cpb.this.dv();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cpb.this.d = ffq.a(cpb.this.e).b((double)(this.d * azo.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * azo.a(this.c)));
      }
   }

   static class f extends cds {
      public f(bxw $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends cdt {
      private float m = 0.1F;

      public g(final bxw $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cpb.this.P) {
            cpb.this.w(cpb.this.dL() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cpb.this.d.d - cpb.this.dA();
         double $$1 = cpb.this.d.e - cpb.this.dC();
         double $$2 = cpb.this.d.f - cpb.this.dG();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cpb.this.dL();
            float $$7 = (float)azo.d($$2, $$0);
            float $$8 = azo.h(cpb.this.dL() + 90.0F);
            float $$9 = azo.h($$7 * (180.0F / (float)Math.PI));
            cpb.this.w(azo.e($$8, $$9, 4.0F) - 90.0F);
            cpb.this.aV = cpb.this.dL();
            if (azo.d($$6, cpb.this.dL()) < 3.0F) {
               this.m = azo.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = azo.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(azo.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cpb.this.x($$10);
            float $$11 = cpb.this.dL() + 90.0F;
            double $$12 = (double)(this.m * azo.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * azo.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * azo.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ffq $$15 = cpb.this.dy();
            cpb.this.i($$15.e(new ffq($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends ceq {
      public h() {
         this.a(EnumSet.of(ceq.a.a));
      }

      protected boolean h() {
         return cpb.this.d.c(cpb.this.dA(), cpb.this.dC(), cpb.this.dG()) < 4.0;
      }
   }

   class i extends cpb.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return cpb.this.f() != null && cpb.this.f == cpb.a.b;
      }

      @Override
      public boolean c() {
         bxu $$0 = cpb.this.f();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bJ()) {
            return false;
         } else {
            if ($$0 instanceof crx $$1 && ($$0.Z_() || $$1.b())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (cpb.this.af > this.e) {
                  this.e = cpb.this.af + 20;
                  List<cjn> $$2 = cpb.this.dV().a(cjn.class, cpb.this.cR().g(16.0), bxa.a);

                  for (cjn $$3 : $$2) {
                     $$3.gJ();
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
         cpb.this.g(null);
         cpb.this.f = cpb.a.a;
      }

      @Override
      public void a() {
         bxu $$0 = cpb.this.f();
         if ($$0 != null) {
            cpb.this.d = new ffq($$0.dA(), $$0.e(0.5), $$0.dG());
            if (cpb.this.cR().g(0.2F).c($$0.cR())) {
               cpb.this.c(a(cpb.this.dV()), $$0);
               cpb.this.f = cpb.a.a;
               if (!cpb.this.ba()) {
                  cpb.this.dV().c(1039, cpb.this.dv(), 0);
               }
            } else if (cpb.this.P || cpb.this.aN > 0) {
               cpb.this.f = cpb.a.a;
            }
         }
      }
   }
}
