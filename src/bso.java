import java.util.Optional;
import javax.annotation.Nullable;

public record bso(String i) {
   public static final bso a = new bso("generic");
   public static final bso b = new bso("ladder");
   public static final bso c = new bso("vines");
   public static final bso d = new bso("weeping_vines");
   public static final bso e = new bso("twisting_vines");
   public static final bso f = new bso("scaffolding");
   public static final bso g = new bso("other_climbable");
   public static final bso h = new bso("water");

   public static bso a(dus $$0) {
      if ($$0.a(dho.cO) || $$0.a(awv.Q)) {
         return b;
      } else if ($$0.a(dho.ff)) {
         return c;
      } else if ($$0.a(dho.oz) || $$0.a(dho.oA)) {
         return d;
      } else if ($$0.a(dho.oB) || $$0.a(dho.oC)) {
         return e;
      } else {
         return $$0.a(dho.nS) ? f : g;
      }
   }

   @Nullable
   public static bso a(bun $$0) {
      Optional<jf> $$1 = $$0.eL();
      if ($$1.isPresent()) {
         dus $$2 = $$0.dS().a_($$1.get());
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
