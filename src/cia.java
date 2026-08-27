import javax.annotation.Nullable;

public interface cia extends cir {
   void b(boolean var1);

   @Nullable
   bsa p();

   void a();

   default void b(bsa $$0, float $$1) {
      bpl $$2 = cmb.a($$0, ctc.vT);
      csz $$3 = $$0.b($$2);
      if ($$3.f() instanceof crm $$4) {
         $$4.a($$0.dN(), $$0, $$2, $$3, $$1, (float)(14 - $$0.dN().ak().a() * 4), this.p());
      }

      this.a();
   }
}
