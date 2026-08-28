import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class enc extends enj {
   public static final MapCodec<enc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edi.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, enc::new)
   );
   private final edi.a c;

   private enc(edi.a $$0) {
      this.c = $$0;
   }

   public static enc a(edi.a $$0) {
      return new enc($$0);
   }

   @Override
   public Stream<jh> a_(enh $$0, bam $$1, jh $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new jh($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public enk<?> b() {
      return enk.k;
   }
}
