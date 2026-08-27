import javax.annotation.Nullable;

public class ckp extends che implements chx {
   private final apf c;

   public ckp(ctc $$0, apf $$1, cjg.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bhe a(clv $$0) {
      bhe $$1 = super.a($$0);
      cca $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bhd $$3 = $$0.p();
         $$2.a($$3, cjo.pK.ai_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.q();
   }

   @Override
   protected apf a(dfd $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable cca $$0, cqb $$1, gw $$2, @Nullable ehd $$3) {
      if ($$1.j($$2) && $$1.t($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().o(), 3);
         }

         $$1.a($$0, djn.z, $$2);
         $$1.a($$0, $$2, this.c, aph.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
