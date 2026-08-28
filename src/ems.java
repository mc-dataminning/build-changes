import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class ems extends emz {
   public static final MapCodec<ems> a = MapCodec.unit(() -> ems.b);
   public static final ems b = new ems();

   private ems() {
      super(enb.a.a);
   }

   @Override
   public kk a(epu $$0, dol $$1) {
      return kk.g;
   }

   @Override
   public List<ept.c> a(epu $$0, jg $$1, dol $$2, azr $$3) {
      return Collections.emptyList();
   }

   @Override
   public elj a(epu $$0, jg $$1, dol $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(epu $$0, dfs $$1, dfq $$2, dxa $$3, jg $$4, jg $$5, dol $$6, elj $$7, azr $$8, epd $$9, boolean $$10) {
      return true;
   }

   @Override
   public ena<?> a() {
      return ena.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
