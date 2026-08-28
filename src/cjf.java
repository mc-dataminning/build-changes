import javax.annotation.Nullable;

public class cjf extends cjd implements bwi<cjm> {
   private static final ajy<Integer> bY = akc.a(cjf.class, aka.b);
   private static final bup bZ = but.al.n().a(buo.a().a(bun.a, 0.0F, but.al.m() + 0.125F, 0.0F)).a(0.5F);

   public cjf(but<? extends cjf> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azh $$0) {
      this.g(bwq.s).a((double)a($$0::a));
      this.g(bwq.v).a(b($$0::j));
      this.g(bwq.o).a(a($$0::j));
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Variant", this.x());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.al.a(bY, $$0);
   }

   private int x() {
      return this.al.a(bY);
   }

   private void a(cjm $$0, cjh $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cjm p() {
      return cjm.a(this.x() & 0xFF);
   }

   public void a(cjm $$0) {
      this.w($$0.a() & 0xFF | this.x() & -256);
   }

   public cjh t() {
      return cjh.a((this.x() & 0xFF00) >> 8);
   }

   @Override
   protected void a(drf $$0) {
      super.a($$0);
      if (this.ae.a(10) == 0) {
         this.a(awa.nh, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected avz u() {
      return awa.ne;
   }

   @Override
   protected avz o_() {
      return awa.ni;
   }

   @Nullable
   @Override
   protected avz gu() {
      return awa.nj;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.nl;
   }

   @Override
   protected avz gT() {
      return awa.nf;
   }

   @Override
   public bsl b(coy $$0, bsk $$1) {
      boolean $$2 = !this.e_() && this.gJ() && $$0.fY();
      if (!this.ca() && !$$2) {
         cwq $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gJ()) {
               this.gZ();
               return bsl.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cgz $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cje) && !($$0 instanceof cjf) ? false : this.hb() && ((cjd)$$0).hb();
      }
   }

   @Nullable
   @Override
   public bud a(ard $$0, bud $$1) {
      if ($$1 instanceof cje) {
         cji $$2 = but.aF.a($$0, bus.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cjf $$3 = (cjf)$$1;
         cjf $$4 = but.al.a($$0, bus.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            cjm $$6;
            if ($$5 < 4) {
               $$6 = this.p();
            } else if ($$5 < 8) {
               $$6 = $$3.p();
            } else {
               $$6 = af.a(cjm.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            cjh $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = af.a(cjh.values(), this.ae);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(buu $$0) {
      return true;
   }

   @Override
   protected void c(btc $$0, float $$1) {
      this.a($$0, $$1, new buu[]{buu.g});
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      azh $$4 = $$0.H_();
      cjm $$5;
      if ($$3 instanceof cjf.a) {
         $$5 = ((cjf.a)$$3).a;
      } else {
         $$5 = af.a(cjm.values(), $$4);
         $$3 = new cjf.a($$5);
      }

      this.a($$5, af.a(cjh.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bup e(bvu $$0) {
      return this.e_() ? bZ : super.e($$0);
   }

   public static class a extends bud.a {
      public final cjm a;

      public a(cjm $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
