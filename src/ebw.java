import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class ebw extends ecj {
   public static final Codec<ebw> a = dsi.a.c.fieldOf("step").xmap(ebw::new, $$0 -> $$0.c).codec();
   private final dsi.a c;

   private ebw(dsi.a $$0) {
      this.c = $$0;
   }

   public static ebw a(dsi.a $$0) {
      return new ebw($$0);
   }

   @Override
   public Stream<ib> a_(ech $$0, axd $$1, ib $$2) {
      cwg $$3 = new cwg($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public eck<?> b() {
      return eck.o;
   }
}
