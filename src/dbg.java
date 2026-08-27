import com.mojang.serialization.MapCodec;

public class dbg extends cye {
   public static final MapCodec<dbg> a = b(dbg::new);
   protected static final eos b = cys.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dbg> a() {
      return a;
   }

   protected dbg(dli.d $$0) {
      super($$0);
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dkn($$0, $$1);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return b;
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      if ($$1 instanceof aow && $$3.ct() && eop.c(eop.a($$3.cH().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), eod.i)) {
         aix<cvr> $$4 = $$1.ad() == cvr.j ? cvr.h : cvr.j;
         aow $$5 = ((aow)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(jz.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return cpd.h;
   }

   @Override
   protected boolean a(dlj $$0, egv $$1) {
      return false;
   }
}
