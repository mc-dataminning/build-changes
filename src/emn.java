import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class emn extends emu {
   public static final MapCodec<emn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ect.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, emn::new)
   );
   private final ect.a c;

   private emn(ect.a $$0) {
      this.c = $$0;
   }

   public static emn a(ect.a $$0) {
      return new emn($$0);
   }

   @Override
   public Stream<ji> a_(ems $$0, azh $$1, ji $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new ji($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public emv<?> b() {
      return emv.k;
   }
}
