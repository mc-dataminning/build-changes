import javax.annotation.Nullable;

public interface cjl extends ckc {
   void b(boolean var1);

   @Nullable
   btk p();

   void a();

   default void b(btk $$0, float $$1) {
      bqo $$2 = cnm.a($$0, cun.vT);
      cuk $$3 = $$0.b($$2);
      if ($$3.g() instanceof csx $$4) {
         $$4.a($$0.dP(), $$0, $$2, $$3, $$1, (float)(14 - $$0.dP().al().a() * 4), this.p());
      }

      this.a();
   }
}
