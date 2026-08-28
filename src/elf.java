import java.util.Optional;

public abstract class elf extends elg {
   private final elf.a d;
   private final int e;
   private final int f;

   protected elf(elf.a $$0, int $$1, int $$2, elg.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<elg.b> a(elg.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, eao.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ely $$0, elg.a $$1) {
      ddp $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      elk construct(ebn var1, int var2, int var3);
   }
}
