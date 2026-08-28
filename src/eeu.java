import com.mojang.serialization.MapCodec;
import java.util.List;

class eeu extends eey {
   public static final MapCodec<eeu> a = a(eeu::new);

   public eeu(List<eew> $$0) {
      super($$0);
   }

   public boolean a(dif $$0, jh $$1) {
      for (eew $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eex<?> a() {
      return eex.j;
   }
}
