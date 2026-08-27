import com.mojang.serialization.Codec;
import java.util.List;

class dlz extends dmd {
   public static final Codec<dlz> a = a(dlz::new);

   public dlz(List<dmb> $$0) {
      super($$0);
   }

   public boolean a(cqr $$0, gw $$1) {
      for (dmb $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dmc<?> a() {
      return dmc.j;
   }
}
