import com.mojang.serialization.MapCodec;

public abstract class djw extends djm {
   protected djw(dww.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djw> a();

   protected boolean b(dwx $$0, dfn $$1, ji $$2) {
      return $$0.a(awp.ah) || $$0.a(djo.cK);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      ji $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dwx $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return $$1 == eto.c && !this.aH ? true : super.a($$0, $$1);
   }
}
