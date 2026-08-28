import javax.annotation.Nullable;

public interface cjr extends cki {
   void b(boolean var1);

   @Nullable
   btq p();

   void a();

   default void b(btq $$0, float $$1) {
      bqu $$2 = cns.a($$0, cut.vT);
      cuq $$3 = $$0.b($$2);
      if ($$3.g() instanceof ctd $$4) {
         $$4.a($$0.dP(), $$0, $$2, $$3, $$1, (float)(14 - $$0.dP().al().a() * 4), this.p());
      }

      this.a();
   }
}
