import com.google.common.collect.Maps;
import java.util.Map;

public class cyc extends cyz implements daf {
   private static final Map<cyb, cyc> a = Maps.newEnumMap(cyb.class);
   private final cyb b;

   public cyc(cyb $$0, cyz.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bud a(czd $$0, crc $$1, bxe $$2, buc $$3) {
      if ($$2 instanceof cjw $$4 && $$4.bK() && !$$4.x() && $$4.t() != this.b) {
         $$4.dV().a($$1, $$4, awn.ik, awo.h, 1.0F, 1.0F);
         if (!$$1.dV().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bud.a;
      }

      return bud.e;
   }

   public cyb a() {
      return this.b;
   }

   public static cyc a(cyb $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dja $$0, dyt $$1, boolean $$2, crc $$3) {
      if ($$1.a($$0x -> $$0x.a(this.a()), $$2)) {
         $$0.a(null, $$1.ax_(), awn.ik, awo.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
