import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class esj extends esq {
   public static final MapCodec<esj> a = MapCodec.unit(() -> esj.b);
   public static final esj b = new esj();

   private esj() {
      super(ess.a.a);
   }

   @Override
   public ka a(evl $$0, dtg $$1) {
      return ka.i;
   }

   @Override
   public List<evk.a> a(evl $$0, iv $$1, dtg $$2, azv $$3) {
      return Collections.emptyList();
   }

   @Override
   public era a(evl $$0, iv $$1, dtg $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(evl $$0, dkg $$1, dkd $$2, ecm $$3, iv $$4, iv $$5, dtg $$6, era $$7, azv $$8, euu $$9, boolean $$10) {
      return true;
   }

   @Override
   public esr<?> a() {
      return esr.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
