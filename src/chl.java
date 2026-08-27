import com.google.common.collect.Maps;
import java.util.Map;

public class chl extends cir implements cjv {
   private static final Map<chk, chl> a = Maps.newEnumMap(chk.class);
   private final chk b;

   public chl(chk $$0, cir.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bgo a(ciw $$0, cbl $$1, biw $$2, bgn $$3) {
      if ($$2 instanceof bve $$4 && $$4.bv() && !$$4.t() && $$4.q() != this.b) {
         $$4.dK().a($$1, $$4, aou.gF, aov.h, 1.0F, 1.0F);
         if (!$$1.dK().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bgo.a($$1.dK().B);
      }

      return bgo.d;
   }

   public chk d() {
      return this.b;
   }

   public static chl a(chk $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(cpk $$0, dds $$1, boolean $$2, cbl $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.p(), aou.gF, aov.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
