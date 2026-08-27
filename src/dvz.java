import java.util.Optional;

public abstract class dvz extends dwa {
   private final dvz.a d;
   private final int e;
   private final int f;

   protected dvz(dvz.a $$0, int $$1, int $$2, dwa.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<dwa.b> a(dwa.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dlk.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dws $$0, dwa.a $$1) {
      cqg $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      dwe construct(dmj var1, int var2, int var3);
   }
}
