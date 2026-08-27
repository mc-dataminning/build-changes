import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class efp extends efw {
   public static final Codec<efp> a = RecordCodecBuilder.create($$0 -> $$0.group(dvz.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, efp::new));
   private final dvz.a c;

   private efp(dvz.a $$0) {
      this.c = $$0;
   }

   public static efp a(dvz.a $$0) {
      return new efp($$0);
   }

   @Override
   public Stream<in> a_(efu $$0, ayg $$1, in $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new in($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public efx<?> b() {
      return efx.k;
   }
}
