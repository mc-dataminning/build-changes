import java.util.List;
import javax.annotation.Nullable;

public class cnu extends cns {
   public static final int cc = 8;
   public static final int cd = 45;
   private static final int ce = 4;
   private static final aks<Boolean> cf = akw.a(cnu.class, aku.k);
   private int cg;
   private boolean ch;
   private int ci;
   @Nullable
   jh cj;
   private int ck;

   public cnu(bvi<? extends cns> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(euh.q, 8.0F);
      this.a(euh.f, 8.0F);
      this.a(euh.i, 8.0F);
      this.a(euh.o, 0.0F);
      this.a(euh.n, 0.0F);
   }

   public void h(jh $$0) {
      this.cj = $$0;
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      if (this.dW().C) {
         return super.a($$0, $$1, $$2);
      } else if ($$1.a(axm.d)) {
         return super.a($$0, $$1, $$2);
      } else if (!this.a($$0, $$1) && this.cg <= 0) {
         bvb $$3 = $$1.c();
         if (!($$3 instanceof bvx) && !($$3 instanceof cqh)) {
            return false;
         } else {
            this.cg = 8;
            this.dW().a(this, (byte)66);
            if (this.dW().c_(this.cj) instanceof dvf $$4 && $$4.a(this)) {
               if ($$1.d() instanceof cpo) {
                  $$4.c();
               }

               this.f($$1);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(cf, false);
   }

   @Override
   public void d_() {
      if (this.cg > 0) {
         this.cg--;
      }

      super.d_();
   }

   @Override
   public void h() {
      if (!this.dW().C && (this.cj == null || !(this.dW().c_(this.cj) instanceof dvf $$0) || !$$0.a(this))) {
         this.cj = null;
         this.x(0.0F);
      }

      super.h();
      if (this.dW().C) {
         this.gx();
         this.gw();
      }
   }

   @Override
   protected void em() {
      if (this.gu()) {
         this.aP++;
         if (this.aP > 45 && !this.dW().B_() && !this.dR()) {
            this.gp();
         }
      } else {
         super.em();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 66) {
         this.cg = 8;
         this.f(this.dX().p());
      } else {
         super.b($$0);
      }
   }

   private void gx() {
      this.ca.a(this.cg > 0, this.af);
      this.cb.a(this.gu(), this.af);
   }

   @Override
   public void gp() {
      if (this.dW() instanceof arx $$0) {
         fbm $$1 = this.cR();
         fbr $$2 = $$1.f();
         double $$3 = $$1.b() * 0.3;
         double $$4 = $$1.c() * 0.3;
         double $$5 = $$1.d() * 0.3;
         $$0.a(new lk(ls.bh, dkf.u.m()), $$2.d, $$2.e, $$2.f, 100, $$3, $$4, $$5, 0.0);
         $$0.a(new lk(ls.bh, dkf.cB.m().b(dly.c, Boolean.valueOf(true))), $$2.d, $$2.e, $$2.f, 10, $$3, $$4, $$5, 0.0);
      }

      this.b(this.o_());
      this.a(eck.p);
      this.a(bvb.d.b);
   }

   public void h(@Nullable btr $$0) {
      if (this.bl >= 0 && $$0 != null && $$0.d() instanceof bvx $$1) {
         $$1.a(this, this.bl, $$0);
      }

      this.b(awv.gu);
   }

   @Override
   protected boolean r(bvb $$0) {
      return false;
   }

   @Override
   protected boolean bR() {
      return false;
   }

   @Override
   protected void p(bvb $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   protected cfj b(dgz $$0) {
      return new cnu.a(this, $$0);
   }

   public boolean gq() {
      List<cpo> $$0 = this.bF.c(cfb.j).orElse(List.of());
      if ($$0.isEmpty()) {
         this.ck = 0;
         return false;
      } else {
         fbm $$1 = this.cR();

         for (cpo $$2 : $$0) {
            if ($$1.d($$2.bF())) {
               this.ck++;
               return this.ck > 4;
            }
         }

         this.ck = 0;
         return false;
      }
   }

   public void gr() {
      this.al.a(cf, true);
   }

   public boolean gu() {
      return this.al.a(cf);
   }

   public boolean gv() {
      return this.ch;
   }

   public void gw() {
      if (this.aP > this.ci) {
         this.ci = this.aP + this.dZ().a(this.ch ? 2 : this.aP / 4, this.ch ? 8 : this.aP / 2);
         this.ch = !this.ch;
      }
   }

   class a extends cfi {
      a(final cns $$0, final dgz $$1) {
         super($$0, $$1);
      }

      @Override
      public void c() {
         if (cnu.this.p()) {
            super.c();
         }
      }

      @Override
      protected eug a(int $$0) {
         this.o = cnu.this.new b();
         this.o.a(true);
         return new eug(this.o, $$0);
      }
   }

   class b extends eum {
      private static final int m = 1024;

      @Override
      public euh a(euj $$0, int $$1, int $$2, int $$3) {
         jh $$4 = cnu.this.cj;
         if ($$4 == null) {
            return super.a($$0, $$1, $$2, $$3);
         } else {
            double $$5 = $$4.j(new kl($$1, $$2, $$3));
            return $$5 > 1024.0 && $$5 >= $$4.j($$0.b()) ? euh.a : super.a($$0, $$1, $$2, $$3);
         }
      }
   }
}
