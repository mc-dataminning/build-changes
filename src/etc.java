import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class etc extends etj {
   public static final MapCodec<etc> a = MapCodec.unit(() -> etc.b);
   public static final etc b = new etc();

   private etc() {
      super(etl.a.a);
   }

   @Override
   public ka a(ewe $$0, dtw $$1) {
      return ka.i;
   }

   @Override
   public List<ewd.a> a(ewe $$0, iv $$1, dtw $$2, azx $$3) {
      return Collections.emptyList();
   }

   @Override
   public ert a(ewe $$0, iv $$1, dtw $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(ewe $$0, dkw $$1, dkt $$2, edc $$3, iv $$4, iv $$5, dtw $$6, ert $$7, azx $$8, evn $$9, boolean $$10) {
      return true;
   }

   @Override
   public etk<?> a() {
      return etk.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
