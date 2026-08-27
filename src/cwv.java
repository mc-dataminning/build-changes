import javax.annotation.Nullable;

public class cwv extends csi {
   public static final dga a = dfz.n;

   protected cwv(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, @Nullable bjg $$3, cjf $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      qy $$5 = cgy.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(a, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$0.c(a) && $$1.c_($$2) instanceof ddv $$6) {
         $$6.i();
         return bgy.a($$1.B);
      } else {
         return bgy.d;
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof ddv $$5) {
            $$5.i();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddv($$0, $$1);
   }

   @Override
   public boolean f_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpb $$1, gw $$2, hc $$3) {
      if ($$1.c_($$2) instanceof ddv $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      if ($$1.c_($$2) instanceof ddv $$3 && $$3.av_().d() instanceof cjx $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return $$1.c(a) ? a($$2, dcx.e, ddv::a) : null;
   }
}
