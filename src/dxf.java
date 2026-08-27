import com.mojang.serialization.Codec;
import java.util.List;

class dxf extends dxi {
   public static final Codec<dxf> a = a(dxf::new);

   public dxf(List<dxg> $$0) {
      super($$0);
   }

   public boolean a(day $$0, in $$1) {
      for (dxg $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dxh<?> a() {
      return dxh.i;
   }
}
