import com.mojang.serialization.Codec;
import java.util.List;

class dvw extends dwa {
   public static final Codec<dvw> a = a(dvw::new);

   public dvw(List<dvy> $$0) {
      super($$0);
   }

   public boolean a(czs $$0, ib $$1) {
      for (dvy $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dvz<?> a() {
      return dvz.j;
   }
}
