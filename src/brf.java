import java.util.Optional;
import javax.annotation.Nullable;

public record brf(String i) {
   public static final brf a = new brf("generic");
   public static final brf b = new brf("ladder");
   public static final brf c = new brf("vines");
   public static final brf d = new brf("weeping_vines");
   public static final brf e = new brf("twisting_vines");
   public static final brf f = new brf("scaffolding");
   public static final brf g = new brf("other_climbable");
   public static final brf h = new brf("water");

   public static brf a(dsl $$0) {
      if ($$0.a(dfk.cO) || $$0.a(avw.P)) {
         return b;
      } else if ($$0.a(dfk.ff)) {
         return c;
      } else if ($$0.a(dfk.oz) || $$0.a(dfk.oA)) {
         return d;
      } else if ($$0.a(dfk.oB) || $$0.a(dfk.oC)) {
         return e;
      } else {
         return $$0.a(dfk.nS) ? f : g;
      }
   }

   @Nullable
   public static brf a(btc $$0) {
      Optional<ja> $$1 = $$0.eK();
      if ($$1.isPresent()) {
         dsl $$2 = $$0.dR().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bg() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
