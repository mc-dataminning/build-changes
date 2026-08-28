import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class epe extends epl {
   public static final MapCodec<epe> a = MapCodec.unit(() -> epe.b);
   public static final epe b = new epe();

   private epe() {
      super(epn.a.a);
   }

   @Override
   public kl a(esg $$0, dqv $$1) {
      return kl.h;
   }

   @Override
   public List<esf.a> a(esg $$0, jh $$1, dqv $$2, bac $$3) {
      return Collections.emptyList();
   }

   @Override
   public env a(esg $$0, jh $$1, dqv $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(esg $$0, dhx $$1, dhv $$2, dzk $$3, jh $$4, jh $$5, dqv $$6, env $$7, bac $$8, erp $$9, boolean $$10) {
      return true;
   }

   @Override
   public epm<?> a() {
      return epm.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
