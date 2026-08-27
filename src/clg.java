import com.google.common.collect.Maps;
import java.util.Map;

public class clg extends cmm implements cnq {
   private static final Map<clf, clg> a = Maps.newEnumMap(clf.class);
   private final clf b;

   public clg(clf $$0, cmm.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bjv a(cmr $$0, cfb $$1, bmf $$2, bju $$3) {
      if ($$2 instanceof byo $$4 && $$4.bx() && !$$4.A() && $$4.w() != this.b) {
         $$4.dM().a($$1, $$4, arm.hi, arn.h, 1.0F, 1.0F);
         if (!$$1.dM().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bjv.a($$1.dM().B);
      }

      return bjv.d;
   }

   public clf d() {
      return this.b;
   }

   public static clg a(clf $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(cti $$0, dhx $$1, boolean $$2, cfb $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.aB_(), arm.hi, arn.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
