import java.util.Optional;
import javax.annotation.Nullable;

public record brr(String i) {
   public static final brr a = new brr("generic");
   public static final brr b = new brr("ladder");
   public static final brr c = new brr("vines");
   public static final brr d = new brr("weeping_vines");
   public static final brr e = new brr("twisting_vines");
   public static final brr f = new brr("scaffolding");
   public static final brr g = new brr("other_climbable");
   public static final brr h = new brr("water");

   public static brr a(dsb $$0) {
      if ($$0.a(dfa.cO) || $$0.a(awo.P)) {
         return b;
      } else if ($$0.a(dfa.ff)) {
         return c;
      } else if ($$0.a(dfa.oz) || $$0.a(dfa.oA)) {
         return d;
      } else if ($$0.a(dfa.oB) || $$0.a(dfa.oC)) {
         return e;
      } else {
         return $$0.a(dfa.nS) ? f : g;
      }
   }

   @Nullable
   public static brr a(bto $$0) {
      Optional<iz> $$1 = $$0.eM();
      if ($$1.isPresent()) {
         dsb $$2 = $$0.dP().a_($$1.get());
         return a($$2);
      } else {
         return $$0.be() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
