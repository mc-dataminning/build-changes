import java.util.Optional;
import javax.annotation.Nullable;

public record btf(String i) {
   public static final btf a = new btf("generic");
   public static final btf b = new btf("ladder");
   public static final btf c = new btf("vines");
   public static final btf d = new btf("weeping_vines");
   public static final btf e = new btf("twisting_vines");
   public static final btf f = new btf("scaffolding");
   public static final btf g = new btf("other_climbable");
   public static final btf h = new btf("water");

   public static btf a(dwx $$0) {
      if ($$0.a(djo.cX) || $$0.a(awp.R)) {
         return b;
      } else if ($$0.a(djo.ft)) {
         return c;
      } else if ($$0.a(djo.pb) || $$0.a(djo.pc)) {
         return d;
      } else if ($$0.a(djo.pd) || $$0.a(djo.pe)) {
         return e;
      } else {
         return $$0.a(djo.ou) ? f : g;
      }
   }

   @Nullable
   public static btf a(bvg $$0) {
      Optional<ji> $$1 = $$0.eN();
      if ($$1.isPresent()) {
         dwx $$2 = $$0.dW().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bj() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
