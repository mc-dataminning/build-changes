import java.util.Optional;
import javax.annotation.Nullable;

public record brs(String i) {
   public static final brs a = new brs("generic");
   public static final brs b = new brs("ladder");
   public static final brs c = new brs("vines");
   public static final brs d = new brs("weeping_vines");
   public static final brs e = new brs("twisting_vines");
   public static final brs f = new brs("scaffolding");
   public static final brs g = new brs("other_climbable");
   public static final brs h = new brs("water");

   public static brs a(dsc $$0) {
      if ($$0.a(dfb.cO) || $$0.a(awp.P)) {
         return b;
      } else if ($$0.a(dfb.ff)) {
         return c;
      } else if ($$0.a(dfb.oz) || $$0.a(dfb.oA)) {
         return d;
      } else if ($$0.a(dfb.oB) || $$0.a(dfb.oC)) {
         return e;
      } else {
         return $$0.a(dfb.nS) ? f : g;
      }
   }

   @Nullable
   public static brs a(btp $$0) {
      Optional<iz> $$1 = $$0.eM();
      if ($$1.isPresent()) {
         dsc $$2 = $$0.dP().a_($$1.get());
         return a($$2);
      } else {
         return $$0.be() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
