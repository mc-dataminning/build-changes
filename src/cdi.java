import javax.annotation.Nullable;

public class cdi extends cdg implements bqo<cdp> {
   private static final aim<Integer> bX = aiq.a(cdi.class, aio.b);
   private static final bpa bY = bpd.ac.n().a(boz.a().a(boy.a, 0.0F, bpd.ac.l() + 0.125F, 0.0F)).a(0.5F);

   public cdi(bpd<? extends cdi> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(axd $$0) {
      this.f(bqw.q).a((double)a($$0::a));
      this.f(bqw.r).a(b($$0::j));
      this.f(bqw.m).a(a($$0::j));
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(bX, 0);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Variant", this.gn());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.an.a(bX, $$0);
   }

   private int gn() {
      return this.an.a(bX);
   }

   private void a(cdp $$0, cdk $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cdp r() {
      return cdp.a(this.gn() & 0xFF);
   }

   public void a(cdp $$0) {
      this.x($$0.a() & 0xFF | this.gn() & -256);
   }

   public cdk s() {
      return cdk.a((this.gn() & 0xFF00) >> 8);
   }

   @Override
   public void a(bmw $$0) {
      cqm $$1 = this.fP();
      super.a($$0);
      cqm $$2 = this.fP();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(aty.mr, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dho $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(aty.ms, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected atx v() {
      return aty.mp;
   }

   @Override
   protected atx n_() {
      return aty.mt;
   }

   @Nullable
   @Override
   protected atx gu() {
      return aty.mu;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.mw;
   }

   @Override
   protected atx gL() {
      return aty.mq;
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      boolean $$2 = !this.o_() && this.gC() && $$0.fO();
      if (!this.bP() && !$$2) {
         cqm $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gC()) {
               this.gS();
               return bnd.a(this.dM().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cbe $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cdh) && !($$0 instanceof cdi) ? false : this.gU() && ((cdg)$$0).gU();
      }
   }

   @Nullable
   @Override
   public bos a(apf $$0, bos $$1) {
      if ($$1 instanceof cdh) {
         cdl $$2 = bpd.at.a((cxb)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cdi $$3 = (cdi)$$1;
         cdi $$4 = bpd.ac.a((cxb)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            cdp $$6;
            if ($$5 < 4) {
               $$6 = this.r();
            } else if ($$5 < 8) {
               $$6 = $$3.r();
            } else {
               $$6 = ac.a(cdp.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            cdk $$10;
            if ($$9 < 2) {
               $$10 = this.s();
            } else if ($$9 < 4) {
               $$10 = $$3.s();
            } else {
               $$10 = ac.a(cdk.values(), this.ag);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean fQ() {
      return true;
   }

   @Override
   public boolean l(cqm $$0) {
      if ($$0.d() instanceof cnx $$1 && $$1.c() == cnx.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      axd $$4 = $$0.E_();
      cdp $$5;
      if ($$3 instanceof cdi.a) {
         $$5 = ((cdi.a)$$3).a;
      } else {
         $$5 = ac.a(cdp.values(), $$4);
         $$3 = new cdi.a($$5);
      }

      this.a($$5, ac.a(cdk.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bpa e(bqa $$0) {
      return this.o_() ? bY : super.e($$0);
   }

   public static class a extends bos.a {
      public final cdp a;

      public a(cdp $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
