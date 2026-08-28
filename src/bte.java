import java.util.Optional;
import javax.annotation.Nullable;

public record bte(String i) {
   public static final bte a = new bte("generic");
   public static final bte b = new bte("ladder");
   public static final bte c = new bte("vines");
   public static final bte d = new bte("weeping_vines");
   public static final bte e = new bte("twisting_vines");
   public static final bte f = new bte("scaffolding");
   public static final bte g = new bte("other_climbable");
   public static final bte h = new bte("water");

   public static bte a(dwv $$0) {
      if ($$0.a(djm.cX) || $$0.a(awo.R)) {
         return b;
      } else if ($$0.a(djm.ft)) {
         return c;
      } else if ($$0.a(djm.pb) || $$0.a(djm.pc)) {
         return d;
      } else if ($$0.a(djm.pd) || $$0.a(djm.pe)) {
         return e;
      } else {
         return $$0.a(djm.ou) ? f : g;
      }
   }

   @Nullable
   public static bte a(bvf $$0) {
      Optional<ji> $$1 = $$0.eN();
      if ($$1.isPresent()) {
         dwv $$2 = $$0.dW().a_($$1.get());
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
