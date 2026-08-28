import java.util.Optional;
import javax.annotation.Nullable;

public record brn(String i) {
   public static final brn a = new brn("generic");
   public static final brn b = new brn("ladder");
   public static final brn c = new brn("vines");
   public static final brn d = new brn("weeping_vines");
   public static final brn e = new brn("twisting_vines");
   public static final brn f = new brn("scaffolding");
   public static final brn g = new brn("other_climbable");
   public static final brn h = new brn("water");

   public static brn a(drx $$0) {
      if ($$0.a(dew.cO) || $$0.a(awl.P)) {
         return b;
      } else if ($$0.a(dew.ff)) {
         return c;
      } else if ($$0.a(dew.oz) || $$0.a(dew.oA)) {
         return d;
      } else if ($$0.a(dew.oB) || $$0.a(dew.oC)) {
         return e;
      } else {
         return $$0.a(dew.nS) ? f : g;
      }
   }

   @Nullable
   public static brn a(btk $$0) {
      Optional<iz> $$1 = $$0.eM();
      if ($$1.isPresent()) {
         drx $$2 = $$0.dP().a_($$1.get());
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
