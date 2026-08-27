import javax.annotation.Nullable;

public class ckc extends cgr implements chk {
   private final aov c;

   public ckc(csm $$0, aov $$1, cit.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bgq a(cli $$0) {
      bgq $$1 = super.a($$0);
      cbn $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bgp $$3 = $$0.p();
         $$2.a($$3, cjb.pK.ae_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.q();
   }

   @Override
   protected aov a(dfa $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable cbn $$0, cpm $$1, gu $$2, @Nullable eha $$3) {
      if ($$1.j($$2) && $$1.t($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().n(), 3);
         }

         $$1.a($$0, djk.z, $$2);
         $$1.a($$0, $$2, this.c, aox.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
