import com.mojang.serialization.Codec;
import java.util.List;

class dtr extends dtv {
   public static final Codec<dtr> a = a(dtr::new);

   public dtr(List<dtt> $$0) {
      super($$0);
   }

   public boolean a(cxu $$0, ib $$1) {
      for (dtt $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dtu<?> a() {
      return dtu.j;
   }
}
