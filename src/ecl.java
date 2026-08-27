import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class ecl extends ecs {
   public static final Codec<ecl> a = Codec.unit(() -> ecl.b);
   public static final ecl b = new ecl();

   private ecl() {
      super(ecu.a.a);
   }

   @Override
   public jd a(efm $$0, dfe $$1) {
      return jd.g;
   }

   @Override
   public List<efl.c> a(efm $$0, hz $$1, dfe $$2, awp $$3) {
      return Collections.emptyList();
   }

   @Override
   public ebd a(efm $$0, hz $$1, dfe $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(efm $$0, cwm $$1, cwk $$2, dng $$3, hz $$4, hz $$5, dfe $$6, ebd $$7, awp $$8, boolean $$9) {
      return true;
   }

   @Override
   public ect<?> a() {
      return ect.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
