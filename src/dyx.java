import com.mojang.serialization.MapCodec;
import java.util.List;

class dyx extends dzb {
   public static final MapCodec<dyx> a = a(dyx::new);

   public dyx(List<dyz> $$0) {
      super($$0);
   }

   public boolean a(dcr $$0, iz $$1) {
      for (dyz $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dza<?> a() {
      return dza.j;
   }
}
