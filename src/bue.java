import java.util.Optional;
import javax.annotation.Nullable;

public record bue(String i) {
   public static final bue a = new bue("generic");
   public static final bue b = new bue("ladder");
   public static final bue c = new bue("vines");
   public static final bue d = new bue("weeping_vines");
   public static final bue e = new bue("twisting_vines");
   public static final bue f = new bue("scaffolding");
   public static final bue g = new bue("other_climbable");
   public static final bue h = new bue("water");

   public static bue a(dxu $$0) {
      if ($$0.a(dkn.cX) || $$0.a(axu.R)) {
         return b;
      } else if ($$0.a(dkn.ft)) {
         return c;
      } else if ($$0.a(dkn.oU) || $$0.a(dkn.oV)) {
         return d;
      } else if ($$0.a(dkn.oW) || $$0.a(dkn.oX)) {
         return e;
      } else {
         return $$0.a(dkn.on) ? f : g;
      }
   }

   @Nullable
   public static bue a(bwf $$0) {
      Optional<jh> $$1 = $$0.eN();
      if ($$1.isPresent()) {
         dxu $$2 = $$0.dW().a_($$1.get());
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
