import java.util.Optional;
import javax.annotation.Nullable;

public record bjt(String i) {
   public static final bjt a = new bjt("generic");
   public static final bjt b = new bjt("ladder");
   public static final bjt c = new bjt("vines");
   public static final bjt d = new bjt("weeping_vines");
   public static final bjt e = new bjt("twisting_vines");
   public static final bjt f = new bjt("scaffolding");
   public static final bjt g = new bjt("other_climbable");
   public static final bjt h = new bjt("water");

   public static bjt a(dhi $$0) {
      if ($$0.a(cvc.cO) || $$0.a(arg.P)) {
         return b;
      } else if ($$0.a(cvc.ff)) {
         return c;
      } else if ($$0.a(cvc.oz) || $$0.a(cvc.oA)) {
         return d;
      } else if ($$0.a(cvc.oB) || $$0.a(cvc.oC)) {
         return e;
      } else {
         return $$0.a(cvc.nS) ? f : g;
      }
   }

   @Nullable
   public static bjt a(blg $$0) {
      Optional<ht> $$1 = $$0.eI();
      if ($$1.isPresent()) {
         dhi $$2 = $$0.dN().a_($$1.get());
         return a($$2);
      } else {
         return $$0.aZ() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
