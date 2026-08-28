import com.mojang.serialization.MapCodec;

public abstract class dqa extends dnc implements dpz {
   public dqa(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqa> a();

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.K_()) {
         cob $$4 = cob.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cob $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(ebe $$0) {
      return $$0.l() || $$0.a(axe.aN) || $$0.n() || $$0.v();
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if ($$3.a(16) == 0) {
         iv $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azs.a($$1, $$2, $$3, new lq(ly.C, $$0));
         }
      }
   }

   public abstract int b(ebe var1, djb var2, iv var3);
}
