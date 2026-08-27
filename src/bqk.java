import java.util.Optional;
import javax.annotation.Nullable;

public record bqk(String i) {
   public static final bqk a = new bqk("generic");
   public static final bqk b = new bqk("ladder");
   public static final bqk c = new bqk("vines");
   public static final bqk d = new bqk("weeping_vines");
   public static final bqk e = new bqk("twisting_vines");
   public static final bqk f = new bqk("scaffolding");
   public static final bqk g = new bqk("other_climbable");
   public static final bqk h = new bqk("water");

   public static bqk a(dqh $$0) {
      if ($$0.a(ddg.cO) || $$0.a(avr.P)) {
         return b;
      } else if ($$0.a(ddg.ff)) {
         return c;
      } else if ($$0.a(ddg.oz) || $$0.a(ddg.oA)) {
         return d;
      } else if ($$0.a(ddg.oB) || $$0.a(ddg.oC)) {
         return e;
      } else {
         return $$0.a(ddg.nS) ? f : g;
      }
   }

   @Nullable
   public static bqk a(bsa $$0) {
      Optional<in> $$1 = $$0.eK();
      if ($$1.isPresent()) {
         dqh $$2 = $$0.dN().a_($$1.get());
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
