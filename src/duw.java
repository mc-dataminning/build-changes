import java.util.Optional;

public abstract class duw extends dux {
   private final duw.a d;
   private final int e;
   private final int f;

   protected duw(duw.a $$0, int $$1, int $$2, dux.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<dux.b> a(dux.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dkh.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dvp $$0, dux.a $$1) {
      cor $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      dvb construct(dlg var1, int var2, int var3);
   }
}
