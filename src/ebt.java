import com.mojang.serialization.MapCodec;
import java.util.List;

class ebt extends ebx {
   public static final MapCodec<ebt> a = a(ebt::new);

   public ebt(List<ebv> $$0) {
      super($$0);
   }

   public boolean a(dfg $$0, jf $$1) {
      for (ebv $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ebw<?> a() {
      return ebw.j;
   }
}
