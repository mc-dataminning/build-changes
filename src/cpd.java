import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cpd extends bxk implements cot {
   public static final float a = 7.448451F;
   public static final int b = azq.f(24.166098F);
   private static final akn<Integer> c = akr.a(cpd.class, akp.b);
   ffs d = ffs.c;
   @Nullable
   iw e;
   cpd.a f = cpd.a.a;

   public cpd(bxe<? extends cpd> $$0, djz $$1) {
      super($$0, $$1);
      this.bA = 5;
      this.bC = new cpd.g(this);
      this.bB = new cpd.f(this);
   }

   @Override
   public boolean aZ() {
      return (this.m() + this.af) % b == 0;
   }

   @Override
   protected cdq I() {
      return new cpd.d(this);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cpd.c());
      this.bF.a(2, new cpd.i());
      this.bF.a(3, new cpd.e());
      this.bG.a(1, new cpd.b());
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   public void b(int $$0) {
      this.al.a(c, azq.a($$0, 0, 64));
   }

   private void n() {
      this.i_();
      this.g(bzc.c).a((double)(6 + this.j()));
   }

   public int j() {
      return this.al.a(c);
   }

   @Override
   public void a(akn<?> $$0) {
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
         float $$0 = azq.b((float)(this.m() + this.af) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = azq.b((float)(this.m() + this.af + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awr.ul, this.dm(), 0.95F + this.ae.i() * 0.05F, 0.95F + this.ae.i() * 0.05F, false);
         }

         float $$2 = this.dq() * 1.48F;
         float $$3 = azq.b(this.dL() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = azq.a(this.dL() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dr() * 2.5F;
         this.dV().a(lz.ac, this.dA() + (double)$$3, this.dC() + (double)$$5, this.dG() + (double)$$4, 0.0, 0.0, 0.0);
         this.dV().a(lz.ac, this.dA() - (double)$$3, this.dC() + (double)$$5, this.dG() - (double)$$4, 0.0, 0.0, 0.0);
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
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      this.e = this.dv().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.e = $$0.<iw>a("anchor_pos", iw.a).orElse(null);
      this.b($$0.b("size", 0));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.b("anchor_pos", iw.a, this.e);
      $$0.a("size", this.j());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public aws dm() {
      return aws.f;
   }

   @Override
   protected awq u() {
      return awr.ui;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.um;
   }

   @Override
   protected awq l_() {
      return awr.uk;
   }

   @Override
   protected float fe() {
      return 1.0F;
   }

   @Override
   public boolean a(bxe<?> $$0) {
      return true;
   }

   @Override
   public bwy e(byi $$0) {
      int $$1 = this.j();
      bwy $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   boolean a(aru $$0, bxw $$1, cil $$2) {
      return $$2.a($$0, this, $$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends ces {
      private final cil b = cil.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            aru $$0 = a(cpd.this.dV());
            List<crz> $$1 = $$0.a(this.b, cpd.this, cpd.this.cR().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
               $$1.sort(Comparator.comparing(bwv::dC).reversed());

               for (crz $$2 : $$1) {
                  if (cpd.this.a($$0, $$2, cil.a)) {
                     cpd.this.g($$2);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bxw $$0 = cpd.this.f();
         return $$0 != null ? cpd.this.a(a(cpd.this.dV()), $$0, cil.a) : false;
      }
   }

   class c extends ces {
      private int b;

      @Override
      public boolean b() {
         bxw $$0 = cpd.this.f();
         return $$0 != null ? cpd.this.a(a(cpd.this.dV()), $$0, cil.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         cpd.this.f = cpd.a.a;
         this.h();
      }

      @Override
      public void e() {
         if (cpd.this.e != null) {
            cpd.this.e = cpd.this.dV().a(ehf.a.e, cpd.this.e).b(10 + cpd.this.ae.a(20));
         }
      }

      @Override
      public void a() {
         if (cpd.this.f == cpd.a.a) {
            this.b--;
            if (this.b <= 0) {
               cpd.this.f = cpd.a.b;
               this.h();
               this.b = this.a((8 + cpd.this.ae.a(4)) * 20);
               cpd.this.a(awr.un, 10.0F, 0.95F + cpd.this.ae.i() * 0.1F);
            }
         }
      }

      private void h() {
         if (cpd.this.e != null) {
            cpd.this.e = cpd.this.f().dv().b(20 + cpd.this.ae.a(20));
            if (cpd.this.e.v() < cpd.this.dV().P()) {
               cpd.this.e = new iw(cpd.this.e.u(), cpd.this.dV().P() + 1, cpd.this.e.w());
            }
         }
      }
   }

   class d extends cdq {
      public d(final bxy $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cpd.this.aX = cpd.this.aV;
         cpd.this.aV = cpd.this.dL();
      }
   }

   class e extends cpd.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return cpd.this.f() == null || cpd.this.f == cpd.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + cpd.this.ae.i() * 10.0F;
         this.e = -4.0F + cpd.this.ae.i() * 9.0F;
         this.f = cpd.this.ae.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (cpd.this.ae.a(this.a(350)) == 0) {
            this.e = -4.0F + cpd.this.ae.i() * 9.0F;
         }

         if (cpd.this.ae.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cpd.this.ae.a(this.a(450)) == 0) {
            this.c = cpd.this.ae.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cpd.this.d.e < cpd.this.dC() && !cpd.this.dV().v(cpd.this.dv().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cpd.this.d.e > cpd.this.dC() && !cpd.this.dV().v(cpd.this.dv().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (cpd.this.e == null) {
            cpd.this.e = cpd.this.dv();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cpd.this.d = ffs.a(cpd.this.e).b((double)(this.d * azq.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * azq.a(this.c)));
      }
   }

   static class f extends cdu {
      public f(bxy $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends cdv {
      private float m = 0.1F;

      public g(final bxy $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cpd.this.P) {
            cpd.this.w(cpd.this.dL() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cpd.this.d.d - cpd.this.dA();
         double $$1 = cpd.this.d.e - cpd.this.dC();
         double $$2 = cpd.this.d.f - cpd.this.dG();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cpd.this.dL();
            float $$7 = (float)azq.d($$2, $$0);
            float $$8 = azq.h(cpd.this.dL() + 90.0F);
            float $$9 = azq.h($$7 * (180.0F / (float)Math.PI));
            cpd.this.w(azq.e($$8, $$9, 4.0F) - 90.0F);
            cpd.this.aV = cpd.this.dL();
            if (azq.d($$6, cpd.this.dL()) < 3.0F) {
               this.m = azq.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = azq.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(azq.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cpd.this.x($$10);
            float $$11 = cpd.this.dL() + 90.0F;
            double $$12 = (double)(this.m * azq.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * azq.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * azq.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ffs $$15 = cpd.this.dy();
            cpd.this.i($$15.e(new ffs($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends ces {
      public h() {
         this.a(EnumSet.of(ces.a.a));
      }

      protected boolean h() {
         return cpd.this.d.c(cpd.this.dA(), cpd.this.dC(), cpd.this.dG()) < 4.0;
      }
   }

   class i extends cpd.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return cpd.this.f() != null && cpd.this.f == cpd.a.b;
      }

      @Override
      public boolean c() {
         bxw $$0 = cpd.this.f();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bJ()) {
            return false;
         } else {
            if ($$0 instanceof crz $$1 && ($$0.Z_() || $$1.b())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (cpd.this.af > this.e) {
                  this.e = cpd.this.af + 20;
                  List<cjp> $$2 = cpd.this.dV().a(cjp.class, cpd.this.cR().g(16.0), bxc.a);

                  for (cjp $$3 : $$2) {
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
         cpd.this.g(null);
         cpd.this.f = cpd.a.a;
      }

      @Override
      public void a() {
         bxw $$0 = cpd.this.f();
         if ($$0 != null) {
            cpd.this.d = new ffs($$0.dA(), $$0.e(0.5), $$0.dG());
            if (cpd.this.cR().g(0.2F).c($$0.cR())) {
               cpd.this.c(a(cpd.this.dV()), $$0);
               cpd.this.f = cpd.a.a;
               if (!cpd.this.ba()) {
                  cpd.this.dV().c(1039, cpd.this.dv(), 0);
               }
            } else if (cpd.this.P || cpd.this.aN > 0) {
               cpd.this.f = cpd.a.a;
            }
         }
      }
   }
}
