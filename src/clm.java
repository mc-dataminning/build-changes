import javax.annotation.Nullable;

public interface clm extends cmd {
   void b(boolean var1);

   @Nullable
   bvi O_();

   void a();

   default void b(bvi $$0, float $$1) {
      bsk $$2 = cpt.a($$0, cwu.wV);
      cwq $$3 = $$0.b($$2);
      if ($$3.h() instanceof cvh $$4) {
         $$4.a($$0.dV(), $$0, $$2, $$3, $$1, (float)(14 - $$0.dV().am().a() * 4), this.O_());
      }

      this.a();
   }
}
