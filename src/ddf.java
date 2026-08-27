import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddf extends cuu {
   public static final MapCodec<ddf> c = b(ddf::new);

   @Override
   public MapCodec<ddf> a() {
      return c;
   }

   protected ddf(dio.d $$0) {
      super($$0);
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dhp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return a($$0, $$2, dgf.B);
   }

   @Override
   protected void a(csy $$0, hv $$1, cer $$2) {
      dgd $$3 = $$0.c_($$1);
      if ($$3 instanceof dhp) {
         $$2.a((bjo)$$3);
         $$2.a(arm.at);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, arc.xn, ard.e, 1.0F, 1.0F, false);
         }

         $$1.a(jv.ab, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
