import java.util.Optional;
import javax.annotation.Nullable;

public record brb(String i) {
   public static final brb a = new brb("generic");
   public static final brb b = new brb("ladder");
   public static final brb c = new brb("vines");
   public static final brb d = new brb("weeping_vines");
   public static final brb e = new brb("twisting_vines");
   public static final brb f = new brb("scaffolding");
   public static final brb g = new brb("other_climbable");
   public static final brb h = new brb("water");

   public static brb a(dsh $$0) {
      if ($$0.a(dfh.cO) || $$0.a(avu.P)) {
         return b;
      } else if ($$0.a(dfh.ff)) {
         return c;
      } else if ($$0.a(dfh.oz) || $$0.a(dfh.oA)) {
         return d;
      } else if ($$0.a(dfh.oB) || $$0.a(dfh.oC)) {
         return e;
      } else {
         return $$0.a(dfh.nS) ? f : g;
      }
   }

   @Nullable
   public static brb a(bsy $$0) {
      Optional<ja> $$1 = $$0.eI();
      if ($$1.isPresent()) {
         dsh $$2 = $$0.dP().a_($$1.get());
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
