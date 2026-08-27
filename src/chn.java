import com.google.common.collect.Maps;
import java.util.Map;

public class chn extends cit implements cjx {
   private static final Map<chm, chn> a = Maps.newEnumMap(chm.class);
   private final chm b;

   public chn(chm $$0, cit.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bgq a(ciy $$0, cbn $$1, biy $$2, bgp $$3) {
      if ($$2 instanceof bvg $$4 && $$4.bv() && !$$4.t() && $$4.q() != this.b) {
         $$4.dK().a($$1, $$4, aow.gF, aox.h, 1.0F, 1.0F);
         if (!$$1.dK().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bgq.a($$1.dK().B);
      }

      return bgq.d;
   }

   public chm d() {
      return this.b;
   }

   public static chn a(chm $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(cpm $$0, ddu $$1, boolean $$2, cbn $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.p(), aow.gF, aox.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
