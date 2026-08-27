import java.util.Optional;

public abstract class ebd extends ebe {
   private final ebd.a d;
   private final int e;
   private final int f;

   protected ebd(ebd.a $$0, int $$1, int $$2, ebe.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<ebe.b> a(ebe.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dqo.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ebw $$0, ebe.a $$1) {
      cuu $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      ebi construct(drn var1, int var2, int var3);
   }
}
