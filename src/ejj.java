import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class ejj extends ejq {
   public static final MapCodec<ejj> a = MapCodec.unit(() -> ejj.b);
   public static final ejj b = new ejj();

   private ejj() {
      super(ejs.a.a);
   }

   @Override
   public kd a(emk $$0, dll $$1) {
      return kd.g;
   }

   @Override
   public List<emj.c> a(emk $$0, iz $$1, dll $$2, azg $$3) {
      return Collections.emptyList();
   }

   @Override
   public eib a(emk $$0, iz $$1, dll $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(emk $$0, dcs $$1, dcq $$2, dty $$3, iz $$4, iz $$5, dll $$6, eib $$7, azg $$8, boolean $$9) {
      return true;
   }

   @Override
   public ejr<?> a() {
      return ejr.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
