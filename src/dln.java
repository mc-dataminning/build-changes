import com.mojang.serialization.Codec;
import java.util.List;

class dln extends dlr {
   public static final Codec<dln> a = a(dln::new);

   public dln(List<dlp> $$0) {
      super($$0);
   }

   public boolean a(cqf $$0, gu $$1) {
      for (dlp $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dlq<?> a() {
      return dlq.j;
   }
}
