import com.mojang.serialization.MapCodec;
import java.util.List;

class eet extends eex {
   public static final MapCodec<eet> a = a(eet::new);

   public eet(List<eev> $$0) {
      super($$0);
   }

   public boolean a(dhy $$0, ji $$1) {
      for (eev $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eew<?> a() {
      return eew.j;
   }
}
