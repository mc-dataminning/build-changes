import java.util.Optional;
import javax.annotation.Nullable;

public record bho(String i) {
   public static final bho a = new bho("generic");
   public static final bho b = new bho("ladder");
   public static final bho c = new bho("vines");
   public static final bho d = new bho("weeping_vines");
   public static final bho e = new bho("twisting_vines");
   public static final bho f = new bho("scaffolding");
   public static final bho g = new bho("other_climbable");
   public static final bho h = new bho("water");

   public static bho a(dfe $$0) {
      if ($$0.a(csr.cO) || $$0.a(apo.P)) {
         return b;
      } else if ($$0.a(csr.ff)) {
         return c;
      } else if ($$0.a(csr.oz) || $$0.a(csr.oA)) {
         return d;
      } else if ($$0.a(csr.oB) || $$0.a(csr.oC)) {
         return e;
      } else {
         return $$0.a(csr.nS) ? f : g;
      }
   }

   @Nullable
   public static bho a(bjb $$0) {
      Optional<gw> $$1 = $$0.eF();
      if ($$1.isPresent()) {
         dfe $$2 = $$0.dK().a_($$1.get());
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
