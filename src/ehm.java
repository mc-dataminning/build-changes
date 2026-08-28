import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehm extends eht {
   public static final MapCodec<ehm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxw.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ehm::new)
   );
   private final dxw.a c;

   private ehm(dxw.a $$0) {
      this.c = $$0;
   }

   public static ehm a(dxw.a $$0) {
      return new ehm($$0);
   }

   @Override
   public Stream<iz> a_(ehr $$0, azh $$1, iz $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new iz($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public ehu<?> b() {
      return ehu.k;
   }
}
