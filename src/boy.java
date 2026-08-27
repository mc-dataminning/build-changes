import java.util.Optional;
import javax.annotation.Nullable;

public record boy(String i) {
   public static final boy a = new boy("generic");
   public static final boy b = new boy("ladder");
   public static final boy c = new boy("vines");
   public static final boy d = new boy("weeping_vines");
   public static final boy e = new boy("twisting_vines");
   public static final boy f = new boy("scaffolding");
   public static final boy g = new boy("other_climbable");
   public static final boy h = new boy("water");

   public static boy a(doz $$0) {
      if ($$0.a(dca.cO) || $$0.a(avc.P)) {
         return b;
      } else if ($$0.a(dca.ff)) {
         return c;
      } else if ($$0.a(dca.oz) || $$0.a(dca.oA)) {
         return d;
      } else if ($$0.a(dca.oB) || $$0.a(dca.oC)) {
         return e;
      } else {
         return $$0.a(dca.nS) ? f : g;
      }
   }

   @Nullable
   public static boy a(bqo $$0) {
      Optional<ib> $$1 = $$0.eJ();
      if ($$1.isPresent()) {
         doz $$2 = $$0.dM().a_($$1.get());
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
