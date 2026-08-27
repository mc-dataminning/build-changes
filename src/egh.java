import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class egh extends ego {
   public static final Codec<egh> a = Codec.unit(() -> egh.b);
   public static final egh b = new egh();

   private egh() {
      super(egq.a.a);
   }

   @Override
   public jg a(eji $$0, dik $$1) {
      return jg.g;
   }

   @Override
   public List<ejh.c> a(eji $$0, ib $$1, dik $$2, axr $$3) {
      return Collections.emptyList();
   }

   @Override
   public eez a(eji $$0, ib $$1, dik $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(eji $$0, czs $$1, czq $$2, dqw $$3, ib $$4, ib $$5, dik $$6, eez $$7, axr $$8, boolean $$9) {
      return true;
   }

   @Override
   public egp<?> a() {
      return egp.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
