import com.google.common.collect.Maps;
import java.util.Map;

public class cww extends cxu implements cza {
   private static final Map<cwv, cww> a = Maps.newEnumMap(cwv.class);
   private final cwv b;

   public cww(cwv $$0, cxu.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public btq a(cxy $$0, cqi $$1, bwr $$2, btp $$3) {
      if ($$2 instanceof cje $$4 && $$4.bK() && !$$4.x() && $$4.t() != this.b) {
         $$4.dV().a($$1, $$4, awk.ih, awl.h, 1.0F, 1.0F);
         if (!$$1.dV().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return btq.a;
      }

      return btq.e;
   }

   public cwv b() {
      return this.b;
   }

   public static cww a(cwv $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dhp $$0, dwz $$1, boolean $$2, cqi $$3) {
      if ($$1.a($$0x -> $$0x.a(this.b()), $$2)) {
         $$0.a(null, $$1.aw_(), awk.ih, awl.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
