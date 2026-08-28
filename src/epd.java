import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class epd extends epk {
   public static final MapCodec<epd> a = MapCodec.unit(() -> epd.b);
   public static final epd b = new epd();

   private epd() {
      super(epm.a.a);
   }

   @Override
   public kl a(esf $$0, dqu $$1) {
      return kl.g;
   }

   @Override
   public List<ese.a> a(esf $$0, jh $$1, dqu $$2, bam $$3) {
      return Collections.emptyList();
   }

   @Override
   public enu a(esf $$0, jh $$1, dqu $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(esf $$0, dhy $$1, dhw $$2, dzj $$3, jh $$4, jh $$5, dqu $$6, enu $$7, bam $$8, ero $$9, boolean $$10) {
      return true;
   }

   @Override
   public epl<?> a() {
      return epl.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
