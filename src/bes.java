import java.util.Optional;
import javax.annotation.Nullable;

public record bes(String i) {
   public static final bes a = new bes("generic");
   public static final bes b = new bes("ladder");
   public static final bes c = new bes("vines");
   public static final bes d = new bes("weeping_vines");
   public static final bes e = new bes("twisting_vines");
   public static final bes f = new bes("scaffolding");
   public static final bes g = new bes("other_climbable");
   public static final bes h = new bes("water");

   public static bes a(dcb $$0) {
      if ($$0.a(cpo.cO) || $$0.a(amw.P)) {
         return b;
      } else if ($$0.a(cpo.ff)) {
         return c;
      } else if ($$0.a(cpo.oz) || $$0.a(cpo.oA)) {
         return d;
      } else if ($$0.a(cpo.oB) || $$0.a(cpo.oC)) {
         return e;
      } else {
         return $$0.a(cpo.nS) ? f : g;
      }
   }

   @Nullable
   public static bes a(bfz $$0) {
      Optional<gu> $$1 = $$0.eD();
      if ($$1.isPresent()) {
         dcb $$2 = $$0.dI().a_($$1.get());
         return a($$2);
      } else {
         return $$0.aV() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
