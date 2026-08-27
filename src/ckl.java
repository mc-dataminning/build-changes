import javax.annotation.Nullable;

public class ckl extends cha implements cht {
   private final ape c;

   public ckl(csx $$0, ape $$1, cjc.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bha a(clr $$0) {
      bha $$1 = super.a($$0);
      cbw $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bgz $$3 = $$0.p();
         $$2.a($$3, cjk.pK.ai_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.q();
   }

   @Override
   protected ape a(dfl $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable cbw $$0, cpx $$1, gw $$2, @Nullable ehl $$3) {
      if ($$1.j($$2) && $$1.t($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().n(), 3);
         }

         $$1.a($$0, djv.z, $$2);
         $$1.a($$0, $$2, this.c, apg.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
