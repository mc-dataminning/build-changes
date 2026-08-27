import com.mojang.serialization.Codec;
import java.util.List;

class drt extends drx {
   public static final Codec<drt> a = a(drt::new);

   public drt(List<drv> $$0) {
      super($$0);
   }

   public boolean a(cwi $$0, hz $$1) {
      for (drv $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public drw<?> a() {
      return drw.j;
   }
}
