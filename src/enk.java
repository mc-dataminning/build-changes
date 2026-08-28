import java.util.Optional;

public abstract class enk extends enl {
   private final enk.a d;
   private final int e;
   private final int f;

   protected enk(enk.a $$0, int $$1, int $$2, enl.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<enl.b> a(enl.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, ecr.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eod $$0, enl.a $$1) {
      dfn $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      enp construct(edq var1, int var2, int var3);
   }
}
