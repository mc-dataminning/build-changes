import javax.annotation.Nullable;

public class cez extends cex implements bsd<cfg> {
   private static final ajk<Integer> bY = ajo.a(cez.class, ajm.b);
   private static final bqo bZ = bqr.ab.n().a(bqn.a().a(bqm.a, 0.0F, bqr.ab.l() + 0.125F, 0.0F)).a(0.5F);

   public cez(bqr<? extends cez> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ayd $$0) {
      this.f(bsl.q).a((double)a($$0::a));
      this.f(bsl.r).a(b($$0::j));
      this.f(bsl.m).a(a($$0::j));
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("Variant", this.gp());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.ao.a(bY, $$0);
   }

   private int gp() {
      return this.ao.a(bY);
   }

   private void a(cfg $$0, cfb $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cfg r() {
      return cfg.a(this.gp() & 0xFF);
   }

   public void a(cfg $$0) {
      this.x($$0.a() & 0xFF | this.gp() & -256);
   }

   public cfb u() {
      return cfb.a((this.gp() & 0xFF00) >> 8);
   }

   @Override
   public void a(boj $$0) {
      csd $$1 = this.fQ();
      super.a($$0);
      csd $$2 = this.fQ();
      if (this.ai > 20 && this.l($$2) && $$1 != $$2) {
         this.a(auz.my, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dki $$0) {
      super.a($$0);
      if (this.ah.a(10) == 0) {
         this.a(auz.mz, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected auy v() {
      return auz.mw;
   }

   @Override
   protected auy o_() {
      return auz.mA;
   }

   @Nullable
   @Override
   protected auy gw() {
      return auz.mB;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.mD;
   }

   @Override
   protected auy gN() {
      return auz.mx;
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      boolean $$2 = !this.p_() && this.gE() && $$0.fP();
      if (!this.bQ() && !$$2) {
         csd $$3 = $$0.b($$1);
         if (!$$3.d()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gE()) {
               this.gU();
               return boq.a(this.dN().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cct $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cey) && !($$0 instanceof cez) ? false : this.gW() && ((cex)$$0).gW();
      }
   }

   @Nullable
   @Override
   public bqf a(aqe $$0, bqf $$1) {
      if ($$1 instanceof cey) {
         cfc $$2 = bqr.as.a((czu)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cez $$3 = (cez)$$1;
         cez $$4 = bqr.ab.a((czu)$$0);
         if ($$4 != null) {
            int $$5 = this.ah.a(9);
            cfg $$6;
            if ($$5 < 4) {
               $$6 = this.r();
            } else if ($$5 < 8) {
               $$6 = $$3.r();
            } else {
               $$6 = ac.a(cfg.values(), this.ah);
            }

            int $$9 = this.ah.a(5);
            cfb $$10;
            if ($$9 < 2) {
               $$10 = this.u();
            } else if ($$9 < 4) {
               $$10 = $$3.u();
            } else {
               $$10 = ac.a(cfb.values(), this.ah);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean fR() {
      return true;
   }

   @Override
   public boolean l(csd $$0) {
      if ($$0.f() instanceof cpr $$1 && $$1.d() == cpr.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      ayd $$4 = $$0.E_();
      cfg $$5;
      if ($$3 instanceof cez.a) {
         $$5 = ((cez.a)$$3).a;
      } else {
         $$5 = ac.a(cfg.values(), $$4);
         $$3 = new cez.a($$5);
      }

      this.a($$5, ac.a(cfb.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bqo e(brp $$0) {
      return this.p_() ? bZ : super.e($$0);
   }

   public static class a extends bqf.a {
      public final cfg a;

      public a(cfg $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
