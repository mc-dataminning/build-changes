import com.mojang.serialization.Codec;
import java.util.List;

class dip extends dit {
   public static final Codec<dip> a = a(dip::new);

   public dip(List<dir> $$0) {
      super($$0);
   }

   public boolean a(cng $$0, gu $$1) {
      for (dir $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dis<?> a() {
      return dis.j;
   }
}
