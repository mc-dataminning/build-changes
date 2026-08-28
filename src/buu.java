import java.util.Optional;
import javax.annotation.Nullable;

public record buu(String i) {
   public static final buu a = new buu("generic");
   public static final buu b = new buu("ladder");
   public static final buu c = new buu("vines");
   public static final buu d = new buu("weeping_vines");
   public static final buu e = new buu("twisting_vines");
   public static final buu f = new buu("scaffolding");
   public static final buu g = new buu("other_climbable");
   public static final buu h = new buu("water");

   public static buu a(dzo $$0) {
      if ($$0.a(dlw.cX) || $$0.a(axa.R)) {
         return b;
      } else if ($$0.a(dlw.ft)) {
         return c;
      } else if ($$0.a(dlw.pb) || $$0.a(dlw.pc)) {
         return d;
      } else if ($$0.a(dlw.pd) || $$0.a(dlw.pe)) {
         return e;
      } else {
         return $$0.a(dlw.ou) ? f : g;
      }
   }

   @Nullable
   public static buu a(bwz $$0) {
      Optional<iu> $$1 = $$0.eO();
      if ($$1.isPresent()) {
         dzo $$2 = $$0.dV().a_($$1.get());
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
