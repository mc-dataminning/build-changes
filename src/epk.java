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
   public km a(esm $$0, dqw $$1) {
      return km.h;
   }

   @Override
   public List<esl.a> a(esm $$0, ji $$1, dqw $$2, azh $$3) {
      return Collections.emptyList();
   }

   @Override
   public eob a(esm $$0, ji $$1, dqw $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(esm $$0, dhy $$1, dhv $$2, dzn $$3, ji $$4, ji $$5, dqw $$6, eob $$7, azh $$8, erv $$9, boolean $$10) {
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
