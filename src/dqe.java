import com.mojang.serialization.Codec;
import java.util.List;

class dqe extends dqh {
   public static final Codec<dqe> a = a(dqe::new);

   public dqe(List<dqf> $$0) {
      super($$0);
   }

   public boolean a(cus $$0, hx $$1) {
      for (dqf $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dqg<?> a() {
      return dqg.i;
   }
}
