import java.util.Optional;
import javax.annotation.Nullable;

public record bpd(String i) {
   public static final bpd a = new bpd("generic");
   public static final bpd b = new bpd("ladder");
   public static final bpd c = new bpd("vines");
   public static final bpd d = new bpd("weeping_vines");
   public static final bpd e = new bpd("twisting_vines");
   public static final bpd f = new bpd("scaffolding");
   public static final bpd g = new bpd("other_climbable");
   public static final bpd h = new bpd("water");

   public static bpd a(dpi $$0) {
      if ($$0.a(dcj.cO) || $$0.a(ave.P)) {
         return b;
      } else if ($$0.a(dcj.ff)) {
         return c;
      } else if ($$0.a(dcj.oz) || $$0.a(dcj.oA)) {
         return d;
      } else if ($$0.a(dcj.oB) || $$0.a(dcj.oC)) {
         return e;
      } else {
         return $$0.a(dcj.nS) ? f : g;
      }
   }

   @Nullable
   public static bpd a(bqt $$0) {
      Optional<id> $$1 = $$0.eJ();
      if ($$1.isPresent()) {
         dpi $$2 = $$0.dM().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bc() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
