import java.util.Optional;
import javax.annotation.Nullable;

public record btw(String i) {
   public static final btw a = new btw("generic");
   public static final btw b = new btw("ladder");
   public static final btw c = new btw("vines");
   public static final btw d = new btw("weeping_vines");
   public static final btw e = new btw("twisting_vines");
   public static final btw f = new btw("scaffolding");
   public static final btw g = new btw("other_climbable");
   public static final btw h = new btw("water");

   public static btw a(dxo $$0) {
      if ($$0.a(dkf.cX) || $$0.a(axk.R)) {
         return b;
      } else if ($$0.a(dkf.ft)) {
         return c;
      } else if ($$0.a(dkf.pb) || $$0.a(dkf.pc)) {
         return d;
      } else if ($$0.a(dkf.pd) || $$0.a(dkf.pe)) {
         return e;
      } else {
         return $$0.a(dkf.ou) ? f : g;
      }
   }

   @Nullable
   public static btw a(bvx $$0) {
      Optional<jh> $$1 = $$0.eN();
      if ($$1.isPresent()) {
         dxo $$2 = $$0.dW().a_($$1.get());
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
