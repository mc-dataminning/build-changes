import java.util.Optional;

public abstract class dyy extends dyz {
   private final dyy.a d;
   private final int e;
   private final int f;

   protected dyy(dyy.a $$0, int $$1, int $$2, dyz.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<dyz.b> a(dyz.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, doj.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dzr $$0, dyz.a $$1) {
      csp $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      dzd construct(dpi var1, int var2, int var3);
   }
}
