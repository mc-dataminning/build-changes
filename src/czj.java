import com.google.common.collect.Maps;
import java.util.Map;

public class czj extends dag implements dbm {
   private static final Map<czi, czj> a = Maps.newEnumMap(czi.class);
   private final czi b;

   public czj(czi $$0, dag.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bvc a(dak $$0, csi $$1, byf $$2, bvb $$3) {
      if ($$2 instanceof cmr $$4 && $$4.bJ() && !$$4.x() && $$4.t() != this.b) {
         $$4.dV().a($$1, $$4, awy.ik, awz.h, 1.0F, 1.0F);
         if (!$$1.dV().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bvc.a;
      }

      return bvc.e;
   }

   public czi a() {
      return this.b;
   }

   public static czj a(czi $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dkj $$0, eac $$1, boolean $$2, csi $$3) {
      if ($$1.a($$0x -> $$0x.a(this.a()), $$2)) {
         $$0.a(null, $$1.aC_(), awy.ik, awz.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
