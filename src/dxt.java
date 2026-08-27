import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dxt extends dyg {
   public static final Codec<dxt> a = dof.a.c.fieldOf("step").xmap(dxt::new, $$0 -> $$0.c).codec();
   private final dof.a c;

   private dxt(dof.a $$0) {
      this.c = $$0;
   }

   public static dxt a(dof.a $$0) {
      return new dxt($$0);
   }

   @Override
   public Stream<hx> a_(dye $$0, aup $$1, hx $$2) {
      csp $$3 = new csp($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public dyh<?> b() {
      return dyh.o;
   }
}
