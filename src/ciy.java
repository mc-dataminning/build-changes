import com.google.common.collect.Maps;
import java.util.Map;

public class ciy extends cke implements cli {
   private static final Map<cix, ciy> a = Maps.newEnumMap(cix.class);
   private final cix b;

   public ciy(cix $$0, cke.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bib a(ckj $$0, ccx $$1, bkj $$2, bia $$3) {
      if ($$2 instanceof bwq $$4 && $$4.bv() && !$$4.y() && $$4.t() != this.b) {
         $$4.dL().a($$1, $$4, aqd.gH, aqe.h, 1.0F, 1.0F);
         if (!$$1.dL().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bib.a($$1.dL().B);
      }

      return bib.d;
   }

   public cix d() {
      return this.b;
   }

   public static ciy a(cix $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(cqz $$0, dff $$1, boolean $$2, ccx $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.p(), aqd.gH, aqe.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
