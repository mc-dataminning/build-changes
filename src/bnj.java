import java.util.Optional;
import javax.annotation.Nullable;

public record bnj(String i) {
   public static final bnj a = new bnj("generic");
   public static final bnj b = new bnj("ladder");
   public static final bnj c = new bnj("vines");
   public static final bnj d = new bnj("weeping_vines");
   public static final bnj e = new bnj("twisting_vines");
   public static final bnj f = new bnj("scaffolding");
   public static final bnj g = new bnj("other_climbable");
   public static final bnj h = new bnj("water");

   public static bnj a(dme $$0) {
      if ($$0.a(czh.cO) || $$0.a(aue.P)) {
         return b;
      } else if ($$0.a(czh.ff)) {
         return c;
      } else if ($$0.a(czh.oz) || $$0.a(czh.oA)) {
         return d;
      } else if ($$0.a(czh.oB) || $$0.a(czh.oC)) {
         return e;
      } else {
         return $$0.a(czh.nS) ? f : g;
      }
   }

   @Nullable
   public static bnj a(box $$0) {
      Optional<ib> $$1 = $$0.eG();
      if ($$1.isPresent()) {
         dme $$2 = $$0.dJ().a_($$1.get());
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
