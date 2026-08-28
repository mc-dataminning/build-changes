import java.util.Optional;
import javax.annotation.Nullable;

public record bux(String i) {
   public static final bux a = new bux("generic");
   public static final bux b = new bux("ladder");
   public static final bux c = new bux("vines");
   public static final bux d = new bux("weeping_vines");
   public static final bux e = new bux("twisting_vines");
   public static final bux f = new bux("scaffolding");
   public static final bux g = new bux("other_climbable");
   public static final bux h = new bux("water");

   public static bux a(dzz $$0) {
      if ($$0.a(dmc.cY) || $$0.a(axc.R)) {
         return b;
      } else if ($$0.a(dmc.fu)) {
         return c;
      } else if ($$0.a(dmc.pc) || $$0.a(dmc.pd)) {
         return d;
      } else if ($$0.a(dmc.pe) || $$0.a(dmc.pf)) {
         return e;
      } else {
         return $$0.a(dmc.ov) ? f : g;
      }
   }

   @Nullable
   public static bux a(bxc $$0) {
      Optional<iu> $$1 = $$0.eO();
      if ($$1.isPresent()) {
         dzz $$2 = $$0.dV().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bj() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
