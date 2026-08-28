import javax.annotation.Nullable;

public class cje extends cjc implements bwh<cjl> {
   private static final ajy<Integer> bY = akc.a(cje.class, aka.b);
   private static final buo bZ = bus.al.n().a(bun.a().a(bum.a, 0.0F, bus.al.m() + 0.125F, 0.0F)).a(0.5F);

   public cje(bus<? extends cje> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azh $$0) {
      this.g(bwp.s).a((double)a($$0::a));
      this.g(bwp.v).a(b($$0::j));
      this.g(bwp.o).a(a($$0::j));
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

   private void a(cjl $$0, cjg $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cjl p() {
      return cjl.a(this.x() & 0xFF);
   }

   public void a(cjl $$0) {
      this.w($$0.a() & 0xFF | this.x() & -256);
   }

   public cjg t() {
      return cjg.a((this.x() & 0xFF00) >> 8);
   }

   @Override
   protected void a(dre $$0) {
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
   protected avz e(btb $$0) {
      return awa.nl;
   }

   @Override
   protected avz gT() {
      return awa.nf;
   }

   @Override
   public bsk b(cox $$0, bsj $$1) {
      boolean $$2 = !this.e_() && this.gJ() && $$0.fY();
      if (!this.ca() && !$$2) {
         cwp $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gJ()) {
               this.gZ();
               return bsk.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cgy $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cjd) && !($$0 instanceof cje) ? false : this.hb() && ((cjc)$$0).hb();
      }
   }

   @Nullable
   @Override
   public buc a(ard $$0, buc $$1) {
      if ($$1 instanceof cjd) {
         cjh $$2 = bus.aF.a($$0, bur.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cje $$3 = (cje)$$1;
         cje $$4 = bus.al.a($$0, bur.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            cjl $$6;
            if ($$5 < 4) {
               $$6 = this.p();
            } else if ($$5 < 8) {
               $$6 = $$3.p();
            } else {
               $$6 = af.a(cjl.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            cjg $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = af.a(cjg.values(), this.ae);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(but $$0) {
      return true;
   }

   @Override
   protected void c(btb $$0, float $$1) {
      this.a($$0, $$1, new but[]{but.g});
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      azh $$4 = $$0.H_();
      cjl $$5;
      if ($$3 instanceof cje.a) {
         $$5 = ((cje.a)$$3).a;
      } else {
         $$5 = af.a(cjl.values(), $$4);
         $$3 = new cje.a($$5);
      }

      this.a($$5, af.a(cjg.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? bZ : super.e($$0);
   }

   public static class a extends buc.a {
      public final cjl a;

      public a(cjl $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
