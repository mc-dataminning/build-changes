import com.mojang.serialization.MapCodec;

public class dpk extends dhy {
   public static final MapCodec<dpk> a = b(dpk::new);
   protected static final fab b = dhy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dpk> a() {
      return a;
   }

   public dpk(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }

   @Override
   protected fab b_(dvd $$0, dea $$1, jg $$2) {
      return ezy.b();
   }

   @Override
   protected fab c(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return ezy.b();
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      die.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$1 == jl.b && $$2.a(dia.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   @Override
   protected float c(dvd $$0, dea $$1, jg $$2) {
      return 0.2F;
   }
}
