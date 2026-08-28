import com.mojang.serialization.MapCodec;

public abstract class dih extends dhy {
   protected dih(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dih> a();

   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return $$0.a(awz.ag) || $$0.a(dia.cC);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jg $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dvd $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return $$1 == ert.c && !this.aH ? true : super.a($$0, $$1);
   }
}
