import com.mojang.serialization.MapCodec;

public abstract class dki extends dhm implements dkh {
   public dki(dur.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dki> a();

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.H_()) {
         ckg $$4 = ckg.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(ckg $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(dus $$0) {
      return $$0.l() || $$0.a(awv.aL) || $$0.n() || $$0.v();
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$3.a(16) == 0) {
         jf $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azj.a($$1, $$2, $$3, new lg(lo.C, $$0));
         }
      }
   }

   public int b(dus $$0, ddo $$1, jf $$2) {
      return -16777216;
   }
}
