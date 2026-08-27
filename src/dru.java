import com.mojang.serialization.Codec;
import java.util.List;

class dru extends drx {
   public static final Codec<dru> a = a(dru::new);

   public dru(List<drv> $$0) {
      super($$0);
   }

   public boolean a(cwi $$0, hz $$1) {
      for (drv $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public drw<?> a() {
      return drw.i;
   }
}
