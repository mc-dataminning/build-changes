import java.util.Optional;
import javax.annotation.Nullable;

public record btd(String i) {
   public static final btd a = new btd("generic");
   public static final btd b = new btd("ladder");
   public static final btd c = new btd("vines");
   public static final btd d = new btd("weeping_vines");
   public static final btd e = new btd("twisting_vines");
   public static final btd f = new btd("scaffolding");
   public static final btd g = new btd("other_climbable");
   public static final btd h = new btd("water");

   public static btd a(dvo $$0) {
      if ($$0.a(dil.cO) || $$0.a(axd.Q)) {
         return b;
      } else if ($$0.a(dil.ff)) {
         return c;
      } else if ($$0.a(dil.oz) || $$0.a(dil.oA)) {
         return d;
      } else if ($$0.a(dil.oB) || $$0.a(dil.oC)) {
         return e;
      } else {
         return $$0.a(dil.nS) ? f : g;
      }
   }

   @Nullable
   public static btd a(bve $$0) {
      Optional<jh> $$1 = $$0.eR();
      if ($$1.isPresent()) {
         dvo $$2 = $$0.dY().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bl() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
