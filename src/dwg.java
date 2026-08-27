import com.mojang.serialization.Codec;
import java.util.List;

class dwg extends dwj {
   public static final Codec<dwg> a = a(dwg::new);

   public dwg(List<dwh> $$0) {
      super($$0);
   }

   public boolean a(dab $$0, id $$1) {
      for (dwh $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dwi<?> a() {
      return dwi.i;
   }
}
