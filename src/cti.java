import com.google.common.collect.Maps;
import java.util.Map;

public class cti extends cuj implements cvq {
   private static final Map<cth, cti> a = Maps.newEnumMap(cth.class);
   private final cth b;

   public cti(cth $$0, cuj.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bqt a(cuo $$0, cmw $$1, bto $$2, bqs $$3) {
      if ($$2 instanceof cga $$4 && $$4.bD() && !$$4.y() && $$4.u() != this.b) {
         $$4.dP().a($$1, $$4, avz.hM, awa.h, 1.0F, 1.0F);
         if (!$$1.dP().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bqt.a($$1.dP().B);
      }

      return bqt.e;
   }

   public cth c() {
      return this.b;
   }

   public static cti a(cth $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dbx $$0, dqq $$1, boolean $$2, cmw $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.ay_(), avz.hM, awa.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
