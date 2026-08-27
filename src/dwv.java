import com.mojang.serialization.Codec;
import java.util.List;

class dwv extends dwz {
   public static final Codec<dwv> a = a(dwv::new);

   public dwv(List<dwx> $$0) {
      super($$0);
   }

   public boolean a(dap $$0, im $$1) {
      for (dwx $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dwy<?> a() {
      return dwy.j;
   }
}
