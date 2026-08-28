import com.mojang.serialization.MapCodec;

public abstract class dqc extends dne implements dqb {
   public dqc(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqc> a();

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.K_()) {
         cod $$4 = cod.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cod $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(ebg $$0) {
      return $$0.l() || $$0.a(axg.aN) || $$0.n() || $$0.v();
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$3.a(16) == 0) {
         iw $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azu.a($$1, $$2, $$3, new lr(lz.C, $$0));
         }
      }
   }

   public abstract int b(ebg var1, djd var2, iw var3);
}
