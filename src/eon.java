import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class eon extends eou {
   public static final MapCodec<eon> a = MapCodec.unit(() -> eon.b);
   public static final eon b = new eon();

   private eon() {
      super(eow.a.a);
   }

   @Override
   public km a(erp $$0, dqe $$1) {
      return km.h;
   }

   @Override
   public List<ero.a> a(erp $$0, ji $$1, dqe $$2, azh $$3) {
      return Collections.emptyList();
   }

   @Override
   public ene a(erp $$0, ji $$1, dqe $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(erp $$0, dhg $$1, dhe $$2, dyt $$3, ji $$4, ji $$5, dqe $$6, ene $$7, azh $$8, eqy $$9, boolean $$10) {
      return true;
   }

   @Override
   public eov<?> a() {
      return eov.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
