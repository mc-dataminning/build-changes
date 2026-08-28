import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehl extends ehs {
   public static final MapCodec<ehl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxv.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ehl::new)
   );
   private final dxv.a c;

   private ehl(dxv.a $$0) {
      this.c = $$0;
   }

   public static ehl a(dxv.a $$0) {
      return new ehl($$0);
   }

   @Override
   public Stream<iz> a_(ehq $$0, azh $$1, iz $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new iz($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public eht<?> b() {
      return eht.k;
   }
}
