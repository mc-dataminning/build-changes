import java.util.Optional;
import javax.annotation.Nullable;

public record bqy(String i) {
   public static final bqy a = new bqy("generic");
   public static final bqy b = new bqy("ladder");
   public static final bqy c = new bqy("vines");
   public static final bqy d = new bqy("weeping_vines");
   public static final bqy e = new bqy("twisting_vines");
   public static final bqy f = new bqy("scaffolding");
   public static final bqy g = new bqy("other_climbable");
   public static final bqy h = new bqy("water");

   public static bqy a(dtc $$0) {
      if ($$0.a(dfe.dA) || $$0.a(awe.P)) {
         return b;
      } else if ($$0.a(dfe.fX)) {
         return c;
      } else if ($$0.a(dfe.pz) || $$0.a(dfe.pA)) {
         return d;
      } else if ($$0.a(dfe.pB) || $$0.a(dfe.pC)) {
         return e;
      } else {
         return $$0.a(dfe.oQ) ? f : g;
      }
   }

   @Nullable
   public static bqy a(bso $$0) {
      Optional<ir> $$1 = $$0.eU();
      if ($$1.isPresent()) {
         dtc $$2 = $$0.dU().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bi() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
