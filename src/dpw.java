import com.mojang.serialization.Codec;
import java.util.List;

class dpw extends dpz {
   public static final Codec<dpw> a = a(dpw::new);

   public dpw(List<dpx> $$0) {
      super($$0);
   }

   public boolean a(cuk $$0, hx $$1) {
      for (dpx $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dpy<?> a() {
      return dpy.i;
   }
}
