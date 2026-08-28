import java.util.Optional;

public abstract class ema extends emb {
   private final ema.a d;
   private final int e;
   private final int f;

   protected ema(ema.a $$0, int $$1, int $$2, emb.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<emb.b> a(emb.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, ebj.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(emt $$0, emb.a $$1) {
      del $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      emf construct(eci var1, int var2, int var3);
   }
}
