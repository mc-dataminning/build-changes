import javax.annotation.Nullable;

public interface cli extends clz {
   void b(boolean var1);

   @Nullable
   bve m();

   void a();

   default void b(bve $$0, float $$1) {
      bsg $$2 = cpm.a($$0, cwj.wn);
      cwf $$3 = $$0.b($$2);
      if ($$3.h() instanceof cuw $$4) {
         $$4.a($$0.dY(), $$0, $$2, $$3, $$1, (float)(14 - $$0.dY().ak().a() * 4), this.m());
      }

      this.a();
   }
}
