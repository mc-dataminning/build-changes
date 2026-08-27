import javax.annotation.Nullable;

public class ccq extends cbi {
   public ccq(blj<? extends ccq> $$0, csy $$1) {
      super($$0, $$1);
      this.a(eek.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bP.a(3, new buk<>(this, cdg.class, true));
      super.B();
   }

   @Override
   protected arb y() {
      return arc.Bq;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.Bs;
   }

   @Override
   protected arb n_() {
      return arc.Br;
   }

   @Override
   arb w() {
      return arc.Bt;
   }

   @Override
   protected void a(bkd $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cbl $$4 && $$4.gf()) {
         $$4.gg();
         this.a((csx)cmk.uf);
      }
   }

   @Override
   protected void a(auf $$0, bjj $$1) {
      this.a(blk.a, new cmh(cmk.oN));
   }

   @Override
   protected void b(auf $$0, bjj $$1) {
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      bmo $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.a(bnb.c).a(4.0);
      this.A();
      return $$5;
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return 2.1F;
   }

   @Override
   protected float l(blf $$0) {
      return -0.875F;
   }

   @Override
   public boolean C(blf $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof blv) {
            ((blv)$$0).b(new bks(bku.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cex b(cmh $$0, float $$1) {
      cex $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bks $$0) {
      return $$0.c() == bku.t ? false : super.c($$0);
   }
}
