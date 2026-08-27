import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dtx extends duk {
   public static final Codec<dtx> a = dkj.a.c.fieldOf("step").xmap(dtx::new, $$0 -> $$0.c).codec();
   private final dkj.a c;

   private dtx(dkj.a $$0) {
      this.c = $$0;
   }

   public static dtx a(dkj.a $$0) {
      return new dtx($$0);
   }

   @Override
   public Stream<gw> a_(dui $$0, arx $$1, gw $$2) {
      cox $$3 = new cox($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public dul<?> b() {
      return dul.o;
   }
}
