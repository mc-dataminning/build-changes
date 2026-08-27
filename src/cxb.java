import com.mojang.serialization.MapCodec;

public class cxb extends dai {
   public static final MapCodec<cxb> a = b(cxb::new);

   @Override
   public MapCodec<cxb> a() {
      return a;
   }

   public cxb(dio.d $$0) {
      super($$0);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         hv $$4 = $$2.d();
         dip $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), ia.b)) {
            aub.a($$1, $$2, $$3, jv.F);
         }
      }
   }
}
