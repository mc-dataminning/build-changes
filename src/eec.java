import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class eec extends eej {
   public static final Codec<eec> a = Codec.unit(() -> eec.b);
   public static final eec b = new eec();

   private eec() {
      super(eel.a.a);
   }

   @Override
   public jg a(ehd $$0, dgm $$1) {
      return jg.g;
   }

   @Override
   public List<ehc.c> a(ehd $$0, ib $$1, dgm $$2, axd $$3) {
      return Collections.emptyList();
   }

   @Override
   public ecu a(ehd $$0, ib $$1, dgm $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(ehd $$0, cxu $$1, cxs $$2, dow $$3, ib $$4, ib $$5, dgm $$6, ecu $$7, axd $$8, boolean $$9) {
      return true;
   }

   @Override
   public eek<?> a() {
      return eek.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
