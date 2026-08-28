import com.mojang.serialization.MapCodec;
import java.util.List;

class eiu extends eiy {
   public static final MapCodec<eiu> a = a(eiu::new);

   public eiu(List<eiw> $$0) {
      super($$0);
   }

   public boolean a(dli $$0, iw $$1) {
      for (eiw $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eix<?> a() {
      return eix.j;
   }
}
