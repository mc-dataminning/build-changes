import java.util.Optional;
import javax.annotation.Nullable;

public record bms(String i) {
   public static final bms a = new bms("generic");
   public static final bms b = new bms("ladder");
   public static final bms c = new bms("vines");
   public static final bms d = new bms("weeping_vines");
   public static final bms e = new bms("twisting_vines");
   public static final bms f = new bms("scaffolding");
   public static final bms g = new bms("other_climbable");
   public static final bms h = new bms("water");

   public static bms a(dlf $$0) {
      if ($$0.a(cyq.cO) || $$0.a(atz.P)) {
         return b;
      } else if ($$0.a(cyq.ff)) {
         return c;
      } else if ($$0.a(cyq.oz) || $$0.a(cyq.oA)) {
         return d;
      } else if ($$0.a(cyq.oB) || $$0.a(cyq.oC)) {
         return e;
      } else {
         return $$0.a(cyq.nS) ? f : g;
      }
   }

   @Nullable
   public static bms a(bog $$0) {
      Optional<hz> $$1 = $$0.eI();
      if ($$1.isPresent()) {
         dlf $$2 = $$0.dM().a_($$1.get());
         return a($$2);
      } else {
         return $$0.aZ() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
