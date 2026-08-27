import java.util.Optional;
import javax.annotation.Nullable;

public record bki(String i) {
   public static final bki a = new bki("generic");
   public static final bki b = new bki("ladder");
   public static final bki c = new bki("vines");
   public static final bki d = new bki("weeping_vines");
   public static final bki e = new bki("twisting_vines");
   public static final bki f = new bki("scaffolding");
   public static final bki g = new bki("other_climbable");
   public static final bki h = new bki("water");

   public static bki a(dip $$0) {
      if ($$0.a(cwb.cO) || $$0.a(arr.P)) {
         return b;
      } else if ($$0.a(cwb.ff)) {
         return c;
      } else if ($$0.a(cwb.oz) || $$0.a(cwb.oA)) {
         return d;
      } else if ($$0.a(cwb.oB) || $$0.a(cwb.oC)) {
         return e;
      } else {
         return $$0.a(cwb.nS) ? f : g;
      }
   }

   @Nullable
   public static bki a(blv $$0) {
      Optional<hv> $$1 = $$0.eH();
      if ($$1.isPresent()) {
         dip $$2 = $$0.dM().a_($$1.get());
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
