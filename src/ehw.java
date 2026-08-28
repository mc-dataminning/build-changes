import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehw extends eid {
   public static final MapCodec<ehw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyf.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ehw::new)
   );
   private final dyf.a c;

   private ehw(dyf.a $$0) {
      this.c = $$0;
   }

   public static ehw a(dyf.a $$0) {
      return new ehw($$0);
   }

   @Override
   public Stream<ja> a_(eib $$0, ayo $$1, ja $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new ja($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public eie<?> b() {
      return eie.k;
   }
}
