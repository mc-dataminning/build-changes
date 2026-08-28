import java.util.Optional;
import javax.annotation.Nullable;

public record bvc(String i) {
   public static final bvc a = new bvc("generic");
   public static final bvc b = new bvc("ladder");
   public static final bvc c = new bvc("vines");
   public static final bvc d = new bvc("weeping_vines");
   public static final bvc e = new bvc("twisting_vines");
   public static final bvc f = new bvc("scaffolding");
   public static final bvc g = new bvc("other_climbable");
   public static final bvc h = new bvc("water");

   public static bvc a(eao $$0) {
      if ($$0.a(dmo.da) || $$0.a(axc.R)) {
         return b;
      } else if ($$0.a(dmo.fx)) {
         return c;
      } else if ($$0.a(dmo.pf) || $$0.a(dmo.pg)) {
         return d;
      } else if ($$0.a(dmo.ph) || $$0.a(dmo.pi)) {
         return e;
      } else {
         return $$0.a(dmo.oy) ? f : g;
      }
   }

   @Nullable
   public static bvc a(bxj $$0) {
      Optional<iv> $$1 = $$0.eO();
      if ($$1.isPresent()) {
         eao $$2 = $$0.dU().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bh() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
