import com.mojang.serialization.MapCodec;

public class dpz extends dmf {
   public static final MapCodec<dpz> d = b(dpz::new);

   @Override
   protected MapCodec<? extends dpz> a() {
      return d;
   }

   protected dpz(eag.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(eah $$0, eah $$1, ja $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
