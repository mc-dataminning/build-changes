import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehq extends ehx {
   public static final MapCodec<ehq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxz.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ehq::new)
   );
   private final dxz.a c;

   private ehq(dxz.a $$0) {
      this.c = $$0;
   }

   public static ehq a(dxz.a $$0) {
      return new ehq($$0);
   }

   @Override
   public Stream<ja> a_(ehv $$0, aym $$1, ja $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new ja($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public ehy<?> b() {
      return ehy.k;
   }
}
