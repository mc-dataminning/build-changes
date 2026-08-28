import java.util.Optional;
import javax.annotation.Nullable;

public record buz(String i) {
   public static final buz a = new buz("generic");
   public static final buz b = new buz("ladder");
   public static final buz c = new buz("vines");
   public static final buz d = new buz("weeping_vines");
   public static final buz e = new buz("twisting_vines");
   public static final buz f = new buz("scaffolding");
   public static final buz g = new buz("other_climbable");
   public static final buz h = new buz("water");

   public static buz a(eah $$0) {
      if ($$0.a(dmh.da) || $$0.a(axc.R)) {
         return b;
      } else if ($$0.a(dmh.fx)) {
         return c;
      } else if ($$0.a(dmh.pf) || $$0.a(dmh.pg)) {
         return d;
      } else if ($$0.a(dmh.ph) || $$0.a(dmh.pi)) {
         return e;
      } else {
         return $$0.a(dmh.oy) ? f : g;
      }
   }

   @Nullable
   public static buz a(bxe $$0) {
      Optional<iu> $$1 = $$0.eP();
      if ($$1.isPresent()) {
         eah $$2 = $$0.dV().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bj() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
