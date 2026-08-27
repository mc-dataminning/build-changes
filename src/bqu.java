import java.util.Optional;
import javax.annotation.Nullable;

public record bqu(String i) {
   public static final bqu a = new bqu("generic");
   public static final bqu b = new bqu("ladder");
   public static final bqu c = new bqu("vines");
   public static final bqu d = new bqu("weeping_vines");
   public static final bqu e = new bqu("twisting_vines");
   public static final bqu f = new bqu("scaffolding");
   public static final bqu g = new bqu("other_climbable");
   public static final bqu h = new bqu("water");

   public static bqu a(drd $$0) {
      if ($$0.a(dec.cO) || $$0.a(avx.P)) {
         return b;
      } else if ($$0.a(dec.ff)) {
         return c;
      } else if ($$0.a(dec.oz) || $$0.a(dec.oA)) {
         return d;
      } else if ($$0.a(dec.oB) || $$0.a(dec.oC)) {
         return e;
      } else {
         return $$0.a(dec.nS) ? f : g;
      }
   }

   @Nullable
   public static bqu a(bsq $$0) {
      Optional<io> $$1 = $$0.eM();
      if ($$1.isPresent()) {
         drd $$2 = $$0.dP().a_($$1.get());
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
