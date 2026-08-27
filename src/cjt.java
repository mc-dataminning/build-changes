import javax.annotation.Nullable;

public class cjt extends cik {
   public cjt(bsa<? extends cjt> $$0, dax $$1) {
      super($$0, $$1);
      this.a(enl.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bT.a(3, new cbf<>(this, ckl.class, true));
      super.z();
   }

   @Override
   protected avg v() {
      return avh.Cz;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.CB;
   }

   @Override
   protected avg o_() {
      return avh.CA;
   }

   @Override
   avg u() {
      return avh.CC;
   }

   @Override
   protected void a(bqn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cio $$4 && $$4.gq()) {
         $$4.gr();
         this.a((daw)ctr.um);
      }
   }

   @Override
   protected void a(ayk $$0, bps $$1) {
      this.a(bsb.a, new cto(ctr.oQ));
   }

   @Override
   protected void b(ayk $$0, bps $$1) {
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      bth $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(btw.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean C(bru $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bso) {
            ((bso)$$0).b(new brc(bre.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cmc b(cto $$0, float $$1) {
      cmc $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(brc $$0) {
      return $$0.a(bre.t) ? false : super.c($$0);
   }
}
