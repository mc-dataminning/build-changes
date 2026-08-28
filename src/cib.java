import javax.annotation.Nullable;

public class cib extends chz implements bve<cii> {
   private static final akg<Integer> bZ = akk.a(cib.class, aki.b);
   private static final btm ca = btq.ab.n().a(btl.a().a(btk.a, 0.0F, btq.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public cib(btq<? extends cib> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azk $$0) {
      this.g(bvm.s).a((double)a($$0::a));
      this.g(bvm.v).a(b($$0::j));
      this.g(bvm.o).a(a($$0::j));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Variant", this.y());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.am.a(bZ, $$0);
   }

   private int y() {
      return this.am.a(bZ);
   }

   private void a(cii $$0, cid $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cii q() {
      return cii.a(this.y() & 0xFF);
   }

   public void a(cii $$0) {
      this.x($$0.a() & 0xFF | this.y() & -256);
   }

   public cid t() {
      return cid.a((this.y() & 0xFF00) >> 8);
   }

   @Override
   public void a(brd $$0) {
      cvl $$1 = this.fS();
      super.a($$0);
      cvl $$2 = this.fS();
      if (this.ag > 20 && this.m($$2) && $$1 != $$2) {
         this.a(awd.mJ, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(doj $$0) {
      super.a($$0);
      if (this.af.a(10) == 0) {
         this.a(awd.mK, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected awc w() {
      return awd.mH;
   }

   @Override
   protected awc n_() {
      return awd.mL;
   }

   @Nullable
   @Override
   protected awc gq() {
      return awd.mM;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.mO;
   }

   @Override
   protected awc gP() {
      return awd.mI;
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      boolean $$2 = !this.o_() && this.gF() && $$0.fR();
      if (!this.bX() && !$$2) {
         cvl $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.p($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gF()) {
               this.gW();
               return brk.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cfv $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cia) && !($$0 instanceof cib) ? false : this.gY() && ((chz)$$0).gY();
      }
   }

   @Nullable
   @Override
   public btc a(arg $$0, btc $$1) {
      if ($$1 instanceof cia) {
         cie $$2 = btq.at.a($$0, btp.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cib $$3 = (cib)$$1;
         cib $$4 = btq.ab.a($$0, btp.e);
         if ($$4 != null) {
            int $$5 = this.af.a(9);
            cii $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = ad.a(cii.values(), this.af);
            }

            int $$9 = this.af.a(5);
            cid $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = ad.a(cid.values(), this.af);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(btr $$0) {
      return true;
   }

   @Override
   public boolean m(cvl $$0) {
      if ($$0.h() instanceof ctb $$1 && $$1.d() == ctb.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      azk $$4 = $$0.C_();
      cii $$5;
      if ($$3 instanceof cib.a) {
         $$5 = ((cib.a)$$3).a;
      } else {
         $$5 = ad.a(cii.values(), $$4);
         $$3 = new cib.a($$5);
      }

      this.a($$5, ad.a(cid.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public btm e(bur $$0) {
      return this.o_() ? ca : super.e($$0);
   }

   public static class a extends btc.a {
      public final cii a;

      public a(cii $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
