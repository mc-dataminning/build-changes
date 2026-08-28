import java.util.Optional;
import javax.annotation.Nullable;

public record bum(String i) {
   public static final bum a = new bum("generic");
   public static final bum b = new bum("ladder");
   public static final bum c = new bum("vines");
   public static final bum d = new bum("weeping_vines");
   public static final bum e = new bum("twisting_vines");
   public static final bum f = new bum("scaffolding");
   public static final bum g = new bum("other_climbable");
   public static final bum h = new bum("water");

   public static bum a(dym $$0) {
      if ($$0.a(dkw.cX) || $$0.a(awz.R)) {
         return b;
      } else if ($$0.a(dkw.ft)) {
         return c;
      } else if ($$0.a(dkw.pb) || $$0.a(dkw.pc)) {
         return d;
      } else if ($$0.a(dkw.pd) || $$0.a(dkw.pe)) {
         return e;
      } else {
         return $$0.a(dkw.ou) ? f : g;
      }
   }

   @Nullable
   public static bum a(bwr $$0) {
      Optional<jj> $$1 = $$0.eO();
      if ($$1.isPresent()) {
         dym $$2 = $$0.dV().a_($$1.get());
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
