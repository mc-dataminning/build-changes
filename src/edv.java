import com.mojang.serialization.MapCodec;
import java.util.List;

class edv extends edz {
   public static final MapCodec<edv> a = a(edv::new);

   public edv(List<edx> $$0) {
      super($$0);
   }

   public boolean a(dhe $$0, ji $$1) {
      for (edx $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public edy<?> a() {
      return edy.j;
   }
}
