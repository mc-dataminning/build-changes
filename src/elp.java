import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class elp extends elw {
   public static final MapCodec<elp> a = MapCodec.unit(() -> elp.b);
   public static final elp b = new elp();

   private elp() {
      super(ely.a.a);
   }

   @Override
   public ki a(eor $$0, dnj $$1) {
      return ki.g;
   }

   @Override
   public List<eoq.c> a(eor $$0, je $$1, dnj $$2, azk $$3) {
      return Collections.emptyList();
   }

   @Override
   public ekg a(eor $$0, je $$1, dnj $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(eor $$0, dep $$1, den $$2, dvx $$3, je $$4, je $$5, dnj $$6, ekg $$7, azk $$8, eoa $$9, boolean $$10) {
      return true;
   }

   @Override
   public elx<?> a() {
      return elx.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
