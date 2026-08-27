import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dya extends dyn {
   public static final Codec<dya> a = dom.a.c.fieldOf("step").xmap(dya::new, $$0 -> $$0.c).codec();
   private final dom.a c;

   private dya(dom.a $$0) {
      this.c = $$0;
   }

   public static dya a(dom.a $$0) {
      return new dya($$0);
   }

   @Override
   public Stream<hx> a_(dyl $$0, auv $$1, hx $$2) {
      csw $$3 = new csw($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public dyo<?> b() {
      return dyo.o;
   }
}
