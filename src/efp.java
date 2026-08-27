import java.util.Optional;

public abstract class efp extends efq {
   private final efp.a d;
   private final int e;
   private final int f;

   protected efp(efp.a $$0, int $$1, int $$2, efq.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<efq.b> a(efq.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dva.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(egi $$0, efq.a $$1) {
      cyn $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      efu construct(dvz var1, int var2, int var3);
   }
}
