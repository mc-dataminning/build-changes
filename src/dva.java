import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dva extends dvh {
   public static final Codec<dva> a = RecordCodecBuilder.create($$0 -> $$0.group(dlk.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, dva::new));
   private final dlk.a c;

   private dva(dlk.a $$0) {
      this.c = $$0;
   }

   public static dva a(dlk.a $$0) {
      return new dva($$0);
   }

   @Override
   public Stream<ht> a_(dvf $$0, ate $$1, ht $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new ht($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public dvi<?> b() {
      return dvi.k;
   }
}
