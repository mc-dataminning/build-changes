import java.util.Optional;
import javax.annotation.Nullable;

public record boa(String i) {
   public static final boa a = new boa("generic");
   public static final boa b = new boa("ladder");
   public static final boa c = new boa("vines");
   public static final boa d = new boa("weeping_vines");
   public static final boa e = new boa("twisting_vines");
   public static final boa f = new boa("scaffolding");
   public static final boa g = new boa("other_climbable");
   public static final boa h = new boa("water");

   public static boa a(dmz $$0) {
      if ($$0.a(dac.cO) || $$0.a(aun.P)) {
         return b;
      } else if ($$0.a(dac.ff)) {
         return c;
      } else if ($$0.a(dac.oz) || $$0.a(dac.oA)) {
         return d;
      } else if ($$0.a(dac.oB) || $$0.a(dac.oC)) {
         return e;
      } else {
         return $$0.a(dac.nS) ? f : g;
      }
   }

   @Nullable
   public static boa a(bpo $$0) {
      Optional<ib> $$1 = $$0.eJ();
      if ($$1.isPresent()) {
         dmz $$2 = $$0.dM().a_($$1.get());
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
