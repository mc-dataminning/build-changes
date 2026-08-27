import java.util.Optional;
import javax.annotation.Nullable;

public record bky(String i) {
   public static final bky a = new bky("generic");
   public static final bky b = new bky("ladder");
   public static final bky c = new bky("vines");
   public static final bky d = new bky("weeping_vines");
   public static final bky e = new bky("twisting_vines");
   public static final bky f = new bky("scaffolding");
   public static final bky g = new bky("other_climbable");
   public static final bky h = new bky("water");

   public static bky a(djh $$0) {
      if ($$0.a(cws.cO) || $$0.a(ash.P)) {
         return b;
      } else if ($$0.a(cws.ff)) {
         return c;
      } else if ($$0.a(cws.oz) || $$0.a(cws.oA)) {
         return d;
      } else if ($$0.a(cws.oB) || $$0.a(cws.oC)) {
         return e;
      } else {
         return $$0.a(cws.nS) ? f : g;
      }
   }

   @Nullable
   public static bky a(bml $$0) {
      Optional<hx> $$1 = $$0.eH();
      if ($$1.isPresent()) {
         djh $$2 = $$0.dM().a_($$1.get());
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
