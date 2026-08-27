import javax.annotation.Nullable;

public interface cgm extends chd {
   void b(boolean var1);

   @Nullable
   bqo p();

   void a();

   default void b(bqo $$0, float $$1) {
      bnz $$2 = ckn.a($$0, crm.vR);
      crj $$3 = $$0.b($$2);
      if ($$3.f() instanceof cpw $$4) {
         $$4.a($$0.dM(), $$0, $$2, $$3, $$1, (float)(14 - $$0.dM().ak().a() * 4), this.p());
      }

      this.a();
   }
}
