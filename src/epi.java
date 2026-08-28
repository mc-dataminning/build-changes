import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class epi extends epp {
   public static final MapCodec<epi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(efn.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, epi::new)
   );
   private final efn.a c;

   private epi(efn.a $$0) {
      this.c = $$0;
   }

   public static epi a(efn.a $$0) {
      return new epi($$0);
   }

   @Override
   public Stream<iu> a_(epn $$0, azt $$1, iu $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new iu($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public epq<?> b() {
      return epq.k;
   }
}
