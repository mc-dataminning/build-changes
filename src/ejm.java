import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class ejm extends ejt {
   public static final MapCodec<ejm> a = MapCodec.unit(() -> ejm.b);
   public static final ejm b = new ejm();

   private ejm() {
      super(ejv.a.a);
   }

   @Override
   public kd a(emn $$0, dlo $$1) {
      return kd.g;
   }

   @Override
   public List<emm.c> a(emn $$0, iz $$1, dlo $$2, azh $$3) {
      return Collections.emptyList();
   }

   @Override
   public eie a(emn $$0, iz $$1, dlo $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(emn $$0, dcv $$1, dct $$2, dub $$3, iz $$4, iz $$5, dlo $$6, eie $$7, azh $$8, boolean $$9) {
      return true;
   }

   @Override
   public eju<?> a() {
      return eju.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
