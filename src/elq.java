import java.util.Optional;

public abstract class elq extends elr {
   private final elq.a d;
   private final int e;
   private final int f;

   protected elq(elq.a $$0, int $$1, int $$2, elr.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<elr.b> a(elr.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, eaz.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(emj $$0, elr.a $$1) {
      deb $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      elv construct(eby var1, int var2, int var3);
   }
}
