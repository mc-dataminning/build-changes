import com.google.common.collect.Maps;
import java.util.Map;

public class cno extends cou implements cpy {
   private static final Map<cnn, cno> a = Maps.newEnumMap(cnn.class);
   private final cnn b;

   public cno(cnn $$0, cou.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public blu a(coz $$0, chh $$1, bog $$2, blt $$3) {
      if ($$2 instanceof cap $$4 && $$4.bx() && !$$4.A() && $$4.w() != this.b) {
         $$4.dM().a($$1, $$4, atk.hx, atl.h, 1.0F, 1.0F);
         if (!$$1.dM().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return blu.a($$1.dM().B);
      }

      return blu.d;
   }

   public cnn d() {
      return this.b;
   }

   public static cno a(cnn $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(cvn $$0, dkc $$1, boolean $$2, chh $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.aE_(), atk.hx, atl.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
