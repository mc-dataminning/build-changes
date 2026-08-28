import java.util.Optional;
import javax.annotation.Nullable;

public record brp(String i) {
   public static final brp a = new brp("generic");
   public static final brp b = new brp("ladder");
   public static final brp c = new brp("vines");
   public static final brp d = new brp("weeping_vines");
   public static final brp e = new brp("twisting_vines");
   public static final brp f = new brp("scaffolding");
   public static final brp g = new brp("other_climbable");
   public static final brp h = new brp("water");

   public static brp a(dtc $$0) {
      if ($$0.a(dga.cO) || $$0.a(awe.P)) {
         return b;
      } else if ($$0.a(dga.ff)) {
         return c;
      } else if ($$0.a(dga.oz) || $$0.a(dga.oA)) {
         return d;
      } else if ($$0.a(dga.oB) || $$0.a(dga.oC)) {
         return e;
      } else {
         return $$0.a(dga.nS) ? f : g;
      }
   }

   @Nullable
   public static brp a(btn $$0) {
      Optional<jd> $$1 = $$0.eJ();
      if ($$1.isPresent()) {
         dtc $$2 = $$0.dP().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bf() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
