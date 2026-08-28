import javax.annotation.Nullable;

public class cjc extends cja implements bwf<cjj> {
   private static final ajx<Integer> bY = akb.a(cjc.class, ajz.b);
   private static final bum bZ = buq.al.n().a(bul.a().a(buk.a, 0.0F, buq.al.m() + 0.125F, 0.0F)).a(0.5F);

   public cjc(buq<? extends cjc> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azg $$0) {
      this.g(bwn.s).a((double)a($$0::a));
      this.g(bwn.v).a(b($$0::j));
      this.g(bwn.o).a(a($$0::j));
   }

   @Override
   protected void a(akb.a $$0) {
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

   private void a(cjj $$0, cje $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cjj p() {
      return cjj.a(this.x() & 0xFF);
   }

   public void a(cjj $$0) {
      this.w($$0.a() & 0xFF | this.x() & -256);
   }

   public cje t() {
      return cje.a((this.x() & 0xFF00) >> 8);
   }

   @Override
   protected void a(drc $$0) {
      super.a($$0);
      if (this.ae.a(10) == 0) {
         this.a(avz.nh, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected avy u() {
      return avz.ne;
   }

   @Override
   protected avy o_() {
      return avz.ni;
   }

   @Nullable
   @Override
   protected avy gr() {
      return avz.nj;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.nl;
   }

   @Override
   protected avy gQ() {
      return avz.nf;
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      boolean $$2 = !this.e_() && this.gG() && $$0.fY();
      if (!this.ca() && !$$2) {
         cwn $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gG()) {
               this.gW();
               return bsi.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cgw $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cjb) && !($$0 instanceof cjc) ? false : this.gY() && ((cja)$$0).gY();
      }
   }

   @Nullable
   @Override
   public bua a(arc $$0, bua $$1) {
      if ($$1 instanceof cjb) {
         cjf $$2 = buq.aF.a($$0, bup.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cjc $$3 = (cjc)$$1;
         cjc $$4 = buq.al.a($$0, bup.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            cjj $$6;
            if ($$5 < 4) {
               $$6 = this.p();
            } else if ($$5 < 8) {
               $$6 = $$3.p();
            } else {
               $$6 = af.a(cjj.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            cje $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = af.a(cje.values(), this.ae);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(bur $$0) {
      return true;
   }

   @Override
   protected void c(bsz $$0, float $$1) {
      this.a($$0, $$1, new bur[]{bur.g});
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      azg $$4 = $$0.H_();
      cjj $$5;
      if ($$3 instanceof cjc.a) {
         $$5 = ((cjc.a)$$3).a;
      } else {
         $$5 = af.a(cjj.values(), $$4);
         $$3 = new cjc.a($$5);
      }

      this.a($$5, af.a(cje.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bum e(bvr $$0) {
      return this.e_() ? bZ : super.e($$0);
   }

   public static class a extends bua.a {
      public final cjj a;

      public a(cjj $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
