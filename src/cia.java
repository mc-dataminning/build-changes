import com.google.common.collect.Maps;
import java.util.Map;

public class cia extends cjg implements ckk {
   private static final Map<chz, cia> a = Maps.newEnumMap(chz.class);
   private final chz b;

   public cia(chz $$0, cjg.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bhe a(cjl $$0, cca $$1, bjm $$2, bhd $$3) {
      if ($$2 instanceof bvt $$4 && $$4.bv() && !$$4.y() && $$4.t() != this.b) {
         $$4.dL().a($$1, $$4, apg.gF, aph.h, 1.0F, 1.0F);
         if (!$$1.dL().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bhe.a($$1.dL().B);
      }

      return bhe.d;
   }

   public chz d() {
      return this.b;
   }

   public static cia a(chz $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(cqb $$0, deh $$1, boolean $$2, cca $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.p(), apg.gF, aph.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
