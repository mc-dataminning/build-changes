import com.mojang.serialization.Codec;
import java.util.List;

class dlo extends dlr {
   public static final Codec<dlo> a = a(dlo::new);

   public dlo(List<dlp> $$0) {
      super($$0);
   }

   public boolean a(cqf $$0, gu $$1) {
      for (dlp $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dlq<?> a() {
      return dlq.i;
   }
}
