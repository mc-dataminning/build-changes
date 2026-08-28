import javax.annotation.Nullable;

public class cjd extends cjb implements bwg<cjk> {
   private static final ajy<Integer> bY = akc.a(cjd.class, aka.b);
   private static final bun bZ = bur.al.n().a(bum.a().a(bul.a, 0.0F, bur.al.m() + 0.125F, 0.0F)).a(0.5F);

   public cjd(bur<? extends cjd> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azh $$0) {
      this.g(bwo.s).a((double)a($$0::a));
      this.g(bwo.v).a(b($$0::j));
      this.g(bwo.o).a(a($$0::j));
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

   private void a(cjk $$0, cjf $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cjk p() {
      return cjk.a(this.x() & 0xFF);
   }

   public void a(cjk $$0) {
      this.w($$0.a() & 0xFF | this.x() & -256);
   }

   public cjf t() {
      return cjf.a((this.x() & 0xFF00) >> 8);
   }

   @Override
   protected void a(drd $$0) {
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
   protected avz e(bta $$0) {
      return awa.nl;
   }

   @Override
   protected avz gT() {
      return awa.nf;
   }

   @Override
   public bsj b(cow $$0, bsi $$1) {
      boolean $$2 = !this.e_() && this.gJ() && $$0.fY();
      if (!this.ca() && !$$2) {
         cwo $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gJ()) {
               this.gZ();
               return bsj.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cgx $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cjc) && !($$0 instanceof cjd) ? false : this.hb() && ((cjb)$$0).hb();
      }
   }

   @Nullable
   @Override
   public bub a(ard $$0, bub $$1) {
      if ($$1 instanceof cjc) {
         cjg $$2 = bur.aF.a($$0, buq.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cjd $$3 = (cjd)$$1;
         cjd $$4 = bur.al.a($$0, buq.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            cjk $$6;
            if ($$5 < 4) {
               $$6 = this.p();
            } else if ($$5 < 8) {
               $$6 = $$3.p();
            } else {
               $$6 = af.a(cjk.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            cjf $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = af.a(cjf.values(), this.ae);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(bus $$0) {
      return true;
   }

   @Override
   protected void c(bta $$0, float $$1) {
      this.a($$0, $$1, new bus[]{bus.g});
   }

   @Nullable
   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      azh $$4 = $$0.H_();
      cjk $$5;
      if ($$3 instanceof cjd.a) {
         $$5 = ((cjd.a)$$3).a;
      } else {
         $$5 = af.a(cjk.values(), $$4);
         $$3 = new cjd.a($$5);
      }

      this.a($$5, af.a(cjf.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bun e(bvs $$0) {
      return this.e_() ? bZ : super.e($$0);
   }

   public static class a extends bub.a {
      public final cjk a;

      public a(cjk $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
