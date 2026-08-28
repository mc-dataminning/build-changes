import com.mojang.serialization.MapCodec;
import java.util.List;

class ebq extends ebt {
   public static final MapCodec<ebq> a = a(ebq::new);

   public ebq(List<ebr> $$0) {
      super($$0);
   }

   public boolean a(dfd $$0, je $$1) {
      for (ebr $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public ebs<?> a() {
      return ebs.i;
   }
}
