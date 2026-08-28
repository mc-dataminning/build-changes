import com.mojang.serialization.MapCodec;
import java.util.List;

class egs extends egw {
   public static final MapCodec<egs> a = a(egs::new);

   public egs(List<egu> $$0) {
      super($$0);
   }

   public boolean a(djo $$0, iu $$1) {
      for (egu $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public egv<?> a() {
      return egv.j;
   }
}
