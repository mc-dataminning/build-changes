import java.util.Optional;

public abstract class enl extends enm {
   private final enl.a d;
   private final int e;
   private final int f;

   protected enl(enl.a $$0, int $$1, int $$2, enm.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<enm.b> a(enm.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, ecs.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eoe $$0, enm.a $$1) {
      dfo $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      enq construct(edr var1, int var2, int var3);
   }
}
