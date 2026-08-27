import com.mojang.serialization.Codec;
import java.util.List;

class dvx extends dwa {
   public static final Codec<dvx> a = a(dvx::new);

   public dvx(List<dvy> $$0) {
      super($$0);
   }

   public boolean a(czs $$0, ib $$1) {
      for (dvy $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dvz<?> a() {
      return dvz.i;
   }
}
