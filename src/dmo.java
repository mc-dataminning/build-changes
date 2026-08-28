import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmo extends dec {
   public static final MapCodec<dmo> c = b(dmo::new);

   @Override
   public MapCodec<dmo> a() {
      return c;
   }

   protected dmo(dsj.d $$0) {
      super($$0);
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new drd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return a($$0, $$2, dpr.B);
   }

   @Override
   protected void a(dcf $$0, ja $$1, cmk $$2) {
      dpp $$3 = $$0.c_($$1);
      if ($$3 instanceof drd) {
         $$2.a((bqk)$$3);
         $$2.a(avr.at);
      }
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avh.yk, avi.e, 1.0F, 1.0F, false);
         }

         $$1.a(lj.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
