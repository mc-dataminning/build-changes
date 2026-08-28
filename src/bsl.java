import java.util.Optional;
import javax.annotation.Nullable;

public record bsl(String i) {
   public static final bsl a = new bsl("generic");
   public static final bsl b = new bsl("ladder");
   public static final bsl c = new bsl("vines");
   public static final bsl d = new bsl("weeping_vines");
   public static final bsl e = new bsl("twisting_vines");
   public static final bsl f = new bsl("scaffolding");
   public static final bsl g = new bsl("other_climbable");
   public static final bsl h = new bsl("water");

   public static bsl a(duo $$0) {
      if ($$0.a(dhl.cO) || $$0.a(awt.Q)) {
         return b;
      } else if ($$0.a(dhl.ff)) {
         return c;
      } else if ($$0.a(dhl.oz) || $$0.a(dhl.oA)) {
         return d;
      } else if ($$0.a(dhl.oB) || $$0.a(dhl.oC)) {
         return e;
      } else {
         return $$0.a(dhl.nS) ? f : g;
      }
   }

   @Nullable
   public static bsl a(buk $$0) {
      Optional<je> $$1 = $$0.eL();
      if ($$1.isPresent()) {
         duo $$2 = $$0.dS().a_($$1.get());
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
