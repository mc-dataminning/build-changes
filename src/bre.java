import java.util.Optional;
import javax.annotation.Nullable;

public record bre(String i) {
   public static final bre a = new bre("generic");
   public static final bre b = new bre("ladder");
   public static final bre c = new bre("vines");
   public static final bre d = new bre("weeping_vines");
   public static final bre e = new bre("twisting_vines");
   public static final bre f = new bre("scaffolding");
   public static final bre g = new bre("other_climbable");
   public static final bre h = new bre("water");

   public static bre a(dsk $$0) {
      if ($$0.a(dfj.cO) || $$0.a(avw.P)) {
         return b;
      } else if ($$0.a(dfj.ff)) {
         return c;
      } else if ($$0.a(dfj.oz) || $$0.a(dfj.oA)) {
         return d;
      } else if ($$0.a(dfj.oB) || $$0.a(dfj.oC)) {
         return e;
      } else {
         return $$0.a(dfj.nS) ? f : g;
      }
   }

   @Nullable
   public static bre a(btb $$0) {
      Optional<ja> $$1 = $$0.eJ();
      if ($$1.isPresent()) {
         dsk $$2 = $$0.dQ().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bf() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
