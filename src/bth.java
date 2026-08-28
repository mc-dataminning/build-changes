import java.util.Optional;
import javax.annotation.Nullable;

public record bth(String i) {
   public static final bth a = new bth("generic");
   public static final bth b = new bth("ladder");
   public static final bth c = new bth("vines");
   public static final bth d = new bth("weeping_vines");
   public static final bth e = new bth("twisting_vines");
   public static final bth f = new bth("scaffolding");
   public static final bth g = new bth("other_climbable");
   public static final bth h = new bth("water");

   public static bth a(dwy $$0) {
      if ($$0.a(djp.cX) || $$0.a(awp.R)) {
         return b;
      } else if ($$0.a(djp.ft)) {
         return c;
      } else if ($$0.a(djp.pb) || $$0.a(djp.pc)) {
         return d;
      } else if ($$0.a(djp.pd) || $$0.a(djp.pe)) {
         return e;
      } else {
         return $$0.a(djp.ou) ? f : g;
      }
   }

   @Nullable
   public static bth a(bvi $$0) {
      Optional<ji> $$1 = $$0.eN();
      if ($$1.isPresent()) {
         dwy $$2 = $$0.dV().a_($$1.get());
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
