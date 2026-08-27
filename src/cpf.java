import javax.annotation.Nullable;

public class cpf extends cpa implements cpe {
   public cpf(dca.d $$0) {
      super($$0);
   }

   @Override
   public cen a() {
      return cen.a;
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new czi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      return a($$2, czp.o, czi::a);
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$1.B) {
         return bdx.a;
      } else {
         czn $$6 = $$1.c_($$2);
         if ($$6 instanceof czi) {
            $$3.a((czi)$$6);
            $$3.a(amr.ab);
         }

         return bdx.b;
      }
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, bfz $$3, cfz $$4) {
      if ($$4.A()) {
         czn $$5 = $$0.c_($$1);
         if ($$5 instanceof czi) {
            ((czi)$$5).a($$4.y());
         }
      }
   }
}
