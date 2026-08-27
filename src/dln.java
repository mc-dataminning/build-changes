import com.mojang.serialization.Codec;
import java.util.List;

class dln extends dlq {
   public static final Codec<dln> a = a(dln::new);

   public dln(List<dlo> $$0) {
      super($$0);
   }

   public boolean a(cqe $$0, gv $$1) {
      for (dlo $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dlp<?> a() {
      return dlp.i;
   }
}
