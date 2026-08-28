import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ejo extends ejv {
   public static final MapCodec<ejo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzw.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ejo::new)
   );
   private final dzw.a c;

   private ejo(dzw.a $$0) {
      this.c = $$0;
   }

   public static ejo a(dzw.a $$0) {
      return new ejo($$0);
   }

   @Override
   public Stream<je> a_(ejt $$0, azk $$1, je $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new je($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public ejw<?> b() {
      return ejw.k;
   }
}
