import com.mojang.serialization.MapCodec;
import java.util.List;

class eev extends eey {
   public static final MapCodec<eev> a = a(eev::new);

   public eev(List<eew> $$0) {
      super($$0);
   }

   public boolean a(dif $$0, jh $$1) {
      for (eew $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public eex<?> a() {
      return eex.i;
   }
}
