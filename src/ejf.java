import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class ejf extends ejm {
   public static final MapCodec<ejf> a = MapCodec.unit(() -> ejf.b);
   public static final ejf b = new ejf();

   private ejf() {
      super(ejo.a.a);
   }

   @Override
   public kd a(emg $$0, dlh $$1) {
      return kd.g;
   }

   @Override
   public List<emf.c> a(emg $$0, iz $$1, dlh $$2, azc $$3) {
      return Collections.emptyList();
   }

   @Override
   public ehx a(emg $$0, iz $$1, dlh $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(emg $$0, dco $$1, dcm $$2, dtu $$3, iz $$4, iz $$5, dlh $$6, ehx $$7, azc $$8, boolean $$9) {
      return true;
   }

   @Override
   public ejn<?> a() {
      return ejn.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
