import java.util.Optional;

public abstract class dzn extends dzo {
   private final dzn.a d;
   private final int e;
   private final int f;

   protected dzn(dzn.a $$0, int $$1, int $$2, dzo.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<dzo.b> a(dzo.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, doy.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eag $$0, dzo.a $$1) {
      cte $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      dzs construct(dpx var1, int var2, int var3);
   }
}
