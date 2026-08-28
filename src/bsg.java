import java.util.Optional;
import javax.annotation.Nullable;

public record bsg(String i) {
   public static final bsg a = new bsg("generic");
   public static final bsg b = new bsg("ladder");
   public static final bsg c = new bsg("vines");
   public static final bsg d = new bsg("weeping_vines");
   public static final bsg e = new bsg("twisting_vines");
   public static final bsg f = new bsg("scaffolding");
   public static final bsg g = new bsg("other_climbable");
   public static final bsg h = new bsg("water");

   public static bsg a(dua $$0) {
      if ($$0.a(dgx.cO) || $$0.a(aws.Q)) {
         return b;
      } else if ($$0.a(dgx.ff)) {
         return c;
      } else if ($$0.a(dgx.oz) || $$0.a(dgx.oA)) {
         return d;
      } else if ($$0.a(dgx.oB) || $$0.a(dgx.oC)) {
         return e;
      } else {
         return $$0.a(dgx.nS) ? f : g;
      }
   }

   @Nullable
   public static bsg a(buf $$0) {
      Optional<je> $$1 = $$0.eL();
      if ($$1.isPresent()) {
         dua $$2 = $$0.dS().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bi() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
