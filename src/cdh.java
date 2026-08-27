import javax.annotation.Nullable;

public class cdh extends cdf implements bqn<cdo> {
   private static final aim<Integer> bX = aiq.a(cdh.class, aio.b);
   private static final boz bY = bpc.ab.n().a(boy.a().a(box.a, 0.0F, bpc.ab.l() + 0.125F, 0.0F)).a(0.5F);

   public cdh(bpc<? extends cdh> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(axd $$0) {
      this.f(bqv.q).a((double)a($$0::a));
      this.f(bqv.r).a(b($$0::j));
      this.f(bqv.m).a(a($$0::j));
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

   private void a(cdo $$0, cdj $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cdo r() {
      return cdo.a(this.gn() & 0xFF);
   }

   public void a(cdo $$0) {
      this.x($$0.a() & 0xFF | this.gn() & -256);
   }

   public cdj s() {
      return cdj.a((this.gn() & 0xFF00) >> 8);
   }

   @Override
   public void a(bmv $$0) {
      cqk $$1 = this.fP();
      super.a($$0);
      cqk $$2 = this.fP();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(aty.mn, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dhm $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(aty.mo, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected atx v() {
      return aty.ml;
   }

   @Override
   protected atx n_() {
      return aty.mp;
   }

   @Nullable
   @Override
   protected atx gu() {
      return aty.mq;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.ms;
   }

   @Override
   protected atx gL() {
      return aty.mm;
   }

   @Override
   public bnc b(cis $$0, bnb $$1) {
      boolean $$2 = !this.o_() && this.gC() && $$0.fO();
      if (!this.bP() && !$$2) {
         cqk $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gC()) {
               this.gS();
               return bnc.a(this.dM().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cbd $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cdg) && !($$0 instanceof cdh) ? false : this.gU() && ((cdf)$$0).gU();
      }
   }

   @Nullable
   @Override
   public bor a(apf $$0, bor $$1) {
      if ($$1 instanceof cdg) {
         cdk $$2 = bpc.as.a((cwz)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cdh $$3 = (cdh)$$1;
         cdh $$4 = bpc.ab.a((cwz)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            cdo $$6;
            if ($$5 < 4) {
               $$6 = this.r();
            } else if ($$5 < 8) {
               $$6 = $$3.r();
            } else {
               $$6 = ac.a(cdo.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            cdj $$10;
            if ($$9 < 2) {
               $$10 = this.s();
            } else if ($$9 < 4) {
               $$10 = $$3.s();
            } else {
               $$10 = ac.a(cdj.values(), this.ag);
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
   public boolean l(cqk $$0) {
      if ($$0.d() instanceof cnv $$1 && $$1.c() == cnv.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      axd $$4 = $$0.E_();
      cdo $$5;
      if ($$3 instanceof cdh.a) {
         $$5 = ((cdh.a)$$3).a;
      } else {
         $$5 = ac.a(cdo.values(), $$4);
         $$3 = new cdh.a($$5);
      }

      this.a($$5, ac.a(cdj.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boz e(bpz $$0) {
      return this.o_() ? bY : super.e($$0);
   }

   public static class a extends bor.a {
      public final cdo a;

      public a(cdo $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
