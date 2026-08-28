import java.util.Optional;
import javax.annotation.Nullable;

public record bvy(String i) {
   public static final bvy a = new bvy("generic");
   public static final bvy b = new bvy("ladder");
   public static final bvy c = new bvy("vines");
   public static final bvy d = new bvy("weeping_vines");
   public static final bvy e = new bvy("twisting_vines");
   public static final bvy f = new bvy("scaffolding");
   public static final bvy g = new bvy("other_climbable");
   public static final bvy h = new bvy("water");

   public static bvy a(ebq $$0) {
      if ($$0.a(dnq.da) || $$0.a(axn.R)) {
         return b;
      } else if ($$0.a(dnq.fx)) {
         return c;
      } else if ($$0.a(dnq.pf) || $$0.a(dnq.pg)) {
         return d;
      } else if ($$0.a(dnq.ph) || $$0.a(dnq.pi)) {
         return e;
      } else {
         return $$0.a(dnq.oy) ? f : g;
      }
   }

   @Nullable
   public static bvy a(byf $$0) {
      Optional<iw> $$1 = $$0.eP();
      if ($$1.isPresent()) {
         ebq $$2 = $$0.dV().a_($$1.get());
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
