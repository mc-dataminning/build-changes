import java.util.Optional;
import javax.annotation.Nullable;

public record bru(String i) {
   public static final bru a = new bru("generic");
   public static final bru b = new bru("ladder");
   public static final bru c = new bru("vines");
   public static final bru d = new bru("weeping_vines");
   public static final bru e = new bru("twisting_vines");
   public static final bru f = new bru("scaffolding");
   public static final bru g = new bru("other_climbable");
   public static final bru h = new bru("water");

   public static bru a(dse $$0) {
      if ($$0.a(dfd.cO) || $$0.a(awp.P)) {
         return b;
      } else if ($$0.a(dfd.ff)) {
         return c;
      } else if ($$0.a(dfd.oz) || $$0.a(dfd.oA)) {
         return d;
      } else if ($$0.a(dfd.oB) || $$0.a(dfd.oC)) {
         return e;
      } else {
         return $$0.a(dfd.nS) ? f : g;
      }
   }

   @Nullable
   public static bru a(btr $$0) {
      Optional<iz> $$1 = $$0.eM();
      if ($$1.isPresent()) {
         dse $$2 = $$0.dP().a_($$1.get());
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
