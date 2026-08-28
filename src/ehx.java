import com.mojang.serialization.MapCodec;
import java.util.List;

class ehx extends eib {
   public static final MapCodec<ehx> a = a(ehx::new);

   public ehx(List<ehz> $$0) {
      super($$0);
   }

   public boolean a(dkl $$0, iv $$1) {
      for (ehz $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eia<?> a() {
      return eia.j;
   }
}
