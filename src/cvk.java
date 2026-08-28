import com.google.common.collect.Maps;
import java.util.Map;

public class cvk extends cwi implements cxq {
   private static final Map<cvj, cvk> a = Maps.newEnumMap(cvj.class);
   private final cvj b;

   public cvk(cvj $$0, cwi.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bsk a(cwm $$0, cou $$1, bvh $$2, bsj $$3) {
      if ($$2 instanceof chu $$4 && $$4.bL() && !$$4.v() && $$4.q() != this.b) {
         $$4.dV().a($$1, $$4, awn.hN, awo.h, 1.0F, 1.0F);
         if (!$$1.dV().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bsk.a;
      }

      return bsk.e;
   }

   public cvj b() {
      return this.b;
   }

   public static cvk a(cvj $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dfm $$0, duk $$1, boolean $$2, cou $$3) {
      if ($$1.a($$0x -> $$0x.a(this.b()), $$2)) {
         $$0.a(null, $$1.aA_(), awn.hN, awo.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
