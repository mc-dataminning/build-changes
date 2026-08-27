import com.google.common.collect.Maps;
import java.util.Map;

public class cjy extends cle implements cmi {
   private static final Map<cjx, cjy> a = Maps.newEnumMap(cjx.class);
   private final cjx b;

   public cjy(cjx $$0, cle.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bix a(clj $$0, cdu $$1, blg $$2, biw $$3) {
      if ($$2 instanceof bxn $$4 && $$4.bx() && !$$4.A() && $$4.w() != this.b) {
         $$4.dN().a($$1, $$4, aqr.gZ, aqs.h, 1.0F, 1.0F);
         if (!$$1.dN().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bix.a($$1.dN().B);
      }

      return bix.d;
   }

   public cjx d() {
      return this.b;
   }

   public static cjy a(cjx $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(csa $$0, dgm $$1, boolean $$2, cdu $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.p(), aqr.gZ, aqs.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
