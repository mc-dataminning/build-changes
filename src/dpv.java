import com.mojang.serialization.Codec;
import java.util.List;

class dpv extends dpy {
   public static final Codec<dpv> a = a(dpv::new);

   public dpv(List<dpw> $$0) {
      super($$0);
   }

   public boolean a(cuj $$0, hx $$1) {
      for (dpw $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dpx<?> a() {
      return dpx.i;
   }
}
