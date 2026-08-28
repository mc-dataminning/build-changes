import com.mojang.serialization.MapCodec;
import java.util.List;

class edw extends edz {
   public static final MapCodec<edw> a = a(edw::new);

   public edw(List<edx> $$0) {
      super($$0);
   }

   public boolean a(dhe $$0, ji $$1) {
      for (edx $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public edy<?> a() {
      return edy.i;
   }
}
