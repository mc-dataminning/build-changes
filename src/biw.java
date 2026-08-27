import java.util.Optional;
import javax.annotation.Nullable;

public record biw(String i) {
   public static final biw a = new biw("generic");
   public static final biw b = new biw("ladder");
   public static final biw c = new biw("vines");
   public static final biw d = new biw("weeping_vines");
   public static final biw e = new biw("twisting_vines");
   public static final biw f = new biw("scaffolding");
   public static final biw g = new biw("other_climbable");
   public static final biw h = new biw("water");

   public static biw a(dgb $$0) {
      if ($$0.a(cuc.cO) || $$0.a(aqs.P)) {
         return b;
      } else if ($$0.a(cuc.ff)) {
         return c;
      } else if ($$0.a(cuc.oz) || $$0.a(cuc.oA)) {
         return d;
      } else if ($$0.a(cuc.oB) || $$0.a(cuc.oC)) {
         return e;
      } else {
         return $$0.a(cuc.nS) ? f : g;
      }
   }

   @Nullable
   public static biw a(bkj $$0) {
      Optional<ht> $$1 = $$0.eG();
      if ($$1.isPresent()) {
         dgb $$2 = $$0.dL().a_($$1.get());
         return a($$2);
      } else {
         return $$0.aX() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
