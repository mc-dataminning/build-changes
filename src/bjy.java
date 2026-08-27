import java.util.Optional;
import javax.annotation.Nullable;

public record bjy(String i) {
   public static final bjy a = new bjy("generic");
   public static final bjy b = new bjy("ladder");
   public static final bjy c = new bjy("vines");
   public static final bjy d = new bjy("weeping_vines");
   public static final bjy e = new bjy("twisting_vines");
   public static final bjy f = new bjy("scaffolding");
   public static final bjy g = new bjy("other_climbable");
   public static final bjy h = new bjy("water");

   public static bjy a(dhn $$0) {
      if ($$0.a(cvh.cO) || $$0.a(ark.P)) {
         return b;
      } else if ($$0.a(cvh.ff)) {
         return c;
      } else if ($$0.a(cvh.oz) || $$0.a(cvh.oA)) {
         return d;
      } else if ($$0.a(cvh.oB) || $$0.a(cvh.oC)) {
         return e;
      } else {
         return $$0.a(cvh.nS) ? f : g;
      }
   }

   @Nullable
   public static bjy a(bll $$0) {
      Optional<hx> $$1 = $$0.eI();
      if ($$1.isPresent()) {
         dhn $$2 = $$0.dN().a_($$1.get());
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
