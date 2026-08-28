import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dez extends det implements dey {
   public static final MapCodec<dez> a = b(dez::new);

   @Override
   public MapCodec<dez> a() {
      return a;
   }

   public dez(dsj.d $$0) {
      super($$0);
   }

   @Override
   public csv b() {
      return csv.a;
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dpk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return a($$2, dpr.o, dpk::a);
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.a;
      } else {
         if ($$1.c_($$2) instanceof dpk $$5) {
            $$3.a($$5);
            $$3.a(avr.ab);
         }

         return bqg.c;
      }
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }
}
