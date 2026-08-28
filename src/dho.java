import com.mojang.serialization.MapCodec;

public abstract class dho extends dhy {
   protected static final int a = 2;
   protected static final fab b = dhy.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dho(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dho> a();

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1 == jl.a && !this.a($$0, $$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return a($$1, $$2.e(), jl.b);
   }
}
