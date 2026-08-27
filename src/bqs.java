import java.util.Optional;
import javax.annotation.Nullable;

public record bqs(String i) {
   public static final bqs a = new bqs("generic");
   public static final bqs b = new bqs("ladder");
   public static final bqs c = new bqs("vines");
   public static final bqs d = new bqs("weeping_vines");
   public static final bqs e = new bqs("twisting_vines");
   public static final bqs f = new bqs("scaffolding");
   public static final bqs g = new bqs("other_climbable");
   public static final bqs h = new bqs("water");

   public static bqs a(drb $$0) {
      if ($$0.a(dea.cO) || $$0.a(avw.P)) {
         return b;
      } else if ($$0.a(dea.ff)) {
         return c;
      } else if ($$0.a(dea.oz) || $$0.a(dea.oA)) {
         return d;
      } else if ($$0.a(dea.oB) || $$0.a(dea.oC)) {
         return e;
      } else {
         return $$0.a(dea.nS) ? f : g;
      }
   }

   @Nullable
   public static bqs a(bso $$0) {
      Optional<io> $$1 = $$0.eM();
      if ($$1.isPresent()) {
         drb $$2 = $$0.dP().a_($$1.get());
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
