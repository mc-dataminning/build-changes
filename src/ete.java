import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class ete extends etl {
   public static final MapCodec<ete> a = MapCodec.unit(() -> ete.b);
   public static final ete b = new ete();

   private ete() {
      super(etn.a.a);
   }

   @Override
   public kb a(ewg $$0, dty $$1) {
      return kb.i;
   }

   @Override
   public List<ewf.a> a(ewg $$0, iw $$1, dty $$2, azz $$3) {
      return Collections.emptyList();
   }

   @Override
   public erv a(ewg $$0, iw $$1, dty $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(ewg $$0, dky $$1, dkv $$2, ede $$3, iw $$4, iw $$5, dty $$6, erv $$7, azz $$8, evp $$9, boolean $$10) {
      return true;
   }

   @Override
   public etm<?> a() {
      return etm.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
