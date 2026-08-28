import javax.annotation.Nullable;

public class cje extends cjc implements bwh<cjl> {
   private static final akm<Integer> bY = akq.a(cje.class, ako.b);
   private static final buo bZ = bus.ak.n().a(bun.a().a(bum.a, 0.0F, bus.ak.m() + 0.125F, 0.0F)).a(0.5F);

   public cje(bus<? extends cje> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azu $$0) {
      this.g(bwp.s).a((double)a($$0::a));
      this.g(bwp.v).a(b($$0::j));
      this.g(bwp.o).a(a($$0::j));
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("Variant", this.v());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.al.a(bY, $$0);
   }

   private int v() {
      return this.al.a(bY);
   }

   private void a(cjl $$0, cjg $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cjl n() {
      return cjl.a(this.v() & 0xFF);
   }

   public void a(cjl $$0) {
      this.w($$0.a() & 0xFF | this.v() & -256);
   }

   public cjg q() {
      return cjg.a((this.v() & 0xFF00) >> 8);
   }

   @Override
   protected void a(dqd $$0) {
      super.a($$0);
      if (this.ae.a(10) == 0) {
         this.a(awn.mI, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected awm t() {
      return awn.mF;
   }

   @Override
   protected awm n_() {
      return awn.mJ;
   }

   @Nullable
   @Override
   protected awm go() {
      return awn.mK;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.mM;
   }

   @Override
   protected awm gN() {
      return awn.mG;
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      boolean $$2 = !this.e_() && this.gD() && $$0.fW();
      if (!this.ca() && !$$2) {
         cwm $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gD()) {
               this.gT();
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
         return !($$0 instanceof cjd) && !($$0 instanceof cje) ? false : this.gV() && ((cjc)$$0).gV();
      }
   }

   @Nullable
   @Override
   public buc a(arp $$0, buc $$1) {
      if ($$1 instanceof cjd) {
         cjh $$2 = bus.aE.a($$0, bur.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cje $$3 = (cje)$$1;
         cje $$4 = bus.ak.a($$0, bur.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            cjl $$6;
            if ($$5 < 4) {
               $$6 = this.n();
            } else if ($$5 < 8) {
               $$6 = $$3.n();
            } else {
               $$6 = ae.a(cjl.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            cjg $$10;
            if ($$9 < 2) {
               $$10 = this.q();
            } else if ($$9 < 4) {
               $$10 = $$3.q();
            } else {
               $$10 = ae.a(cjg.values(), this.ae);
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

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      azu $$4 = $$0.G_();
      cjl $$5;
      if ($$3 instanceof cje.a) {
         $$5 = ((cje.a)$$3).a;
      } else {
         $$5 = ae.a(cjl.values(), $$4);
         $$3 = new cje.a($$5);
      }

      this.a($$5, ae.a(cjg.values(), $$4));
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
