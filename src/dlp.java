import com.mojang.serialization.Codec;
import java.util.List;

class dlp extends dls {
   public static final Codec<dlp> a = a(dlp::new);

   public dlp(List<dlq> $$0) {
      super($$0);
   }

   public boolean a(cqg $$0, gu $$1) {
      for (dlq $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dlr<?> a() {
      return dlr.i;
   }
}
