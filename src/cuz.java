import com.google.common.collect.Maps;
import java.util.Map;

public class cuz extends cvx implements cxf {
   private static final Map<cuy, cuz> a = Maps.newEnumMap(cuy.class);
   private final cuy b;

   public cuz(cuy $$0, cvx.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bsd a(cwb $$0, com $$1, bva $$2, bsc $$3) {
      if ($$2 instanceof chn $$4 && $$4.bM() && !$$4.y() && $$4.t() != this.b) {
         $$4.dX().a($$1, $$4, awl.hN, awm.h, 1.0F, 1.0F);
         if (!$$1.dX().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bsd.a;
      }

      return bsd.e;
   }

   public cuy b() {
      return this.b;
   }

   public static cuz a(cuy $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dfb $$0, dty $$1, boolean $$2, com $$3) {
      if ($$1.a($$0x -> $$0x.a(this.b()), $$2)) {
         $$0.a(null, $$1.aB_(), awl.hN, awm.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
