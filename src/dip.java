import com.mojang.serialization.MapCodec;

public class dip extends dhy {
   public static final MapCodec<dip> a = b(dip::new);
   protected static final fab b = dhy.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dip> a() {
      return a;
   }

   public dip(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return !$$1.u($$2.e());
   }
}
