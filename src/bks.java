import java.util.Optional;
import javax.annotation.Nullable;

public record bks(String i) {
   public static final bks a = new bks("generic");
   public static final bks b = new bks("ladder");
   public static final bks c = new bks("vines");
   public static final bks d = new bks("weeping_vines");
   public static final bks e = new bks("twisting_vines");
   public static final bks f = new bks("scaffolding");
   public static final bks g = new bks("other_climbable");
   public static final bks h = new bks("water");

   public static bks a(dja $$0) {
      if ($$0.a(cwl.cO) || $$0.a(asb.P)) {
         return b;
      } else if ($$0.a(cwl.ff)) {
         return c;
      } else if ($$0.a(cwl.oz) || $$0.a(cwl.oA)) {
         return d;
      } else if ($$0.a(cwl.oB) || $$0.a(cwl.oC)) {
         return e;
      } else {
         return $$0.a(cwl.nS) ? f : g;
      }
   }

   @Nullable
   public static bks a(bmf $$0) {
      Optional<hx> $$1 = $$0.eH();
      if ($$1.isPresent()) {
         dja $$2 = $$0.dM().a_($$1.get());
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
