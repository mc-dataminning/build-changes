import java.util.Optional;

public abstract class dvj extends dvk {
   private final dvj.a d;
   private final int e;
   private final int f;

   protected dvj(dvj.a $$0, int $$1, int $$2, dvk.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<dvk.b> a(dvk.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dku.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dwc $$0, dvk.a $$1) {
      cpe $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      dvo construct(dlt var1, int var2, int var3);
   }
}
