import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class ece extends ecl {
   public static final Codec<ece> a = Codec.unit(() -> ece.b);
   public static final ece b = new ece();

   private ece() {
      super(ecn.a.a);
   }

   @Override
   public jd a(eff $$0, dfa $$1) {
      return jd.g;
   }

   @Override
   public List<efe.c> a(eff $$0, hz $$1, dfa $$2, awo $$3) {
      return Collections.emptyList();
   }

   @Override
   public eaw a(eff $$0, hz $$1, dfa $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(eff $$0, cwi $$1, cwg $$2, dnc $$3, hz $$4, hz $$5, dfa $$6, eaw $$7, awo $$8, boolean $$9) {
      return true;
   }

   @Override
   public ecm<?> a() {
      return ecm.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
