import java.util.Optional;
import javax.annotation.Nullable;

public record bhz(String i) {
   public static final bhz a = new bhz("generic");
   public static final bhz b = new bhz("ladder");
   public static final bhz c = new bhz("vines");
   public static final bhz d = new bhz("weeping_vines");
   public static final bhz e = new bhz("twisting_vines");
   public static final bhz f = new bhz("scaffolding");
   public static final bhz g = new bhz("other_climbable");
   public static final bhz h = new bhz("water");

   public static bhz a(dfd $$0) {
      if ($$0.a(cte.cO) || $$0.a(apv.P)) {
         return b;
      } else if ($$0.a(cte.ff)) {
         return c;
      } else if ($$0.a(cte.oz) || $$0.a(cte.oA)) {
         return d;
      } else if ($$0.a(cte.oB) || $$0.a(cte.oC)) {
         return e;
      } else {
         return $$0.a(cte.nS) ? f : g;
      }
   }

   @Nullable
   public static bhz a(bjm $$0) {
      Optional<gw> $$1 = $$0.eG();
      if ($$1.isPresent()) {
         dfd $$2 = $$0.dL().a_($$1.get());
         return a($$2);
      } else {
         return $$0.aX() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
