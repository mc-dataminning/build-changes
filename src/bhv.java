import java.util.Optional;
import javax.annotation.Nullable;

public record bhv(String i) {
   public static final bhv a = new bhv("generic");
   public static final bhv b = new bhv("ladder");
   public static final bhv c = new bhv("vines");
   public static final bhv d = new bhv("weeping_vines");
   public static final bhv e = new bhv("twisting_vines");
   public static final bhv f = new bhv("scaffolding");
   public static final bhv g = new bhv("other_climbable");
   public static final bhv h = new bhv("water");

   public static bhv a(dfl $$0) {
      if ($$0.a(csy.cO) || $$0.a(apu.P)) {
         return b;
      } else if ($$0.a(csy.ff)) {
         return c;
      } else if ($$0.a(csy.oz) || $$0.a(csy.oA)) {
         return d;
      } else if ($$0.a(csy.oB) || $$0.a(csy.oC)) {
         return e;
      } else {
         return $$0.a(csy.nS) ? f : g;
      }
   }

   @Nullable
   public static bhv a(bji $$0) {
      Optional<gw> $$1 = $$0.eG();
      if ($$1.isPresent()) {
         dfl $$2 = $$0.dL().a_($$1.get());
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
