import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class dvz extends dwg {
   public static final Codec<dvz> a = Codec.unit(() -> dvz.b);
   public static final dvz b = new dvz();

   private dvz() {
      super(dwi.a.a);
   }

   @Override
   public hz a(dyt $$0, cyy $$1) {
      return hz.g;
   }

   @Override
   public List<dys.c> a(dyt $$0, gu $$1, cyy $$2, aru $$3) {
      return Collections.emptyList();
   }

   @Override
   public dur a(dyt $$0, gu $$1, cyy $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(dyt $$0, cqg $$1, cqe $$2, dgx $$3, gu $$4, gu $$5, cyy $$6, dur $$7, aru $$8, boolean $$9) {
      return true;
   }

   @Override
   public dwh<?> a() {
      return dwh.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
