import java.util.Optional;
import javax.annotation.Nullable;

public record bhj(String i) {
   public static final bhj a = new bhj("generic");
   public static final bhj b = new bhj("ladder");
   public static final bhj c = new bhj("vines");
   public static final bhj d = new bhj("weeping_vines");
   public static final bhj e = new bhj("twisting_vines");
   public static final bhj f = new bhj("scaffolding");
   public static final bhj g = new bhj("other_climbable");
   public static final bhj h = new bhj("water");

   public static bhj a(dey $$0) {
      if ($$0.a(csl.cO) || $$0.a(apj.P)) {
         return b;
      } else if ($$0.a(csl.ff)) {
         return c;
      } else if ($$0.a(csl.oz) || $$0.a(csl.oA)) {
         return d;
      } else if ($$0.a(csl.oB) || $$0.a(csl.oC)) {
         return e;
      } else {
         return $$0.a(csl.nS) ? f : g;
      }
   }

   @Nullable
   public static bhj a(biw $$0) {
      Optional<gv> $$1 = $$0.eF();
      if ($$1.isPresent()) {
         dey $$2 = $$0.dK().a_($$1.get());
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
