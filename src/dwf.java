import com.mojang.serialization.Codec;
import java.util.List;

class dwf extends dwj {
   public static final Codec<dwf> a = a(dwf::new);

   public dwf(List<dwh> $$0) {
      super($$0);
   }

   public boolean a(dab $$0, id $$1) {
      for (dwh $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dwi<?> a() {
      return dwi.j;
   }
}
