import com.mojang.serialization.MapCodec;

public class dpj extends dhl {
   public static final MapCodec<dpj> c = b(dpj::new);

   @Override
   public MapCodec<dpj> a() {
      return c;
   }

   public dpj(dvc.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return this.a($$0, $$3, $$4) ? this.m() : dia.a.m();
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dvd $$0) {
      return $$0.a(awz.aU);
   }

   @Override
   protected boolean g(dvd $$0) {
      return true;
   }
}
