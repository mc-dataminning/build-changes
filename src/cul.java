import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cul extends cuf implements cuk {
   public static final MapCodec<cul> a = b(cul::new);

   @Override
   public MapCodec<cul> a() {
      return a;
   }

   public cul(dgv.d $$0) {
      super($$0);
   }

   @Override
   public cjp b() {
      return cjp.a;
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dem($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return a($$2, det.o, dem::a);
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         return biq.a;
      } else {
         der $$6 = $$1.c_($$2);
         if ($$6 instanceof dem) {
            $$3.a((dem)$$6);
            $$3.a(aqx.ab);
         }

         return biq.b;
      }
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bky $$3, clb $$4) {
      if ($$4.A()) {
         der $$5 = $$0.c_($$1);
         if ($$5 instanceof dem) {
            ((dem)$$5).a($$4.y());
         }
      }
   }
}
