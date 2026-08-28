import com.mojang.serialization.MapCodec;
import java.util.List;

class egt extends egw {
   public static final MapCodec<egt> a = a(egt::new);

   public egt(List<egu> $$0) {
      super($$0);
   }

   public boolean a(djo $$0, iu $$1) {
      for (egu $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public egv<?> a() {
      return egv.i;
   }
}
