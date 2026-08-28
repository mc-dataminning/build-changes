import com.mojang.serialization.MapCodec;
import java.util.List;

class ehy extends eib {
   public static final MapCodec<ehy> a = a(ehy::new);

   public ehy(List<ehz> $$0) {
      super($$0);
   }

   public boolean a(dkl $$0, iv $$1) {
      for (ehz $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public eia<?> a() {
      return eia.i;
   }
}
