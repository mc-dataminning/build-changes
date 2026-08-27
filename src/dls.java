import com.mojang.serialization.Codec;
import java.util.List;

class dls extends dlw {
   public static final Codec<dls> a = a(dls::new);

   public dls(List<dlu> $$0) {
      super($$0);
   }

   public boolean a(cqk $$0, gw $$1) {
      for (dlu $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dlv<?> a() {
      return dlv.j;
   }
}
