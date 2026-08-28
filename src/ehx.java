import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehx extends eie {
   public static final MapCodec<ehx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyg.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ehx::new)
   );
   private final dyg.a c;

   private ehx(dyg.a $$0) {
      this.c = $$0;
   }

   public static ehx a(dyg.a $$0) {
      return new ehx($$0);
   }

   @Override
   public Stream<ja> a_(eic $$0, ayo $$1, ja $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new ja($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public eif<?> b() {
      return eif.k;
   }
}
