import java.util.Optional;
import javax.annotation.Nullable;

public record bsu(String i) {
   public static final bsu a = new bsu("generic");
   public static final bsu b = new bsu("ladder");
   public static final bsu c = new bsu("vines");
   public static final bsu d = new bsu("weeping_vines");
   public static final bsu e = new bsu("twisting_vines");
   public static final bsu f = new bsu("scaffolding");
   public static final bsu g = new bsu("other_climbable");
   public static final bsu h = new bsu("water");

   public static bsu a(dvd $$0) {
      if ($$0.a(dia.cO) || $$0.a(awz.Q)) {
         return b;
      } else if ($$0.a(dia.ff)) {
         return c;
      } else if ($$0.a(dia.oz) || $$0.a(dia.oA)) {
         return d;
      } else if ($$0.a(dia.oB) || $$0.a(dia.oC)) {
         return e;
      } else {
         return $$0.a(dia.nS) ? f : g;
      }
   }

   @Nullable
   public static bsu a(buv $$0) {
      Optional<jg> $$1 = $$0.eQ();
      if ($$1.isPresent()) {
         dvd $$2 = $$0.dX().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bk() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
