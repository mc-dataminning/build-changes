import com.mojang.serialization.MapCodec;
import java.util.List;

class edw extends eea {
   public static final MapCodec<edw> a = a(edw::new);

   public edw(List<edy> $$0) {
      super($$0);
   }

   public boolean a(dhf $$0, ji $$1) {
      for (edy $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public edz<?> a() {
      return edz.j;
   }
}
