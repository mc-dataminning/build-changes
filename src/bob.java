import java.util.Optional;
import javax.annotation.Nullable;

public record bob(String i) {
   public static final bob a = new bob("generic");
   public static final bob b = new bob("ladder");
   public static final bob c = new bob("vines");
   public static final bob d = new bob("weeping_vines");
   public static final bob e = new bob("twisting_vines");
   public static final bob f = new bob("scaffolding");
   public static final bob g = new bob("other_climbable");
   public static final bob h = new bob("water");

   public static bob a(dnb $$0) {
      if ($$0.a(dae.cO) || $$0.a(aun.P)) {
         return b;
      } else if ($$0.a(dae.ff)) {
         return c;
      } else if ($$0.a(dae.oz) || $$0.a(dae.oA)) {
         return d;
      } else if ($$0.a(dae.oB) || $$0.a(dae.oC)) {
         return e;
      } else {
         return $$0.a(dae.nS) ? f : g;
      }
   }

   @Nullable
   public static bob a(bpp $$0) {
      Optional<ib> $$1 = $$0.eJ();
      if ($$1.isPresent()) {
         dnb $$2 = $$0.dM().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bc() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
