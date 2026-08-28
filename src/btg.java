import java.util.Optional;
import javax.annotation.Nullable;

public record btg(String i) {
   public static final btg a = new btg("generic");
   public static final btg b = new btg("ladder");
   public static final btg c = new btg("vines");
   public static final btg d = new btg("weeping_vines");
   public static final btg e = new btg("twisting_vines");
   public static final btg f = new btg("scaffolding");
   public static final btg g = new btg("other_climbable");
   public static final btg h = new btg("water");

   public static btg a(dwx $$0) {
      if ($$0.a(djo.cX) || $$0.a(awp.R)) {
         return b;
      } else if ($$0.a(djo.ft)) {
         return c;
      } else if ($$0.a(djo.pb) || $$0.a(djo.pc)) {
         return d;
      } else if ($$0.a(djo.pd) || $$0.a(djo.pe)) {
         return e;
      } else {
         return $$0.a(djo.ou) ? f : g;
      }
   }

   @Nullable
   public static btg a(bvh $$0) {
      Optional<ji> $$1 = $$0.eN();
      if ($$1.isPresent()) {
         dwx $$2 = $$0.dV().a_($$1.get());
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
