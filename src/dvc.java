import java.util.Optional;

public abstract class dvc extends dvd {
   private final dvc.a d;
   private final int e;
   private final int f;

   protected dvc(dvc.a $$0, int $$1, int $$2, dvd.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<dvd.b> a(dvd.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dkn.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dvv $$0, dvd.a $$1) {
      cox $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      dvh construct(dlm var1, int var2, int var3);
   }
}
