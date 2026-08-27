import java.util.Optional;

public abstract class efg extends efh {
   private final efg.a d;
   private final int e;
   private final int f;

   protected efg(efg.a $$0, int $$1, int $$2, efh.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<efh.b> a(efh.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dur.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(efz $$0, efh.a $$1) {
      cye $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      efl construct(dvq var1, int var2, int var3);
   }
}
