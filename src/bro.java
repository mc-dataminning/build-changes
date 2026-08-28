import java.util.Optional;
import javax.annotation.Nullable;

public record bro(String i) {
   public static final bro a = new bro("generic");
   public static final bro b = new bro("ladder");
   public static final bro c = new bro("vines");
   public static final bro d = new bro("weeping_vines");
   public static final bro e = new bro("twisting_vines");
   public static final bro f = new bro("scaffolding");
   public static final bro g = new bro("other_climbable");
   public static final bro h = new bro("water");

   public static bro a(dta $$0) {
      if ($$0.a(dfy.cO) || $$0.a(awd.P)) {
         return b;
      } else if ($$0.a(dfy.ff)) {
         return c;
      } else if ($$0.a(dfy.oz) || $$0.a(dfy.oA)) {
         return d;
      } else if ($$0.a(dfy.oB) || $$0.a(dfy.oC)) {
         return e;
      } else {
         return $$0.a(dfy.nS) ? f : g;
      }
   }

   @Nullable
   public static bro a(btl $$0) {
      Optional<jd> $$1 = $$0.eJ();
      if ($$1.isPresent()) {
         dta $$2 = $$0.dQ().a_($$1.get());
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
