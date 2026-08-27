import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eba extends ebn {
   public static final Codec<eba> a = drm.a.c.fieldOf("step").xmap(eba::new, $$0 -> $$0.c).codec();
   private final drm.a c;

   private eba(drm.a $$0) {
      this.c = $$0;
   }

   public static eba a(drm.a $$0) {
      return new eba($$0);
   }

   @Override
   public Stream<ib> a_(ebl $$0, awt $$1, ib $$2) {
      cvl $$3 = new cvl($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public ebo<?> b() {
      return ebo.o;
   }
}
