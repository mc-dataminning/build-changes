import javax.annotation.Nullable;

public interface cip extends cji {
   void b(boolean var1);

   @Nullable
   bso p();

   void a();

   default void b(bso $$0, float $$1) {
      bpz $$2 = cmu.a($$0, cuk.xE);
      cuh $$3 = $$0.b($$2);
      if ($$3.f() instanceof css $$4) {
         $$4.a($$0.dU(), $$0, $$2, $$3, $$1, (float)(14 - $$0.dU().al().a() * 4), this.p());
      }

      this.a();
   }
}
