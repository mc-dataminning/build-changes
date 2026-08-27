import javax.annotation.Nullable;

public class cwf extends cpa {
   public static final dcs a = dcr.E;
   private final bdc b = bcz.a(5);

   public cwf(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a);
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public czn a(gu $$0, dcb $$1) {
      return new dar($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      return $$0.B ? null : a($$2, czp.K, dar::a);
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, cfz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
