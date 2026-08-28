import com.mojang.serialization.MapCodec;
import java.util.List;

class ehd extends ehh {
   public static final MapCodec<ehd> a = a(ehd::new);

   public ehd(List<ehf> $$0) {
      super($$0);
   }

   public boolean a(dju $$0, iu $$1) {
      for (ehf $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ehg<?> a() {
      return ehg.j;
   }
}
