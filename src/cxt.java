import com.mojang.serialization.MapCodec;

public class cxt extends cur {
   public static final MapCodec<cxt> a = b(cxt::new);
   protected static final eks b = cvf.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<cxt> a() {
      return a;
   }

   protected cxt(dhm.d $$0) {
      super($$0);
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgy($$0, $$1);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b;
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if ($$1 instanceof ami && $$3.ct() && ekp.c(ekp.a($$3.cH().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), ekd.i)) {
         agl<csf> $$4 = $$1.ad() == csf.j ? csf.h : csf.j;
         ami $$5 = ((ami)$$1).n().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(jw.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return clo.b;
   }

   @Override
   public boolean a(dhn $$0, ecw $$1) {
      return false;
   }
}
