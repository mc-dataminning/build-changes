import java.util.Optional;
import javax.annotation.Nullable;

public record bmu(String i) {
   public static final bmu a = new bmu("generic");
   public static final bmu b = new bmu("ladder");
   public static final bmu c = new bmu("vines");
   public static final bmu d = new bmu("weeping_vines");
   public static final bmu e = new bmu("twisting_vines");
   public static final bmu f = new bmu("scaffolding");
   public static final bmu g = new bmu("other_climbable");
   public static final bmu h = new bmu("water");

   public static bmu a(dlj $$0) {
      if ($$0.a(cyu.cO) || $$0.a(aua.P)) {
         return b;
      } else if ($$0.a(cyu.ff)) {
         return c;
      } else if ($$0.a(cyu.oz) || $$0.a(cyu.oA)) {
         return d;
      } else if ($$0.a(cyu.oB) || $$0.a(cyu.oC)) {
         return e;
      } else {
         return $$0.a(cyu.nS) ? f : g;
      }
   }

   @Nullable
   public static bmu a(boi $$0) {
      Optional<hz> $$1 = $$0.eI();
      if ($$1.isPresent()) {
         dlj $$2 = $$0.dM().a_($$1.get());
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
