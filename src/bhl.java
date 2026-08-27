import java.util.Optional;
import javax.annotation.Nullable;

public record bhl(String i) {
   public static final bhl a = new bhl("generic");
   public static final bhl b = new bhl("ladder");
   public static final bhl c = new bhl("vines");
   public static final bhl d = new bhl("weeping_vines");
   public static final bhl e = new bhl("twisting_vines");
   public static final bhl f = new bhl("scaffolding");
   public static final bhl g = new bhl("other_climbable");
   public static final bhl h = new bhl("water");

   public static bhl a(dfa $$0) {
      if ($$0.a(csn.cO) || $$0.a(apl.P)) {
         return b;
      } else if ($$0.a(csn.ff)) {
         return c;
      } else if ($$0.a(csn.oz) || $$0.a(csn.oA)) {
         return d;
      } else if ($$0.a(csn.oB) || $$0.a(csn.oC)) {
         return e;
      } else {
         return $$0.a(csn.nS) ? f : g;
      }
   }

   @Nullable
   public static bhl a(biy $$0) {
      Optional<gu> $$1 = $$0.eF();
      if ($$1.isPresent()) {
         dfa $$2 = $$0.dK().a_($$1.get());
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
