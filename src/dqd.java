import com.mojang.serialization.Codec;
import java.util.List;

class dqd extends dqh {
   public static final Codec<dqd> a = a(dqd::new);

   public dqd(List<dqf> $$0) {
      super($$0);
   }

   public boolean a(cus $$0, hx $$1) {
      for (dqf $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dqg<?> a() {
      return dqg.j;
   }
}
