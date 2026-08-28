import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehi extends ehp {
   public static final MapCodec<ehi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxs.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ehi::new)
   );
   private final dxs.a c;

   private ehi(dxs.a $$0) {
      this.c = $$0;
   }

   public static ehi a(dxs.a $$0) {
      return new ehi($$0);
   }

   @Override
   public Stream<iz> a_(ehn $$0, azf $$1, iz $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new iz($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public ehq<?> b() {
      return ehq.k;
   }
}
