import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class epl extends eps {
   public static final MapCodec<epl> a = MapCodec.unit(() -> epl.b);
   public static final epl b = new epl();

   private epl() {
      super(epu.a.a);
   }

   @Override
   public kl a(esn $$0, drc $$1) {
      return kl.h;
   }

   @Override
   public List<esm.a> a(esn $$0, jh $$1, drc $$2, bam $$3) {
      return Collections.emptyList();
   }

   @Override
   public eoc a(esn $$0, jh $$1, drc $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(esn $$0, dig $$1, die $$2, dzr $$3, jh $$4, jh $$5, drc $$6, eoc $$7, bam $$8, erw $$9, boolean $$10) {
      return true;
   }

   @Override
   public ept<?> a() {
      return ept.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
