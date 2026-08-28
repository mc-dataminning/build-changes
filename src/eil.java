import com.mojang.serialization.MapCodec;
import java.util.List;

class eil extends eio {
   public static final MapCodec<eil> a = a(eil::new);

   public eil(List<eim> $$0) {
      super($$0);
   }

   public boolean a(dky $$0, iw $$1) {
      for (eim $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public ein<?> a() {
      return ein.i;
   }
}
