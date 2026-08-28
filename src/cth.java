import com.google.common.collect.Maps;
import java.util.Map;

public class cth extends cuj implements cvt {
   private static final Map<ctg, cth> a = Maps.newEnumMap(ctg.class);
   private final ctg b;

   public cth(ctg $$0, cuj.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bqq a(cuo $$0, cmv $$1, btl $$2, bqp $$3) {
      if ($$2 instanceof cfy $$4 && $$4.bE() && !$$4.x() && $$4.t() != this.b) {
         $$4.dQ().a($$1, $$4, avo.hM, avp.h, 1.0F, 1.0F);
         if (!$$1.dQ().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bqq.a($$1.dQ().B);
      }

      return bqq.e;
   }

   public ctg c() {
      return this.b;
   }

   public static cth a(ctg $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dcu $$0, drq $$1, boolean $$2, cmv $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.az_(), avo.hM, avp.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
