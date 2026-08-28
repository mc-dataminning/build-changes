import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class emd extends emk {
   public static final MapCodec<emd> a = MapCodec.unit(() -> emd.b);
   public static final emd b = new emd();

   private emd() {
      super(emm.a.a);
   }

   @Override
   public ki a(epf $$0, dnx $$1) {
      return ki.g;
   }

   @Override
   public List<epe.c> a(epf $$0, je $$1, dnx $$2, azl $$3) {
      return Collections.emptyList();
   }

   @Override
   public eku a(epf $$0, je $$1, dnx $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(epf $$0, dfd $$1, dfb $$2, dwl $$3, je $$4, je $$5, dnx $$6, eku $$7, azl $$8, eoo $$9, boolean $$10) {
      return true;
   }

   @Override
   public eml<?> a() {
      return eml.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
