import java.util.Optional;
import javax.annotation.Nullable;

public record brt(String i) {
   public static final brt a = new brt("generic");
   public static final brt b = new brt("ladder");
   public static final brt c = new brt("vines");
   public static final brt d = new brt("weeping_vines");
   public static final brt e = new brt("twisting_vines");
   public static final brt f = new brt("scaffolding");
   public static final brt g = new brt("other_climbable");
   public static final brt h = new brt("water");

   public static brt a(dsd $$0) {
      if ($$0.a(dfc.cO) || $$0.a(awp.P)) {
         return b;
      } else if ($$0.a(dfc.ff)) {
         return c;
      } else if ($$0.a(dfc.oz) || $$0.a(dfc.oA)) {
         return d;
      } else if ($$0.a(dfc.oB) || $$0.a(dfc.oC)) {
         return e;
      } else {
         return $$0.a(dfc.nS) ? f : g;
      }
   }

   @Nullable
   public static brt a(btq $$0) {
      Optional<iz> $$1 = $$0.eM();
      if ($$1.isPresent()) {
         dsd $$2 = $$0.dP().a_($$1.get());
         return a($$2);
      } else {
         return $$0.be() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
