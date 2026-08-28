import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class ejl extends ejs {
   public static final MapCodec<ejl> a = MapCodec.unit(() -> ejl.b);
   public static final ejl b = new ejl();

   private ejl() {
      super(eju.a.a);
   }

   @Override
   public kd a(emm $$0, dln $$1) {
      return kd.g;
   }

   @Override
   public List<eml.c> a(emm $$0, iz $$1, dln $$2, azh $$3) {
      return Collections.emptyList();
   }

   @Override
   public eid a(emm $$0, iz $$1, dln $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(emm $$0, dcu $$1, dcs $$2, dua $$3, iz $$4, iz $$5, dln $$6, eid $$7, azh $$8, boolean $$9) {
      return true;
   }

   @Override
   public ejt<?> a() {
      return ejt.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
