import javax.annotation.Nullable;

public class clj extends clh {
   private static final akj<Integer> bG = akn.a(clj.class, akl.b);
   private static final bwi bH = bwo.al.n().a(bwh.a().a(bwg.a, 0.0F, bwo.al.m() + 0.125F, 0.0F)).a(0.5F);

   public clj(bwo<? extends clj> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azv $$0) {
      this.g(byk.s).a((double)a($$0::a));
      this.g(byk.v).a(b($$0::j));
      this.g(byk.o).a(a($$0::j));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, 0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", this.x());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.al.a(bG, $$0);
   }

   private int x() {
      return this.al.a(bG);
   }

   private void a(clq $$0, cll $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public clq q() {
      return clq.a(this.x() & 0xFF);
   }

   private void a(clq $$0) {
      this.w($$0.a() & 0xFF | this.x() & -256);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aK ? c((ki<T>)$$0, this.q()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aK);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aK) {
         this.a(c(kj.aK, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public cll t() {
      return cll.a((this.x() & 0xFF00) >> 8);
   }

   @Override
   protected void a(duc $$0) {
      super.a($$0);
      if (this.ae.a(10) == 0) {
         this.a(awn.nl, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected awm u() {
      return awn.ni;
   }

   @Override
   protected awm l_() {
      return awn.nm;
   }

   @Nullable
   @Override
   protected awm gt() {
      return awn.nn;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.np;
   }

   @Override
   protected awm gR() {
      return awn.nj;
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      boolean $$2 = !this.n_() && this.gI() && $$0.fY();
      if (!this.ca() && !$$2) {
         czd $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.i($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gI()) {
               this.gX();
               return bud.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(ciu $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cli) && !($$0 instanceof clj) ? false : this.gZ() && ((clh)$$0).gZ();
      }
   }

   @Nullable
   @Override
   public bvv a(arq $$0, bvv $$1) {
      if ($$1 instanceof cli) {
         clm $$2 = bwo.aF.a($$0, bwn.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         clj $$3 = (clj)$$1;
         clj $$4 = bwo.al.a($$0, bwn.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            clq $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = af.a(clq.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            cll $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = af.a(cll.values(), this.ae);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(bwp $$0) {
      return true;
   }

   @Override
   protected void c(buu $$0, float $$1) {
      this.a($$0, $$1, new bwp[]{bwp.g});
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      azv $$4 = $$0.C_();
      clq $$5;
      if ($$3 instanceof clj.a) {
         $$5 = ((clj.a)$$3).a;
      } else {
         $$5 = af.a(clq.values(), $$4);
         $$3 = new clj.a($$5);
      }

      this.a($$5, af.a(cll.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bwi e(bxq $$0) {
      return this.n_() ? bH : super.e($$0);
   }

   public static class a extends bvv.a {
      public final clq a;

      public a(clq $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
