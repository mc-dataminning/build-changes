import com.mojang.serialization.Codec;
import java.util.List;

class dlm extends dlq {
   public static final Codec<dlm> a = a(dlm::new);

   public dlm(List<dlo> $$0) {
      super($$0);
   }

   public boolean a(cqe $$0, gv $$1) {
      for (dlo $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dlp<?> a() {
      return dlp.j;
   }
}
