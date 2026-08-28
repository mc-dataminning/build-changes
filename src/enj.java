import java.util.Optional;

public abstract class enj extends enk {
   private final enj.a d;
   private final int e;
   private final int f;

   protected enj(enj.a $$0, int $$1, int $$2, enk.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<enk.b> a(enk.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, ecq.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eoc $$0, enk.a $$1) {
      dfm $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      eno construct(edp var1, int var2, int var3);
   }
}
