import com.mojang.serialization.MapCodec;

public abstract class dpp extends dmr implements dpo {
   public dpp(eas.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dpp> a();

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.G_()) {
         cnq $$4 = cnq.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cnq $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(eat $$0) {
      return $$0.l() || $$0.a(axc.aN) || $$0.n() || $$0.v();
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$3.a(16) == 0) {
         iv $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azq.a($$1, $$2, $$3, new lq(ly.C, $$0));
         }
      }
   }

   public abstract int b(eat var1, diq var2, iv var3);
}
