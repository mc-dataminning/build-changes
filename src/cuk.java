import com.google.common.collect.Maps;
import java.util.Map;

public class cuk extends cvk implements cwt {
   private static final Map<cuj, cuk> a = Maps.newEnumMap(cuj.class);
   private final cuj b;

   public cuk(cuj $$0, cvk.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public brp a(cvp $$0, cnu $$1, buk $$2, bro $$3) {
      if ($$2 instanceof cgw $$4 && $$4.bI() && !$$4.y() && $$4.t() != this.b) {
         $$4.dS().a($$1, $$4, awe.hN, awf.h, 1.0F, 1.0F);
         if (!$$1.dS().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return brp.a;
      }

      return brp.e;
   }

   public cuj c() {
      return this.b;
   }

   public static cuk a(cuj $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(deg $$0, dte $$1, boolean $$2, cnu $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.aB_(), awe.hN, awf.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
