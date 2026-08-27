import com.mojang.serialization.MapCodec;

public class cyn extends cvl {
   public static final MapCodec<cyn> a = b(cyn::new);
   protected static final elu b = cvz.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<cyn> a() {
      return a;
   }

   protected cyn(dio.d $$0) {
      super($$0);
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dht($$0, $$1);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return b;
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      if ($$1 instanceof amp && $$3.ct() && elr.c(elr.a($$3.cH().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), elf.i)) {
         ags<csy> $$4 = $$1.ad() == csy.j ? csy.h : csy.j;
         amp $$5 = ((amp)$$1).n().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(jv.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return cmh.f;
   }

   @Override
   public boolean a(dip $$0, edy $$1) {
      return false;
   }
}
