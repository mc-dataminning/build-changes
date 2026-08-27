import com.mojang.serialization.Codec;
import java.util.List;

class dlo extends dls {
   public static final Codec<dlo> a = a(dlo::new);

   public dlo(List<dlq> $$0) {
      super($$0);
   }

   public boolean a(cqg $$0, gu $$1) {
      for (dlq $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dlr<?> a() {
      return dlr.j;
   }
}
