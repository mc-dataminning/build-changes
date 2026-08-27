import java.util.Optional;

public abstract class dyn extends dyo {
   private final dyn.a d;
   private final int e;
   private final int f;

   protected dyn(dyn.a $$0, int $$1, int $$2, dyo.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<dyo.b> a(dyo.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dny.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dzg $$0, dyo.a $$1) {
      csf $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      dys construct(dox var1, int var2, int var3);
   }
}
