import com.mojang.serialization.Codec;
import java.util.List;

class dpu extends dpy {
   public static final Codec<dpu> a = a(dpu::new);

   public dpu(List<dpw> $$0) {
      super($$0);
   }

   public boolean a(cuj $$0, hx $$1) {
      for (dpw $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dpx<?> a() {
      return dpx.j;
   }
}
