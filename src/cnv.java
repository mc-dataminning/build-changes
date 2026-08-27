import javax.annotation.Nullable;

public class cnv extends ckk implements cld {
   private final arl c;

   public cnv(cwj $$0, arl $$1, cmm.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bjv a(cpc $$0) {
      bjv $$1 = super.a($$0);
      cfb $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bju $$3 = $$0.p();
         $$2.a($$3, cmu.qv.am_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.q();
   }

   @Override
   protected arl a(dja $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable cfb $$0, cti $$1, hx $$2, @Nullable eli $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().o(), 3);
         }

         $$1.a($$0, dnk.z, $$2);
         $$1.a($$0, $$2, this.c, arn.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
