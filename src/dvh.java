import java.util.Optional;

public abstract class dvh extends dvi {
   private final dvh.a d;
   private final int e;
   private final int f;

   protected dvh(dvh.a $$0, int $$1, int $$2, dvi.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<dvi.b> a(dvi.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dks.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dwa $$0, dvi.a $$1) {
      cpc $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      dvm construct(dlr var1, int var2, int var3);
   }
}
