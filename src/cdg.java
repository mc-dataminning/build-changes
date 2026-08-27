import javax.annotation.Nullable;

public class cdg extends cby {
   public cdg(blz<? extends cdg> $$0, ctp $$1) {
      super($$0, $$1);
      this.a(efc.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bP.a(3, new bva<>(this, cdx.class, true));
      super.B();
   }

   @Override
   protected arr y() {
      return ars.Bq;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.Bs;
   }

   @Override
   protected arr n_() {
      return ars.Br;
   }

   @Override
   arr w() {
      return ars.Bt;
   }

   @Override
   protected void a(bkt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof ccb $$4 && $$4.gf()) {
         $$4.gg();
         this.a((cto)cnb.uf);
      }
   }

   @Override
   protected void a(auv $$0, bjz $$1) {
      this.a(bma.a, new cmy(cnb.oN));
   }

   @Override
   protected void b(auv $$0, bjz $$1) {
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      bne $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.a(bnr.c).a(4.0);
      this.A();
      return $$5;
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return 2.1F;
   }

   @Override
   protected float l(blv $$0) {
      return -0.875F;
   }

   @Override
   public boolean C(blv $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bml) {
            ((bml)$$0).b(new bli(blk.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cfo b(cmy $$0, float $$1) {
      cfo $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bli $$0) {
      return $$0.c() == blk.t ? false : super.c($$0);
   }
}
