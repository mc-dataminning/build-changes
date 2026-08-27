import com.mojang.serialization.Codec;
import java.util.List;

class dpv extends dpz {
   public static final Codec<dpv> a = a(dpv::new);

   public dpv(List<dpx> $$0) {
      super($$0);
   }

   public boolean a(cuk $$0, hx $$1) {
      for (dpx $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dpy<?> a() {
      return dpy.j;
   }
}
