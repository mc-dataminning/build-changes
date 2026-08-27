import java.util.Optional;
import javax.annotation.Nullable;

public record bkx(String i) {
   public static final bkx a = new bkx("generic");
   public static final bkx b = new bkx("ladder");
   public static final bkx c = new bkx("vines");
   public static final bkx d = new bkx("weeping_vines");
   public static final bkx e = new bkx("twisting_vines");
   public static final bkx f = new bkx("scaffolding");
   public static final bkx g = new bkx("other_climbable");
   public static final bkx h = new bkx("water");

   public static bkx a(djg $$0) {
      if ($$0.a(cwr.cO) || $$0.a(asg.P)) {
         return b;
      } else if ($$0.a(cwr.ff)) {
         return c;
      } else if ($$0.a(cwr.oz) || $$0.a(cwr.oA)) {
         return d;
      } else if ($$0.a(cwr.oB) || $$0.a(cwr.oC)) {
         return e;
      } else {
         return $$0.a(cwr.nS) ? f : g;
      }
   }

   @Nullable
   public static bkx a(bmk $$0) {
      Optional<hx> $$1 = $$0.eH();
      if ($$1.isPresent()) {
         djg $$2 = $$0.dM().a_($$1.get());
         return a($$2);
      } else {
         return $$0.aZ() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
