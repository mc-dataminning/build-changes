import javax.annotation.Nullable;

public class ckp extends ckn {
   private static final akg<Integer> bE = akk.a(ckp.class, aki.b);
   private static final bvv bF = bwb.al.n().a(bvu.a().a(bvt.a, 0.0F, bwb.al.m() + 0.125F, 0.0F)).a(0.5F);

   public ckp(bwb<? extends ckp> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azs $$0) {
      this.g(bxx.s).a((double)a($$0::a));
      this.g(bxx.v).a(b($$0::j));
      this.g(bxx.o).a(a($$0::j));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bE, 0);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Variant", this.x());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.al.a(bE, $$0);
   }

   private int x() {
      return this.al.a(bE);
   }

   private void a(ckw $$0, ckr $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public ckw q() {
      return ckw.a(this.x() & 0xFF);
   }

   private void a(ckw $$0) {
      this.w($$0.a() & 0xFF | this.x() & -256);
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      return $$0 == kx.aF ? b((kw<T>)$$0, this.q()) : super.a($$0);
   }

   @Override
   protected void a(kr $$0) {
      this.a($$0, kx.aF);
      super.a($$0);
   }

   @Override
   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.aF) {
         this.a(b(kx.aF, $$1));
         return true;
      } else {
         return super.d($$0, $$1);
      }
   }

   public ckr t() {
      return ckr.a((this.x() & 0xFF00) >> 8);
   }

   @Override
   protected void a(dsn $$0) {
      super.a($$0);
      if (this.ae.a(10) == 0) {
         this.a(awk.nh, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected awj u() {
      return awk.ne;
   }

   @Override
   protected awj l_() {
      return awk.ni;
   }

   @Nullable
   @Override
   protected awj gs() {
      return awk.nj;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.nl;
   }

   @Override
   protected awj gQ() {
      return awk.nf;
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      boolean $$2 = !this.n_() && this.gH() && $$0.fX();
      if (!this.ca() && !$$2) {
         cxy $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.k($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gH()) {
               this.gW();
               return btq.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cig $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cko) && !($$0 instanceof ckp) ? false : this.gY() && ((ckn)$$0).gY();
      }
   }

   @Nullable
   @Override
   public bvi a(arn $$0, bvi $$1) {
      if ($$1 instanceof cko) {
         cks $$2 = bwb.aF.a($$0, bwa.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         ckp $$3 = (ckp)$$1;
         ckp $$4 = bwb.al.a($$0, bwa.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            ckw $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = af.a(ckw.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            ckr $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = af.a(ckr.values(), this.ae);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(bwc $$0) {
      return true;
   }

   @Override
   protected void c(buh $$0, float $$1) {
      this.a($$0, $$1, new bwc[]{bwc.g});
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      azs $$4 = $$0.C_();
      ckw $$5;
      if ($$3 instanceof ckp.a) {
         $$5 = ((ckp.a)$$3).a;
      } else {
         $$5 = af.a(ckw.values(), $$4);
         $$3 = new ckp.a($$5);
      }

      this.a($$5, af.a(ckr.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bvv e(bxd $$0) {
      return this.n_() ? bF : super.e($$0);
   }

   public static class a extends bvi.a {
      public final ckw a;

      public a(ckw $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
