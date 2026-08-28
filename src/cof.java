import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cof extends bwu implements cnv {
   public static final float a = 7.448451F;
   public static final int b = azm.f(24.166098F);
   private static final akj<Integer> c = akn.a(cof.class, akl.b);
   feq d = feq.c;
   iu bF = iu.c;
   cof.a bG = cof.a.a;

   public cof(bwo<? extends cof> $$0, dja $$1) {
      super($$0, $$1);
      this.by = 5;
      this.bA = new cof.g(this);
      this.bz = new cof.f(this);
   }

   @Override
   public boolean ba() {
      return (this.m() + this.af) % b == 0;
   }

   @Override
   protected ccy I() {
      return new cof.d(this);
   }

   @Override
   protected void D() {
      this.bD.a(1, new cof.c());
      this.bD.a(2, new cof.i());
      this.bD.a(3, new cof.e());
      this.bE.a(1, new cof.b());
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   public void b(int $$0) {
      this.al.a(c, azm.a($$0, 0, 64));
   }

   private void n() {
      this.i_();
      this.g(byk.c).a((double)(6 + this.j()));
   }

   public int j() {
      return this.al.a(c);
   }

   @Override
   public void a(akj<?> $$0) {
      if (c.equals($$0)) {
         this.n();
      }

      super.a($$0);
   }

   public int m() {
      return this.ar() * 3;
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         float $$0 = azm.b((float)(this.m() + this.af) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = azm.b((float)(this.m() + this.af + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awn.ul, this.dm(), 0.95F + this.ae.i() * 0.05F, 0.95F + this.ae.i() * 0.05F, false);
         }

         float $$2 = this.dq() * 1.48F;
         float $$3 = azm.b(this.dL() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = azm.a(this.dL() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dr() * 2.5F;
         this.dV().a(lx.ac, this.dA() + (double)$$3, this.dC() + (double)$$5, this.dG() + (double)$$4, 0.0, 0.0, 0.0);
         this.dV().a(lx.ac, this.dA() - (double)$$3, this.dC() + (double)$$5, this.dG() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void k_() {
      if (this.bK() && this.gl()) {
         this.e(8.0F);
      }

      super.k_();
   }

   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      this.bF = this.dv().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bF = new iu($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("AX", this.bF.u());
      $$0.a("AY", this.bF.v());
      $$0.a("AZ", this.bF.w());
      $$0.a("Size", this.j());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public awo dm() {
      return awo.f;
   }

   @Override
   protected awm u() {
      return awn.ui;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.um;
   }

   @Override
   protected awm l_() {
      return awn.uk;
   }

   @Override
   protected float fe() {
      return 1.0F;
   }

   @Override
   public boolean a(bwo<?> $$0) {
      return true;
   }

   @Override
   public bwi e(bxq $$0) {
      int $$1 = this.j();
      bwi $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   boolean a(arq $$0, bxe $$1, cht $$2) {
      return $$2.a($$0, this, $$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cea {
      private final cht b = cht.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            arq $$0 = a(cof.this.dV());
            List<crc> $$1 = $$0.a(this.b, cof.this, cof.this.cR().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
               $$1.sort(Comparator.comparing(bwf::dC).reversed());

               for (crc $$2 : $$1) {
                  if (cof.this.a($$0, $$2, cht.a)) {
                     cof.this.g($$2);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bxe $$0 = cof.this.f();
         return $$0 != null ? cof.this.a(a(cof.this.dV()), $$0, cht.a) : false;
      }
   }

   class c extends cea {
      private int b;

      @Override
      public boolean b() {
         bxe $$0 = cof.this.f();
         return $$0 != null ? cof.this.a(a(cof.this.dV()), $$0, cht.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         cof.this.bG = cof.a.a;
         this.h();
      }

      @Override
      public void e() {
         cof.this.bF = cof.this.dV().a(egg.a.e, cof.this.bF).b(10 + cof.this.ae.a(20));
      }

      @Override
      public void a() {
         if (cof.this.bG == cof.a.a) {
            this.b--;
            if (this.b <= 0) {
               cof.this.bG = cof.a.b;
               this.h();
               this.b = this.a((8 + cof.this.ae.a(4)) * 20);
               cof.this.a(awn.un, 10.0F, 0.95F + cof.this.ae.i() * 0.1F);
            }
         }
      }

      private void h() {
         cof.this.bF = cof.this.f().dv().b(20 + cof.this.ae.a(20));
         if (cof.this.bF.v() < cof.this.dV().P()) {
            cof.this.bF = new iu(cof.this.bF.u(), cof.this.dV().P() + 1, cof.this.bF.w());
         }
      }
   }

   class d extends ccy {
      public d(final bxg $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cof.this.aX = cof.this.aV;
         cof.this.aV = cof.this.dL();
      }
   }

   class e extends cof.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return cof.this.f() == null || cof.this.bG == cof.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + cof.this.ae.i() * 10.0F;
         this.e = -4.0F + cof.this.ae.i() * 9.0F;
         this.f = cof.this.ae.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (cof.this.ae.a(this.a(350)) == 0) {
            this.e = -4.0F + cof.this.ae.i() * 9.0F;
         }

         if (cof.this.ae.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cof.this.ae.a(this.a(450)) == 0) {
            this.c = cof.this.ae.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cof.this.d.e < cof.this.dC() && !cof.this.dV().v(cof.this.dv().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cof.this.d.e > cof.this.dC() && !cof.this.dV().v(cof.this.dv().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (iu.c.equals(cof.this.bF)) {
            cof.this.bF = cof.this.dv();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cof.this.d = feq.a(cof.this.bF).b((double)(this.d * azm.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * azm.a(this.c)));
      }
   }

   static class f extends cdc {
      public f(bxg $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends cdd {
      private float m = 0.1F;

      public g(final bxg $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cof.this.P) {
            cof.this.w(cof.this.dL() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cof.this.d.d - cof.this.dA();
         double $$1 = cof.this.d.e - cof.this.dC();
         double $$2 = cof.this.d.f - cof.this.dG();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cof.this.dL();
            float $$7 = (float)azm.d($$2, $$0);
            float $$8 = azm.h(cof.this.dL() + 90.0F);
            float $$9 = azm.h($$7 * (180.0F / (float)Math.PI));
            cof.this.w(azm.e($$8, $$9, 4.0F) - 90.0F);
            cof.this.aV = cof.this.dL();
            if (azm.d($$6, cof.this.dL()) < 3.0F) {
               this.m = azm.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = azm.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(azm.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cof.this.x($$10);
            float $$11 = cof.this.dL() + 90.0F;
            double $$12 = (double)(this.m * azm.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * azm.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * azm.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            feq $$15 = cof.this.dy();
            cof.this.i($$15.e(new feq($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends cea {
      public h() {
         this.a(EnumSet.of(cea.a.a));
      }

      protected boolean h() {
         return cof.this.d.c(cof.this.dA(), cof.this.dC(), cof.this.dG()) < 4.0;
      }
   }

   class i extends cof.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return cof.this.f() != null && cof.this.bG == cof.a.b;
      }

      @Override
      public boolean c() {
         bxe $$0 = cof.this.f();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bK()) {
            return false;
         } else {
            if ($$0 instanceof crc $$1 && ($$0.V_() || $$1.b())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (cof.this.af > this.e) {
                  this.e = cof.this.af + 20;
                  List<cix> $$2 = cof.this.dV().a(cix.class, cof.this.cR().g(16.0), bwm.a);

                  for (cix $$3 : $$2) {
                     $$3.gG();
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
         cof.this.g(null);
         cof.this.bG = cof.a.a;
      }

      @Override
      public void a() {
         bxe $$0 = cof.this.f();
         if ($$0 != null) {
            cof.this.d = new feq($$0.dA(), $$0.e(0.5), $$0.dG());
            if (cof.this.cR().g(0.2F).c($$0.cR())) {
               cof.this.c(a(cof.this.dV()), $$0);
               cof.this.bG = cof.a.a;
               if (!cof.this.bb()) {
                  cof.this.dV().c(1039, cof.this.dv(), 0);
               }
            } else if (cof.this.P || cof.this.aN > 0) {
               cof.this.bG = cof.a.a;
            }
         }
      }
   }
}
