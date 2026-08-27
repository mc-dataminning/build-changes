import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class dta extends dth {
   public static final Codec<dta> a = Codec.unit(() -> dta.b);
   public static final dta b = new dta();

   private dta() {
      super(dtj.a.a);
   }

   @Override
   public hz a(dvu $$0, cvz $$1) {
      return hz.g;
   }

   @Override
   public List<dvt.c> a(dvu $$0, gu $$1, cvz $$2, apf $$3) {
      return Collections.emptyList();
   }

   @Override
   public drs a(dvu $$0, gu $$1, cvz $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(dvu $$0, cng $$1, cne $$2, ddy $$3, gu $$4, gu $$5, cvz $$6, drs $$7, apf $$8, boolean $$9) {
      return true;
   }

   @Override
   public dti<?> a() {
      return dti.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
