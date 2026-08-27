import javax.annotation.Nullable;

public class ceh extends cef implements brn<ceo> {
   private static final aiy<Integer> bX = ajc.a(ceh.class, aja.b);
   private static final bpy bY = bqb.ab.n().a(bpx.a().a(bpw.a, 0.0F, bqb.ab.l() + 0.125F, 0.0F)).a(0.5F);

   public ceh(bqb<? extends ceh> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(axr $$0) {
      this.f(brv.q).a((double)a($$0::a));
      this.f(brv.r).a(b($$0::j));
      this.f(brv.m).a(a($$0::j));
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(bX, 0);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("Variant", this.gn());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.an.a(bX, $$0);
   }

   private int gn() {
      return this.an.a(bX);
   }

   private void a(ceo $$0, cej $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public ceo r() {
      return ceo.a(this.gn() & 0xFF);
   }

   public void a(ceo $$0) {
      this.x($$0.a() & 0xFF | this.gn() & -256);
   }

   public cej u() {
      return cej.a((this.gn() & 0xFF00) >> 8);
   }

   @Override
   public void a(bnt $$0) {
      crj $$1 = this.fP();
      super.a($$0);
      crj $$2 = this.fP();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(aum.mt, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(djk $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(aum.mu, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected aul v() {
      return aum.mr;
   }

   @Override
   protected aul o_() {
      return aum.mv;
   }

   @Nullable
   @Override
   protected aul gu() {
      return aum.mw;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.my;
   }

   @Override
   protected aul gL() {
      return aum.ms;
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      boolean $$2 = !this.p_() && this.gC() && $$0.fO();
      if (!this.bP() && !$$2) {
         crj $$3 = $$0.b($$1);
         if (!$$3.d()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gC()) {
               this.gS();
               return boa.a(this.dM().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(ccd $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof ceg) && !($$0 instanceof ceh) ? false : this.gU() && ((cef)$$0).gU();
      }
   }

   @Nullable
   @Override
   public bpp a(aps $$0, bpp $$1) {
      if ($$1 instanceof ceg) {
         cek $$2 = bqb.as.a((cyx)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         ceh $$3 = (ceh)$$1;
         ceh $$4 = bqb.ab.a((cyx)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            ceo $$6;
            if ($$5 < 4) {
               $$6 = this.r();
            } else if ($$5 < 8) {
               $$6 = $$3.r();
            } else {
               $$6 = ac.a(ceo.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            cej $$10;
            if ($$9 < 2) {
               $$10 = this.u();
            } else if ($$9 < 4) {
               $$10 = $$3.u();
            } else {
               $$10 = ac.a(cej.values(), this.ag);
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
   public boolean l(crj $$0) {
      if ($$0.f() instanceof cox $$1 && $$1.d() == cox.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      axr $$4 = $$0.E_();
      ceo $$5;
      if ($$3 instanceof ceh.a) {
         $$5 = ((ceh.a)$$3).a;
      } else {
         $$5 = ac.a(ceo.values(), $$4);
         $$3 = new ceh.a($$5);
      }

      this.a($$5, ac.a(cej.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bpy e(bqz $$0) {
      return this.p_() ? bY : super.e($$0);
   }

   public static class a extends bpp.a {
      public final ceo a;

      public a(ceo $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
