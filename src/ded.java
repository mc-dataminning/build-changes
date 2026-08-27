import com.mojang.serialization.MapCodec;

public class ded extends cwi implements cwc {
   public static final MapCodec<ded> a = b(ded::new);
   protected static final float b = 6.0F;
   protected static final elu c = cvz.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   protected ded(dio.d $$0) {
      super($$0);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return c;
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return true;
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      cyh $$4 = (cyh)($$3.a(cwb.bu) ? cwb.iI : cwb.iH);
      if ($$4.o().a($$0, $$2) && $$0.t($$2.c())) {
         cyh.a($$0, $$4.o(), $$2, 2);
      }
   }
}
