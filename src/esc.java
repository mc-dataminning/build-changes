import java.util.Optional;

public abstract class esc extends esd {
   private final esc.a d;
   private final int e;
   private final int f;

   protected esc(esc.a $$0, int $$1, int $$2, esd.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<esd.b> a(esd.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, ehf.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(esv $$0, esd.a $$1) {
      dje $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      esh construct(eie var1, int var2, int var3);
   }
}
