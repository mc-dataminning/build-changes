import com.mojang.serialization.MapCodec;

public abstract class dwd extends dmr {
   protected dwd(eas.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dwd> a();

   protected boolean b(eat $$0, diq $$1, iv $$2) {
      return $$0.a(axc.ah) || $$0.a(dmt.cN);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      iv $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(eat $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return $$1 == exp.c && !this.F ? true : super.a($$0, $$1);
   }
}
