import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eml extends ems {
   public static final MapCodec<eml> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecr.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, eml::new)
   );
   private final ecr.a c;

   private eml(ecr.a $$0) {
      this.c = $$0;
   }

   public static eml a(ecr.a $$0) {
      return new eml($$0);
   }

   @Override
   public Stream<ji> a_(emq $$0, azh $$1, ji $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new ji($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public emt<?> b() {
      return emt.k;
   }
}
