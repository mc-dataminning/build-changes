import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehk extends ehr {
   public static final MapCodec<ehk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxu.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ehk::new)
   );
   private final dxu.a c;

   private ehk(dxu.a $$0) {
      this.c = $$0;
   }

   public static ehk a(dxu.a $$0) {
      return new ehk($$0);
   }

   @Override
   public Stream<iz> a_(ehp $$0, azh $$1, iz $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new iz($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public ehs<?> b() {
      return ehs.k;
   }
}
