import com.mojang.serialization.MapCodec;
import java.util.List;

class ebp extends ebt {
   public static final MapCodec<ebp> a = a(ebp::new);

   public ebp(List<ebr> $$0) {
      super($$0);
   }

   public boolean a(dfd $$0, je $$1) {
      for (ebr $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ebs<?> a() {
      return ebs.j;
   }
}
