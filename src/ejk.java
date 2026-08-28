import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class ejk extends ejr {
   public static final MapCodec<ejk> a = MapCodec.unit(() -> ejk.b);
   public static final ejk b = new ejk();

   private ejk() {
      super(ejt.a.a);
   }

   @Override
   public kd a(eml $$0, dlm $$1) {
      return kd.g;
   }

   @Override
   public List<emk.c> a(eml $$0, iz $$1, dlm $$2, azh $$3) {
      return Collections.emptyList();
   }

   @Override
   public eic a(eml $$0, iz $$1, dlm $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(eml $$0, dct $$1, dcr $$2, dtz $$3, iz $$4, iz $$5, dlm $$6, eic $$7, azh $$8, boolean $$9) {
      return true;
   }

   @Override
   public ejs<?> a() {
      return ejs.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
