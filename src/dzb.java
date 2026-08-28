import com.mojang.serialization.MapCodec;
import java.util.List;

class dzb extends dze {
   public static final MapCodec<dzb> a = a(dzb::new);

   public dzb(List<dzc> $$0) {
      super($$0);
   }

   public boolean a(dcu $$0, iz $$1) {
      for (dzc $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dzd<?> a() {
      return dzd.i;
   }
}
