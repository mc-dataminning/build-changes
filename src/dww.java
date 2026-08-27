import com.mojang.serialization.Codec;
import java.util.List;

class dww extends dwz {
   public static final Codec<dww> a = a(dww::new);

   public dww(List<dwx> $$0) {
      super($$0);
   }

   public boolean a(dap $$0, im $$1) {
      for (dwx $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dwy<?> a() {
      return dwy.i;
   }
}
