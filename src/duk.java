import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class duk extends dur {
   public static final Codec<duk> a = RecordCodecBuilder.create($$0 -> $$0.group(dku.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, duk::new));
   private final dku.a c;

   private duk(dku.a $$0) {
      this.c = $$0;
   }

   public static duk a(dku.a $$0) {
      return new duk($$0);
   }

   @Override
   public Stream<gw> a_(dup $$0, ase $$1, gw $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new gw($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public dus<?> b() {
      return dus.k;
   }
}
