import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class eji extends ejp {
   public static final MapCodec<eji> a = MapCodec.unit(() -> eji.b);
   public static final eji b = new eji();

   private eji() {
      super(ejr.a.a);
   }

   @Override
   public kd a(emj $$0, dlk $$1) {
      return kd.g;
   }

   @Override
   public List<emi.c> a(emj $$0, iz $$1, dlk $$2, azf $$3) {
      return Collections.emptyList();
   }

   @Override
   public eia a(emj $$0, iz $$1, dlk $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(emj $$0, dcr $$1, dcp $$2, dtx $$3, iz $$4, iz $$5, dlk $$6, eia $$7, azf $$8, boolean $$9) {
      return true;
   }

   @Override
   public ejq<?> a() {
      return ejq.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
