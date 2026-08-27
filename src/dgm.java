import com.mojang.serialization.MapCodec;

public class dgm extends ddk {
   public static final MapCodec<dgm> a = b(dgm::new);
   protected static final evd b = ddy.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   protected dgm(dra.d $$0) {
      super($$0);
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dpx($$0, $$1);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return b;
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      if ($$1 instanceof aqm && $$3.cw() && eva.c(eva.a($$3.cK().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), euo.i)) {
         akl<dax> $$4 = $$1.ae() == dax.j ? dax.h : dax.j;
         aqm $$5 = ((aqm)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(ky.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return cto.i;
   }

   @Override
   protected boolean a(drb $$0, emt $$1) {
      return false;
   }
}
