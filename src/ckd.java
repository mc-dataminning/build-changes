import com.google.common.collect.Maps;
import java.util.Map;

public class ckd extends clj implements cmn {
   private static final Map<ckc, ckd> a = Maps.newEnumMap(ckc.class);
   private final ckc b;

   public ckd(ckc $$0, clj.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bjb a(clo $$0, cdz $$1, bll $$2, bja $$3) {
      if ($$2 instanceof bxs $$4 && $$4.bx() && !$$4.A() && $$4.w() != this.b) {
         $$4.dN().a($$1, $$4, aqv.gZ, aqw.h, 1.0F, 1.0F);
         if (!$$1.dN().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bjb.a($$1.dN().B);
      }

      return bjb.d;
   }

   public ckc d() {
      return this.b;
   }

   public static ckd a(ckc $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(csf $$0, dgr $$1, boolean $$2, cdz $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.aC_(), aqv.gZ, aqw.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
