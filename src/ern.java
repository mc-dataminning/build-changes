import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ern extends eru {
   public static final MapCodec<ern> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehp.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ern::new)
   );
   private final ehp.a c;

   private ern(ehp.a $$0) {
      this.c = $$0;
   }

   public static ern a(ehp.a $$0) {
      return new ern($$0);
   }

   @Override
   public Stream<iw> a_(ers $$0, bai $$1, iw $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new iw($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public erv<?> b() {
      return erv.k;
   }
}
