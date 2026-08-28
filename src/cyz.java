import com.google.common.collect.Maps;
import java.util.Map;

public class cyz extends czw implements dbc {
   private static final Map<cyy, cyz> a = Maps.newEnumMap(cyy.class);
   private final cyy b;

   public cyz(cyy $$0, czw.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public but a(daa $$0, crz $$1, bxw $$2, bus $$3) {
      if ($$2 instanceof cmi $$4 && $$4.bJ() && !$$4.x() && $$4.t() != this.b) {
         $$4.dV().a($$1, $$4, awr.ik, aws.h, 1.0F, 1.0F);
         if (!$$1.dV().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return but.a;
      }

      return but.e;
   }

   public cyy a() {
      return this.b;
   }

   public static cyz a(cyy $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(djz $$0, dzs $$1, boolean $$2, crz $$3) {
      if ($$1.a($$0x -> $$0x.a(this.a()), $$2)) {
         $$0.a(null, $$1.aB_(), awr.ik, aws.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
