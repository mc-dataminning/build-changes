import com.google.common.collect.Maps;
import java.util.Map;

public class cuv extends cvt implements cxb {
   private static final Map<cuu, cuv> a = Maps.newEnumMap(cuu.class);
   private final cuu b;

   public cuv(cuu $$0, cvt.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bry a(cvx $$0, coh $$1, buv $$2, brx $$3) {
      if ($$2 instanceof chi $$4 && $$4.bM() && !$$4.y() && $$4.t() != this.b) {
         $$4.dX().a($$1, $$4, awk.hN, awl.h, 1.0F, 1.0F);
         if (!$$1.dX().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bry.a;
      }

      return bry.e;
   }

   public cuu c() {
      return this.b;
   }

   public static cuv a(cuu $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dev $$0, dts $$1, boolean $$2, coh $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.aC_(), awk.hN, awl.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
