import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class ejy extends ekf {
   public static final MapCodec<ejy> a = MapCodec.unit(() -> ejy.b);
   public static final ejy b = new ejy();

   private ejy() {
      super(ekh.a.a);
   }

   @Override
   public ke a(emz $$0, dlv $$1) {
      return ke.g;
   }

   @Override
   public List<emy.c> a(emz $$0, ja $$1, dlv $$2, ayo $$3) {
      return Collections.emptyList();
   }

   @Override
   public eip a(emz $$0, ja $$1, dlv $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(emz $$0, ddc $$1, dda $$2, dui $$3, ja $$4, ja $$5, dlv $$6, eip $$7, ayo $$8, boolean $$9) {
      return true;
   }

   @Override
   public ekg<?> a() {
      return ekg.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
