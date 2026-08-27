import javax.annotation.Nullable;

public class ctn extends cpa {
   public static final dcs a = dcr.n;

   protected ctn(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, @Nullable bfz $$3, cfz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      qr $$5 = cds.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(a, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$0.c(a) && $$1.c_($$2) instanceof dan $$6) {
         $$6.i();
         return bdx.a($$1.B);
      } else {
         return bdx.d;
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dan $$5) {
            $$5.i();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new dan($$0, $$1);
   }

   @Override
   public boolean f_(dcb $$0) {
      return true;
   }

   @Override
   public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
      if ($$1.c_($$2) instanceof dan $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   public boolean d_(dcb $$0) {
      return true;
   }

   @Override
   public int a(dcb $$0, cmm $$1, gu $$2) {
      if ($$1.c_($$2) instanceof dan $$3 && $$3.ar_().d() instanceof cgr $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a);
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      return $$1.c(a) ? a($$2, czp.e, dan::a) : null;
   }
}
