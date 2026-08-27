import java.util.Optional;
import javax.annotation.Nullable;

public record bpo(String i) {
   public static final bpo a = new bpo("generic");
   public static final bpo b = new bpo("ladder");
   public static final bpo c = new bpo("vines");
   public static final bpo d = new bpo("weeping_vines");
   public static final bpo e = new bpo("twisting_vines");
   public static final bpo f = new bpo("scaffolding");
   public static final bpo g = new bpo("other_climbable");
   public static final bpo h = new bpo("water");

   public static bpo a(dpy $$0) {
      if ($$0.a(dcx.cO) || $$0.a(avo.P)) {
         return b;
      } else if ($$0.a(dcx.ff)) {
         return c;
      } else if ($$0.a(dcx.oz) || $$0.a(dcx.oA)) {
         return d;
      } else if ($$0.a(dcx.oB) || $$0.a(dcx.oC)) {
         return e;
      } else {
         return $$0.a(dcx.nS) ? f : g;
      }
   }

   @Nullable
   public static bpo a(bre $$0) {
      Optional<im> $$1 = $$0.eK();
      if ($$1.isPresent()) {
         dpy $$2 = $$0.dN().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bc() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
