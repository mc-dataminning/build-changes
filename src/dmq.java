import com.mojang.serialization.Codec;
import java.util.List;

class dmq extends dmt {
   public static final Codec<dmq> a = a(dmq::new);

   public dmq(List<dmr> $$0) {
      super($$0);
   }

   public boolean a(crt $$0, ht $$1) {
      for (dmr $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dms<?> a() {
      return dms.i;
   }
}
