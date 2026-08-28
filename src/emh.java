import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class emh extends emo {
   public static final MapCodec<emh> a = MapCodec.unit(() -> emh.b);
   public static final emh b = new emh();

   private emh() {
      super(emq.a.a);
   }

   @Override
   public kj a(epj $$0, doa $$1) {
      return kj.g;
   }

   @Override
   public List<epi.c> a(epj $$0, jf $$1, doa $$2, azn $$3) {
      return Collections.emptyList();
   }

   @Override
   public eky a(epj $$0, jf $$1, doa $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(epj $$0, dfg $$1, dfe $$2, dwp $$3, jf $$4, jf $$5, doa $$6, eky $$7, azn $$8, eos $$9, boolean $$10) {
      return true;
   }

   @Override
   public emp<?> a() {
      return emp.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
