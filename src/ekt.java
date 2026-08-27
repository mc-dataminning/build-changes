import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class ekt extends ela {
   public static final Codec<ekt> a = Codec.unit(() -> ekt.b);
   public static final ekt b = new ekt();

   private ekt() {
      super(elc.a.a);
   }

   @Override
   public jv a(enu $$0, dmd $$1) {
      return jv.g;
   }

   @Override
   public List<ent.c> a(enu $$0, ir $$1, dmd $$2, ayt $$3) {
      return Collections.emptyList();
   }

   @Override
   public ejl a(enu $$0, ir $$1, dmd $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(enu $$0, dcv $$1, dct $$2, duz $$3, ir $$4, ir $$5, dmd $$6, ejl $$7, ayt $$8, boolean $$9) {
      return true;
   }

   @Override
   public elb<?> a() {
      return elb.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
