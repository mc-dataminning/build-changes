import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class epk extends epr {
   public static final MapCodec<epk> a = MapCodec.unit(() -> epk.b);
   public static final epk b = new epk();

   private epk() {
      super(ept.a.a);
   }

   @Override
   public kl a(esm $$0, drb $$1) {
      return kl.g;
   }

   @Override
   public List<esl.a> a(esm $$0, jh $$1, drb $$2, bam $$3) {
      return Collections.emptyList();
   }

   @Override
   public eob a(esm $$0, jh $$1, drb $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(esm $$0, dif $$1, did $$2, dzq $$3, jh $$4, jh $$5, drb $$6, eob $$7, bam $$8, erv $$9, boolean $$10) {
      return true;
   }

   @Override
   public eps<?> a() {
      return eps.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
