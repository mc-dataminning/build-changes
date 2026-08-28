import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class eqh extends eqo {
   public static final MapCodec<eqh> a = MapCodec.unit(() -> eqh.b);
   public static final eqh b = new eqh();

   private eqh() {
      super(eqq.a.a);
   }

   @Override
   public kn a(etj $$0, drm $$1) {
      return kn.i;
   }

   @Override
   public List<eti.a> a(etj $$0, jj $$1, drm $$2, azs $$3) {
      return Collections.emptyList();
   }

   @Override
   public eoy a(etj $$0, jj $$1, drm $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(etj $$0, dio $$1, dil $$2, eak $$3, jj $$4, jj $$5, drm $$6, eoy $$7, azs $$8, ess $$9, boolean $$10) {
      return true;
   }

   @Override
   public eqp<?> a() {
      return eqp.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
