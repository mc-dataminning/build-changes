import java.util.Optional;
import javax.annotation.Nullable;

public record bht(String i) {
   public static final bht a = new bht("generic");
   public static final bht b = new bht("ladder");
   public static final bht c = new bht("vines");
   public static final bht d = new bht("weeping_vines");
   public static final bht e = new bht("twisting_vines");
   public static final bht f = new bht("scaffolding");
   public static final bht g = new bht("other_climbable");
   public static final bht h = new bht("water");

   public static bht a(dfj $$0) {
      if ($$0.a(csw.cO) || $$0.a(apt.P)) {
         return b;
      } else if ($$0.a(csw.ff)) {
         return c;
      } else if ($$0.a(csw.oz) || $$0.a(csw.oA)) {
         return d;
      } else if ($$0.a(csw.oB) || $$0.a(csw.oC)) {
         return e;
      } else {
         return $$0.a(csw.nS) ? f : g;
      }
   }

   @Nullable
   public static bht a(bjg $$0) {
      Optional<gw> $$1 = $$0.eG();
      if ($$1.isPresent()) {
         dfj $$2 = $$0.dL().a_($$1.get());
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
