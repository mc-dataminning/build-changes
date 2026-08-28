import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class end extends enk {
   public static final MapCodec<end> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edj.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, end::new)
   );
   private final edj.a c;

   private end(edj.a $$0) {
      this.c = $$0;
   }

   public static end a(edj.a $$0) {
      return new end($$0);
   }

   @Override
   public Stream<jh> a_(eni $$0, bac $$1, jh $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new jh($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public enl<?> b() {
      return enl.k;
   }
}
