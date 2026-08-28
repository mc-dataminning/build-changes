import java.util.Optional;
import javax.annotation.Nullable;

public record buf(String i) {
   public static final buf a = new buf("generic");
   public static final buf b = new buf("ladder");
   public static final buf c = new buf("vines");
   public static final buf d = new buf("weeping_vines");
   public static final buf e = new buf("twisting_vines");
   public static final buf f = new buf("scaffolding");
   public static final buf g = new buf("other_climbable");
   public static final buf h = new buf("water");

   public static buf a(dxv $$0) {
      if ($$0.a(dko.cX) || $$0.a(axu.R)) {
         return b;
      } else if ($$0.a(dko.ft)) {
         return c;
      } else if ($$0.a(dko.oU) || $$0.a(dko.oV)) {
         return d;
      } else if ($$0.a(dko.oW) || $$0.a(dko.oX)) {
         return e;
      } else {
         return $$0.a(dko.on) ? f : g;
      }
   }

   @Nullable
   public static buf a(bwg $$0) {
      Optional<jh> $$1 = $$0.eN();
      if ($$1.isPresent()) {
         dxv $$2 = $$0.dW().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bj() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
