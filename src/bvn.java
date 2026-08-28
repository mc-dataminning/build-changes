import java.util.Optional;
import javax.annotation.Nullable;

public record bvn(String i) {
   public static final bvn a = new bvn("generic");
   public static final bvn b = new bvn("ladder");
   public static final bvn c = new bvn("vines");
   public static final bvn d = new bvn("weeping_vines");
   public static final bvn e = new bvn("twisting_vines");
   public static final bvn f = new bvn("scaffolding");
   public static final bvn g = new bvn("other_climbable");
   public static final bvn h = new bvn("water");

   public static bvn a(ebe $$0) {
      if ($$0.a(dne.da) || $$0.a(axe.R)) {
         return b;
      } else if ($$0.a(dne.fx)) {
         return c;
      } else if ($$0.a(dne.pf) || $$0.a(dne.pg)) {
         return d;
      } else if ($$0.a(dne.ph) || $$0.a(dne.pi)) {
         return e;
      } else {
         return $$0.a(dne.oy) ? f : g;
      }
   }

   @Nullable
   public static bvn a(bxu $$0) {
      Optional<iv> $$1 = $$0.eP();
      if ($$1.isPresent()) {
         ebe $$2 = $$0.dV().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bi() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
