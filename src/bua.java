import java.util.Optional;
import javax.annotation.Nullable;

public record bua(String i) {
   public static final bua a = new bua("generic");
   public static final bua b = new bua("ladder");
   public static final bua c = new bua("vines");
   public static final bua d = new bua("weeping_vines");
   public static final bua e = new bua("twisting_vines");
   public static final bua f = new bua("scaffolding");
   public static final bua g = new bua("other_climbable");
   public static final bua h = new bua("water");

   public static bua a(dxn $$0) {
      if ($$0.a(dkg.cX) || $$0.a(axu.R)) {
         return b;
      } else if ($$0.a(dkg.ft)) {
         return c;
      } else if ($$0.a(dkg.oU) || $$0.a(dkg.oV)) {
         return d;
      } else if ($$0.a(dkg.oW) || $$0.a(dkg.oX)) {
         return e;
      } else {
         return $$0.a(dkg.on) ? f : g;
      }
   }

   @Nullable
   public static bua a(bwb $$0) {
      Optional<jh> $$1 = $$0.eM();
      if ($$1.isPresent()) {
         dxn $$2 = $$0.dV().a_($$1.get());
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
