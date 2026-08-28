import javax.annotation.Nullable;

public interface cja extends cjr {
   void b(boolean var1);

   @Nullable
   bsy p();

   void a();

   default void b(bsy $$0, float $$1) {
      bqc $$2 = cnb.a($$0, cud.vW);
      cua $$3 = $$0.b($$2);
      if ($$3.g() instanceof csn $$4) {
         $$4.a($$0.dP(), $$0, $$2, $$3, $$1, (float)(14 - $$0.dP().al().a() * 4), this.p());
      }

      this.a();
   }
}
