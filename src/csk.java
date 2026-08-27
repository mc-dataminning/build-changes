import com.google.common.collect.Maps;
import java.util.Map;

public class csk extends ctl implements cus {
   private static final Map<csj, csk> a = Maps.newEnumMap(csj.class);
   private final csj b;

   public csk(csj $$0, ctl.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bpw a(ctq $$0, cly $$1, bsq $$2, bpv $$3) {
      if ($$2 instanceof cfc $$4 && $$4.bD() && !$$4.y() && $$4.u() != this.b) {
         $$4.dP().a($$1, $$4, avi.hM, avj.h, 1.0F, 1.0F);
         if (!$$1.dP().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bpw.a($$1.dP().B);
      }

      return bpw.d;
   }

   public csj c() {
      return this.b;
   }

   public static csk a(csj $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(daz $$0, dps $$1, boolean $$2, cly $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.aA_(), avi.hM, avj.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
