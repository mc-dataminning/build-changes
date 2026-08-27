import com.google.common.collect.Maps;
import java.util.Map;

public class chp extends civ implements cjz {
   private static final Map<cho, chp> a = Maps.newEnumMap(cho.class);
   private final cho b;

   public chp(cho $$0, civ.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bgt a(cja $$0, cbp $$1, bjb $$2, bgs $$3) {
      if ($$2 instanceof bvi $$4 && $$4.bv() && !$$4.t() && $$4.q() != this.b) {
         $$4.dK().a($$1, $$4, aoz.gF, apa.h, 1.0F, 1.0F);
         if (!$$1.dK().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bgt.a($$1.dK().B);
      }

      return bgt.d;
   }

   public cho d() {
      return this.b;
   }

   public static chp a(cho $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(cpq $$0, ddy $$1, boolean $$2, cbp $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.p(), aoz.gF, apa.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
