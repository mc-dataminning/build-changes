import javax.annotation.Nullable;

public class ckj extends cgy implements chr {
   private final apd c;

   public ckj(csv $$0, apd $$1, cja.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bgy a(clp $$0) {
      bgy $$1 = super.a($$0);
      cbu $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bgx $$3 = $$0.p();
         $$2.a($$3, cji.pK.ai_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.q();
   }

   @Override
   protected apd a(dfj $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable cbu $$0, cpv $$1, gw $$2, @Nullable ehj $$3) {
      if ($$1.j($$2) && $$1.t($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().n(), 3);
         }

         $$1.a($$0, djt.z, $$2);
         $$1.a($$0, $$2, this.c, apf.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
