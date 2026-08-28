import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class com extends bwx implements coc {
   public static final float a = 7.448451F;
   public static final int b = azm.f(24.166098F);
   private static final akj<Integer> c = akn.a(com.class, akl.b);
   fex d = fex.c;
   @Nullable
   iv bF;
   com.a bG = com.a.a;

   public com(bwr<? extends com> $$0, djh $$1) {
      super($$0, $$1);
      this.by = 5;
      this.bA = new com.g(this);
      this.bz = new com.f(this);
   }

   @Override
   public boolean aY() {
      return (this.m() + this.af) % b == 0;
   }

   @Override
   protected cdd I() {
      return new com.d(this);
   }

   @Override
   protected void D() {
      this.bD.a(1, new com.c());
      this.bD.a(2, new com.i());
      this.bD.a(3, new com.e());
      this.bE.a(1, new com.b());
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
      this.g(byp.c).a((double)(6 + this.j()));
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
      return this.ao() * 3;
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   public void h() {
      super.h();
      if (this.dU().C) {
         float $$0 = azm.b((float)(this.m() + this.af) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = azm.b((float)(this.m() + this.af + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dU().a(this.dz(), this.dB(), this.dF(), awn.ul, this.dl(), 0.95F + this.ae.i() * 0.05F, 0.95F + this.ae.i() * 0.05F, false);
         }

         float $$2 = this.dp() * 1.48F;
         float $$3 = azm.b(this.dK() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = azm.a(this.dK() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dq() * 2.5F;
         this.dU().a(ly.ac, this.dz() + (double)$$3, this.dB() + (double)$$5, this.dF() + (double)$$4, 0.0, 0.0, 0.0);
         this.dU().a(ly.ac, this.dz() - (double)$$3, this.dB() + (double)$$5, this.dF() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void k_() {
      if (this.bI() && this.gn()) {
         this.e(8.0F);
      }

      super.k_();
   }

   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      this.bF = this.du().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bF = $$0.<iv>a("anchor_pos", iv.a).orElse(null);
      this.b($$0.f("size"));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.b("anchor_pos", iv.a, this.bF);
      $$0.a("size", this.j());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public awo dl() {
      return awo.f;
   }

   @Override
   protected awm u() {
      return awn.ui;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.um;
   }

   @Override
   protected awm l_() {
      return awn.uk;
   }

   @Override
   protected float fd() {
      return 1.0F;
   }

   @Override
   public boolean a(bwr<?> $$0) {
      return true;
   }

   @Override
   public bwl e(bxv $$0) {
      int $$1 = this.j();
      bwl $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   boolean a(arq $$0, bxj $$1, chy $$2) {
      return $$2.a($$0, this, $$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cef {
      private final chy b = chy.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            arq $$0 = a(com.this.dU());
            List<crj> $$1 = $$0.a(this.b, com.this, com.this.cQ().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
               $$1.sort(Comparator.comparing(bwi::dB).reversed());

               for (crj $$2 : $$1) {
                  if (com.this.a($$0, $$2, chy.a)) {
                     com.this.g($$2);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bxj $$0 = com.this.f();
         return $$0 != null ? com.this.a(a(com.this.dU()), $$0, chy.a) : false;
      }
   }

   class c extends cef {
      private int b;

      @Override
      public boolean b() {
         bxj $$0 = com.this.f();
         return $$0 != null ? com.this.a(a(com.this.dU()), $$0, chy.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         com.this.bG = com.a.a;
         this.h();
      }

      @Override
      public void e() {
         if (com.this.bF != null) {
            com.this.bF = com.this.dU().a(egn.a.e, com.this.bF).b(10 + com.this.ae.a(20));
         }
      }

      @Override
      public void a() {
         if (com.this.bG == com.a.a) {
            this.b--;
            if (this.b <= 0) {
               com.this.bG = com.a.b;
               this.h();
               this.b = this.a((8 + com.this.ae.a(4)) * 20);
               com.this.a(awn.un, 10.0F, 0.95F + com.this.ae.i() * 0.1F);
            }
         }
      }

      private void h() {
         if (com.this.bF != null) {
            com.this.bF = com.this.f().du().b(20 + com.this.ae.a(20));
            if (com.this.bF.v() < com.this.dU().P()) {
               com.this.bF = new iv(com.this.bF.u(), com.this.dU().P() + 1, com.this.bF.w());
            }
         }
      }
   }

   class d extends cdd {
      public d(final bxl $$0) {
         super($$0);
      }

      @Override
      public void a() {
         com.this.aX = com.this.aV;
         com.this.aV = com.this.dK();
      }
   }

   class e extends com.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return com.this.f() == null || com.this.bG == com.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + com.this.ae.i() * 10.0F;
         this.e = -4.0F + com.this.ae.i() * 9.0F;
         this.f = com.this.ae.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (com.this.ae.a(this.a(350)) == 0) {
            this.e = -4.0F + com.this.ae.i() * 9.0F;
         }

         if (com.this.ae.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (com.this.ae.a(this.a(450)) == 0) {
            this.c = com.this.ae.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (com.this.d.e < com.this.dB() && !com.this.dU().v(com.this.du().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (com.this.d.e > com.this.dB() && !com.this.dU().v(com.this.du().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (com.this.bF == null) {
            com.this.bF = com.this.du();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         com.this.d = fex.a(com.this.bF).b((double)(this.d * azm.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * azm.a(this.c)));
      }
   }

   static class f extends cdh {
      public f(bxl $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends cdi {
      private float m = 0.1F;

      public g(final bxl $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (com.this.P) {
            com.this.w(com.this.dK() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = com.this.d.d - com.this.dz();
         double $$1 = com.this.d.e - com.this.dB();
         double $$2 = com.this.d.f - com.this.dF();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = com.this.dK();
            float $$7 = (float)azm.d($$2, $$0);
            float $$8 = azm.h(com.this.dK() + 90.0F);
            float $$9 = azm.h($$7 * (180.0F / (float)Math.PI));
            com.this.w(azm.e($$8, $$9, 4.0F) - 90.0F);
            com.this.aV = com.this.dK();
            if (azm.d($$6, com.this.dK()) < 3.0F) {
               this.m = azm.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = azm.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(azm.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            com.this.x($$10);
            float $$11 = com.this.dK() + 90.0F;
            double $$12 = (double)(this.m * azm.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * azm.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * azm.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            fex $$15 = com.this.dx();
            com.this.i($$15.e(new fex($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends cef {
      public h() {
         this.a(EnumSet.of(cef.a.a));
      }

      protected boolean h() {
         return com.this.d.c(com.this.dz(), com.this.dB(), com.this.dF()) < 4.0;
      }
   }

   class i extends com.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return com.this.f() != null && com.this.bG == com.a.b;
      }

      @Override
      public boolean c() {
         bxj $$0 = com.this.f();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bI()) {
            return false;
         } else {
            if ($$0 instanceof crj $$1 && ($$0.V_() || $$1.b())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (com.this.af > this.e) {
                  this.e = com.this.af + 20;
                  List<cjc> $$2 = com.this.dU().a(cjc.class, com.this.cQ().g(16.0), bwp.a);

                  for (cjc $$3 : $$2) {
                     $$3.gI();
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
         com.this.g(null);
         com.this.bG = com.a.a;
      }

      @Override
      public void a() {
         bxj $$0 = com.this.f();
         if ($$0 != null) {
            com.this.d = new fex($$0.dz(), $$0.e(0.5), $$0.dF());
            if (com.this.cQ().g(0.2F).c($$0.cQ())) {
               com.this.c(a(com.this.dU()), $$0);
               com.this.bG = com.a.a;
               if (!com.this.aZ()) {
                  com.this.dU().c(1039, com.this.du(), 0);
               }
            } else if (com.this.P || com.this.aN > 0) {
               com.this.bG = com.a.a;
            }
         }
      }
   }
}
