import com.mojang.serialization.MapCodec;
import java.util.List;

class eiv extends eiy {
   public static final MapCodec<eiv> a = a(eiv::new);

   public eiv(List<eiw> $$0) {
      super($$0);
   }

   public boolean a(dli $$0, iw $$1) {
      for (eiw $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public eix<?> a() {
      return eix.i;
   }
}
