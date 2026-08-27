import java.util.Optional;
import javax.annotation.Nullable;

public record bla(String i) {
   public static final bla a = new bla("generic");
   public static final bla b = new bla("ladder");
   public static final bla c = new bla("vines");
   public static final bla d = new bla("weeping_vines");
   public static final bla e = new bla("twisting_vines");
   public static final bla f = new bla("scaffolding");
   public static final bla g = new bla("other_climbable");
   public static final bla h = new bla("water");

   public static bla a(djp $$0) {
      if ($$0.a(cxa.cO) || $$0.a(asi.P)) {
         return b;
      } else if ($$0.a(cxa.ff)) {
         return c;
      } else if ($$0.a(cxa.oz) || $$0.a(cxa.oA)) {
         return d;
      } else if ($$0.a(cxa.oB) || $$0.a(cxa.oC)) {
         return e;
      } else {
         return $$0.a(cxa.nS) ? f : g;
      }
   }

   @Nullable
   public static bla a(bmo $$0) {
      Optional<hx> $$1 = $$0.eH();
      if ($$1.isPresent()) {
         djp $$2 = $$0.dL().a_($$1.get());
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
