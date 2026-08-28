import java.util.Optional;
import javax.annotation.Nullable;

public record btu(String i) {
   public static final btu a = new btu("generic");
   public static final btu b = new btu("ladder");
   public static final btu c = new btu("vines");
   public static final btu d = new btu("weeping_vines");
   public static final btu e = new btu("twisting_vines");
   public static final btu f = new btu("scaffolding");
   public static final btu g = new btu("other_climbable");
   public static final btu h = new btu("water");

   public static btu a(dxq $$0) {
      if ($$0.a(dkg.cX) || $$0.a(awp.R)) {
         return b;
      } else if ($$0.a(dkg.ft)) {
         return c;
      } else if ($$0.a(dkg.pb) || $$0.a(dkg.pc)) {
         return d;
      } else if ($$0.a(dkg.pd) || $$0.a(dkg.pe)) {
         return e;
      } else {
         return $$0.a(dkg.ou) ? f : g;
      }
   }

   @Nullable
   public static btu a(bvy $$0) {
      Optional<ji> $$1 = $$0.eN();
      if ($$1.isPresent()) {
         dxq $$2 = $$0.dU().a_($$1.get());
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
