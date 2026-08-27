import javax.annotation.Nullable;

public class coc extends ckr implements clk {
   private final arr c;

   public coc(cwq $$0, arr $$1, cmt.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bkb a(cpj $$0) {
      bkb $$1 = super.a($$0);
      cfi $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bka $$3 = $$0.p();
         $$2.a($$3, cnb.qv.am_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.q();
   }

   @Override
   protected arr a(djh $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable cfi $$0, ctp $$1, hx $$2, @Nullable elp $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().o(), 3);
         }

         $$1.a($$0, dnr.z, $$2);
         $$1.a($$0, $$2, this.c, art.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
