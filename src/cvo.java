import com.google.common.collect.Maps;
import java.util.Map;

public class cvo extends cwm implements cxu {
   private static final Map<cvn, cvo> a = Maps.newEnumMap(cvn.class);
   private final cvn b;

   public cvo(cvn $$0, cwm.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bsl a(cwq $$0, coy $$1, bvi $$2, bsk $$3) {
      if ($$2 instanceof chv $$4 && $$4.bL() && !$$4.x() && $$4.t() != this.b) {
         $$4.dV().a($$1, $$4, awa.ih, awb.h, 1.0F, 1.0F);
         if (!$$1.dV().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bsl.a;
      }

      return bsl.e;
   }

   public cvn b() {
      return this.b;
   }

   public static cvo a(cvn $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dgj $$0, dvn $$1, boolean $$2, coy $$3) {
      if ($$1.a($$0x -> $$0x.a(this.b()), $$2)) {
         $$0.a(null, $$1.aA_(), awa.ih, awb.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
