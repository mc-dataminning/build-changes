import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ekc extends ekj {
   public static final MapCodec<ekc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eak.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ekc::new)
   );
   private final eak.a c;

   private ekc(eak.a $$0) {
      this.c = $$0;
   }

   public static ekc a(eak.a $$0) {
      return new ekc($$0);
   }

   @Override
   public Stream<je> a_(ekh $$0, azl $$1, je $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new je($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public ekk<?> b() {
      return ekk.k;
   }
}
