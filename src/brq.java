import java.util.Optional;
import javax.annotation.Nullable;

public record brq(String i) {
   public static final brq a = new brq("generic");
   public static final brq b = new brq("ladder");
   public static final brq c = new brq("vines");
   public static final brq d = new brq("weeping_vines");
   public static final brq e = new brq("twisting_vines");
   public static final brq f = new brq("scaffolding");
   public static final brq g = new brq("other_climbable");
   public static final brq h = new brq("water");

   public static brq a(dsa $$0) {
      if ($$0.a(dez.cO) || $$0.a(awo.P)) {
         return b;
      } else if ($$0.a(dez.ff)) {
         return c;
      } else if ($$0.a(dez.oz) || $$0.a(dez.oA)) {
         return d;
      } else if ($$0.a(dez.oB) || $$0.a(dez.oC)) {
         return e;
      } else {
         return $$0.a(dez.nS) ? f : g;
      }
   }

   @Nullable
   public static brq a(btn $$0) {
      Optional<iz> $$1 = $$0.eM();
      if ($$1.isPresent()) {
         dsa $$2 = $$0.dP().a_($$1.get());
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
