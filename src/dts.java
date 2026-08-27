import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dts extends duf {
   public static final Codec<dts> a = dke.a.c.fieldOf("step").xmap(dts::new, $$0 -> $$0.c).codec();
   private final dke.a c;

   private dts(dke.a $$0) {
      this.c = $$0;
   }

   public static dts a(dke.a $$0) {
      return new dts($$0);
   }

   @Override
   public Stream<gu> a_(dud $$0, aru $$1, gu $$2) {
      cos $$3 = new cos($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public dug<?> b() {
      return dug.o;
   }
}
