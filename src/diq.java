import com.mojang.serialization.Codec;
import java.util.List;

class diq extends dit {
   public static final Codec<diq> a = a(diq::new);

   public diq(List<dir> $$0) {
      super($$0);
   }

   public boolean a(cng $$0, gu $$1) {
      for (dir $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dis<?> a() {
      return dis.i;
   }
}
