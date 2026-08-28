import javax.annotation.Nullable;

public interface col extends cpd {
   void b(boolean var1);

   @Nullable
   bxu f();

   void a();

   default void b(bxu $$0, float $$1) {
      buq $$2 = csu.a($$0, dac.xg);
      czy $$3 = $$0.b($$2);
      if ($$3.h() instanceof cyr $$4) {
         $$4.a($$0.dV(), $$0, $$2, $$3, $$1, (float)(14 - $$0.dV().an().a() * 4), this.f());
      }

      this.a();
   }
}
