import java.util.Optional;
import javax.annotation.Nullable;

public record bjl(String i) {
   public static final bjl a = new bjl("generic");
   public static final bjl b = new bjl("ladder");
   public static final bjl c = new bjl("vines");
   public static final bjl d = new bjl("weeping_vines");
   public static final bjl e = new bjl("twisting_vines");
   public static final bjl f = new bjl("scaffolding");
   public static final bjl g = new bjl("other_climbable");
   public static final bjl h = new bjl("water");

   public static bjl a(dgw $$0) {
      if ($$0.a(cuv.cO) || $$0.a(arc.P)) {
         return b;
      } else if ($$0.a(cuv.ff)) {
         return c;
      } else if ($$0.a(cuv.oz) || $$0.a(cuv.oA)) {
         return d;
      } else if ($$0.a(cuv.oB) || $$0.a(cuv.oC)) {
         return e;
      } else {
         return $$0.a(cuv.nS) ? f : g;
      }
   }

   @Nullable
   public static bjl a(bky $$0) {
      Optional<ht> $$1 = $$0.eG();
      if ($$1.isPresent()) {
         dgw $$2 = $$0.dL().a_($$1.get());
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
