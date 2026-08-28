import com.mojang.serialization.MapCodec;
import java.util.List;

class ebu extends ebx {
   public static final MapCodec<ebu> a = a(ebu::new);

   public ebu(List<ebv> $$0) {
      super($$0);
   }

   public boolean a(dfg $$0, jf $$1) {
      for (ebv $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public ebw<?> a() {
      return ebw.i;
   }
}
