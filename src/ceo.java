import javax.annotation.Nullable;

public class ceo extends cem implements brs<cev> {
   private static final aja<Integer> bX = aje.a(ceo.class, ajc.b);
   private static final bqd bY = bqg.ab.n().a(bqc.a().a(bqb.a, 0.0F, bqg.ab.l() + 0.125F, 0.0F)).a(0.5F);

   public ceo(bqg<? extends ceo> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(axt $$0) {
      this.f(bsa.q).a((double)a($$0::a));
      this.f(bsa.r).a(b($$0::j));
      this.f(bsa.m).a(a($$0::j));
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(bX, 0);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("Variant", this.gn());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.an.a(bX, $$0);
   }

   private int gn() {
      return this.an.a(bX);
   }

   private void a(cev $$0, ceq $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cev r() {
      return cev.a(this.gn() & 0xFF);
   }

   public void a(cev $$0) {
      this.x($$0.a() & 0xFF | this.gn() & -256);
   }

   public ceq u() {
      return ceq.a((this.gn() & 0xFF00) >> 8);
   }

   @Override
   public void a(bny $$0) {
      crs $$1 = this.fP();
      super.a($$0);
      crs $$2 = this.fP();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(auo.mt, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(djt $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(auo.mu, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected aun v() {
      return auo.mr;
   }

   @Override
   protected aun o_() {
      return auo.mv;
   }

   @Nullable
   @Override
   protected aun gu() {
      return auo.mw;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.my;
   }

   @Override
   protected aun gL() {
      return auo.ms;
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      boolean $$2 = !this.p_() && this.gC() && $$0.fO();
      if (!this.bP() && !$$2) {
         crs $$3 = $$0.b($$1);
         if (!$$3.d()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gC()) {
               this.gS();
               return bof.a(this.dM().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cci $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cen) && !($$0 instanceof ceo) ? false : this.gU() && ((cem)$$0).gU();
      }
   }

   @Nullable
   @Override
   public bpu a(apu $$0, bpu $$1) {
      if ($$1 instanceof cen) {
         cer $$2 = bqg.as.a((czg)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         ceo $$3 = (ceo)$$1;
         ceo $$4 = bqg.ab.a((czg)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            cev $$6;
            if ($$5 < 4) {
               $$6 = this.r();
            } else if ($$5 < 8) {
               $$6 = $$3.r();
            } else {
               $$6 = ac.a(cev.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            ceq $$10;
            if ($$9 < 2) {
               $$10 = this.u();
            } else if ($$9 < 4) {
               $$10 = $$3.u();
            } else {
               $$10 = ac.a(ceq.values(), this.ag);
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
   public boolean l(crs $$0) {
      if ($$0.f() instanceof cpg $$1 && $$1.d() == cpg.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      axt $$4 = $$0.E_();
      cev $$5;
      if ($$3 instanceof ceo.a) {
         $$5 = ((ceo.a)$$3).a;
      } else {
         $$5 = ac.a(cev.values(), $$4);
         $$3 = new ceo.a($$5);
      }

      this.a($$5, ac.a(ceq.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bqd e(bre $$0) {
      return this.p_() ? bY : super.e($$0);
   }

   public static class a extends bpu.a {
      public final cev a;

      public a(cev $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
