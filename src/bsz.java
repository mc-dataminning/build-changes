import java.util.Optional;
import javax.annotation.Nullable;

public record bsz(String i) {
   public static final bsz a = new bsz("generic");
   public static final bsz b = new bsz("ladder");
   public static final bsz c = new bsz("vines");
   public static final bsz d = new bsz("weeping_vines");
   public static final bsz e = new bsz("twisting_vines");
   public static final bsz f = new bsz("scaffolding");
   public static final bsz g = new bsz("other_climbable");
   public static final bsz h = new bsz("water");

   public static bsz a(dvj $$0) {
      if ($$0.a(dig.cO) || $$0.a(axa.Q)) {
         return b;
      } else if ($$0.a(dig.ff)) {
         return c;
      } else if ($$0.a(dig.oz) || $$0.a(dig.oA)) {
         return d;
      } else if ($$0.a(dig.oB) || $$0.a(dig.oC)) {
         return e;
      } else {
         return $$0.a(dig.nS) ? f : g;
      }
   }

   @Nullable
   public static bsz a(bva $$0) {
      Optional<jh> $$1 = $$0.eQ();
      if ($$1.isPresent()) {
         dvj $$2 = $$0.dX().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bk() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
