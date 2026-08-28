import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehf extends ehm {
   public static final MapCodec<ehf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxp.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ehf::new)
   );
   private final dxp.a c;

   private ehf(dxp.a $$0) {
      this.c = $$0;
   }

   public static ehf a(dxp.a $$0) {
      return new ehf($$0);
   }

   @Override
   public Stream<iz> a_(ehk $$0, azc $$1, iz $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new iz($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public ehn<?> b() {
      return ehn.k;
   }
}
