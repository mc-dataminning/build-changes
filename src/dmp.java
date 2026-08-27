import com.mojang.serialization.Codec;
import java.util.List;

class dmp extends dmt {
   public static final Codec<dmp> a = a(dmp::new);

   public dmp(List<dmr> $$0) {
      super($$0);
   }

   public boolean a(crt $$0, ht $$1) {
      for (dmr $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dms<?> a() {
      return dms.j;
   }
}
