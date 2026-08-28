import javax.annotation.Nullable;

public interface cmf extends cmw {
   void b(boolean var1);

   @Nullable
   bvy f();

   void a();

   default void b(bvy $$0, float $$1) {
      bsx $$2 = cqm.a($$0, cxl.wX);
      cxh $$3 = $$0.b($$2);
      if ($$3.h() instanceof cvz $$4) {
         $$4.a($$0.dU(), $$0, $$2, $$3, $$1, (float)(14 - $$0.dU().an().a() * 4), this.f());
      }

      this.a();
   }
}
