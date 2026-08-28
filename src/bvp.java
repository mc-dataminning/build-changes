import java.util.Optional;
import javax.annotation.Nullable;

public record bvp(String i) {
   public static final bvp a = new bvp("generic");
   public static final bvp b = new bvp("ladder");
   public static final bvp c = new bvp("vines");
   public static final bvp d = new bvp("weeping_vines");
   public static final bvp e = new bvp("twisting_vines");
   public static final bvp f = new bvp("scaffolding");
   public static final bvp g = new bvp("other_climbable");
   public static final bvp h = new bvp("water");

   public static bvp a(ebg $$0) {
      if ($$0.a(dng.da) || $$0.a(axg.R)) {
         return b;
      } else if ($$0.a(dng.fx)) {
         return c;
      } else if ($$0.a(dng.pf) || $$0.a(dng.pg)) {
         return d;
      } else if ($$0.a(dng.ph) || $$0.a(dng.pi)) {
         return e;
      } else {
         return $$0.a(dng.oy) ? f : g;
      }
   }

   @Nullable
   public static bvp a(bxw $$0) {
      Optional<iw> $$1 = $$0.eP();
      if ($$1.isPresent()) {
         ebg $$2 = $$0.dV().a_($$1.get());
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
