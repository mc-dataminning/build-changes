import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class ehg extends ehn {
   public static final Codec<ehg> a = Codec.unit(() -> ehg.b);
   public static final ehg b = new ehg();

   private ehg() {
      super(ehp.a.a);
   }

   @Override
   public jq a(ekh $$0, dji $$1) {
      return jq.g;
   }

   @Override
   public List<ekg.c> a(ekh $$0, im $$1, dji $$2, ayd $$3) {
      return Collections.emptyList();
   }

   @Override
   public efy a(ekh $$0, im $$1, dji $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(ekh $$0, dap $$1, dan $$2, drv $$3, im $$4, im $$5, dji $$6, efy $$7, ayd $$8, boolean $$9) {
      return true;
   }

   @Override
   public eho<?> a() {
      return eho.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
