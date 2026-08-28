import java.util.List;
import javax.annotation.Nullable;

public class cnd extends cnb {
   public static final int cb = 8;
   public static final int cc = 45;
   private static final int cd = 4;
   private static final ajx<Boolean> ce = akb.a(cnd.class, ajz.k);
   private int cf;
   private boolean cg;
   private int ch;
   @Nullable
   ji ci;
   private int cj;

   public cnd(bur<? extends cnb> $$0, dgi $$1) {
      super($$0, $$1);
      this.a(etq.q, 8.0F);
      this.a(etq.f, 8.0F);
      this.a(etq.i, 8.0F);
      this.a(etq.o, 0.0F);
      this.a(etq.n, 0.0F);
   }

   public void h(ji $$0) {
      this.ci = $$0;
   }

   @Override
   public boolean a(arc $$0, bta $$1, float $$2) {
      if (this.dW().C) {
         return super.a($$0, $$1, $$2);
      } else if ($$1.a(awr.d)) {
         return super.a($$0, $$1, $$2);
      } else if (this.a($$0, $$1) || this.cf > 0) {
         return false;
      } else if (this.eF()) {
         return false;
      } else {
         cox $$3 = this.f($$1);
         buk $$4 = $$1.c();
         if (!($$4 instanceof bvg) && !($$4 instanceof cpq) && $$3 == null) {
            return false;
         } else {
            this.cf = 8;
            this.dW().a(this, (byte)66);
            if (this.dW().c_(this.ci) instanceof duo $$5 && $$5.a(this)) {
               if ($$3 != null) {
                  $$5.c();
               }

               this.g($$1);
            }

            return true;
         }
      }
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
   }

   @Override
   public void d_() {
      if (this.cf > 0) {
         this.cf--;
      }

      super.d_();
   }

   @Override
   public void h() {
      if (!this.dW().C && (this.ci == null || !(this.dW().c_(this.ci) instanceof duo $$0) || !$$0.a(this))) {
         this.x(0.0F);
      }

      super.h();
      if (this.dW().C) {
         this.gy();
         this.gx();
      }
   }

   @Override
   protected void em() {
      if (this.gv()) {
         this.aP++;
         if (this.aP > 45 && !this.dW().B_() && !this.dR()) {
            this.gq();
         }
      } else {
         super.em();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 66) {
         this.cf = 8;
         this.g(this.dX().p());
      } else {
         super.b($$0);
      }
   }

   private void gy() {
      this.bZ.a(this.cf > 0, this.af);
      this.ca.a(this.gv(), this.af);
   }

   @Override
   public void gq() {
      if (this.dW() instanceof arc $$0) {
         fav $$1 = this.cR();
         fba $$2 = $$1.f();
         double $$3 = $$1.b() * 0.3;
         double $$4 = $$1.c() * 0.3;
         double $$5 = $$1.d() * 0.3;
         $$0.a(new ll(lt.bh, djo.u.m()), $$2.d, $$2.e, $$2.f, 100, $$3, $$4, $$5, 0.0);
         $$0.a(new ll(lt.bh, djo.cB.m().b(dlh.c, Boolean.valueOf(true))), $$2.d, $$2.e, $$2.f, 10, $$3, $$4, $$5, 0.0);
      }

      this.b(this.o_());
      this.a(ebt.p);
      this.a(buk.d.b);
   }

   @Override
   public void i(@Nullable bta $$0) {
      if ($$0 != null && $$0.d() instanceof bvg $$1) {
         $$1.a(this, $$0);
      }

      this.b(awa.gu);
   }

   @Override
   protected boolean r(buk $$0) {
      return false;
   }

   @Override
   protected boolean bR() {
      return false;
   }

   @Override
   protected void p(buk $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   protected ces b(dgi $$0) {
      return new cnd.a(this, $$0);
   }

   public boolean gr() {
      List<cox> $$0 = this.bE.c(cek.j).orElse(List.of());
      if ($$0.isEmpty()) {
         this.cj = 0;
         return false;
      } else {
         fav $$1 = this.cR();

         for (cox $$2 : $$0) {
            if ($$1.d($$2.bF())) {
               this.cj++;
               return this.cj > 4;
            }
         }

         this.cj = 0;
         return false;
      }
   }

   public void gs() {
      this.al.a(ce, true);
   }

   public boolean gv() {
      return this.al.a(ce);
   }

   public boolean gw() {
      return this.cg;
   }

   public void gx() {
      if (this.aP > this.ch) {
         this.ch = this.aP + this.dZ().a(this.cg ? 2 : this.aP / 4, this.cg ? 8 : this.aP / 2);
         this.cg = !this.cg;
      }
   }

   class a extends cer {
      a(final cnb $$0, final dgi $$1) {
         super($$0, $$1);
      }

      @Override
      public void c() {
         if (cnd.this.p()) {
            super.c();
         }
      }

      @Override
      protected etp a(int $$0) {
         this.o = cnd.this.new b();
         this.o.a(true);
         return new etp(this.o, $$0);
      }
   }

   class b extends etv {
      private static final int m = 1024;

      @Override
      public etq a(ets $$0, int $$1, int $$2, int $$3) {
         ji $$4 = cnd.this.ci;
         if ($$4 == null) {
            return super.a($$0, $$1, $$2, $$3);
         } else {
            double $$5 = $$4.j(new km($$1, $$2, $$3));
            return $$5 > 1024.0 && $$5 >= $$4.j($$0.b()) ? etq.a : super.a($$0, $$1, $$2, $$3);
         }
      }
   }
}
