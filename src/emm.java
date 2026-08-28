import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class emm extends emt {
   public static final MapCodec<emm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecs.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, emm::new)
   );
   private final ecs.a c;

   private emm(ecs.a $$0) {
      this.c = $$0;
   }

   public static emm a(ecs.a $$0) {
      return new emm($$0);
   }

   @Override
   public Stream<ji> a_(emr $$0, azh $$1, ji $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new ji($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public emu<?> b() {
      return emu.k;
   }
}
