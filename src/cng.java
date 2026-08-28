import javax.annotation.Nullable;

public interface cng extends cnx {
   void b(boolean var1);

   @Nullable
   bwz f();

   void a();

   default void b(bwz $$0, float $$1) {
      btx $$2 = cro.a($$0, cyw.wZ);
      cys $$3 = $$0.b($$2);
      if ($$3.h() instanceof cxl $$4) {
         $$4.a($$0.dV(), $$0, $$2, $$3, $$1, (float)(14 - $$0.dV().an().a() * 4), this.f());
      }

      this.a();
   }
}
