import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eli extends elp {
   public static final MapCodec<eli> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebq.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, eli::new)
   );
   private final ebq.a c;

   private eli(ebq.a $$0) {
      this.c = $$0;
   }

   public static eli a(ebq.a $$0) {
      return new eli($$0);
   }

   @Override
   public Stream<jh> a_(eln $$0, azu $$1, jh $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new jh($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public elq<?> b() {
      return elq.k;
   }
}
