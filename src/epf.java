import java.util.Optional;

public abstract class epf extends epg {
   private final epf.a d;
   private final int e;
   private final int f;

   protected epf(epf.a $$0, int $$1, int $$2, epg.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<epg.b> a(epg.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, eel.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(epy $$0, epg.a $$1) {
      dgw $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      epk construct(efk var1, int var2, int var3);
   }
}
