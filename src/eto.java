import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class eto extends etv {
   public static final MapCodec<eto> a = MapCodec.unit(() -> eto.b);
   public static final eto b = new eto();

   private eto() {
      super(etx.a.a);
   }

   @Override
   public kb a(ewq $$0, dui $$1) {
      return kb.i;
   }

   @Override
   public List<ewp.a> a(ewq $$0, iw $$1, dui $$2, bai $$3) {
      return Collections.emptyList();
   }

   @Override
   public esf a(ewq $$0, iw $$1, dui $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(ewq $$0, dli $$1, dlf $$2, edo $$3, iw $$4, iw $$5, dui $$6, esf $$7, bai $$8, evz $$9, boolean $$10) {
      return true;
   }

   @Override
   public etw<?> a() {
      return etw.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
