import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class emk extends emr {
   public static final MapCodec<emk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecq.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, emk::new)
   );
   private final ecq.a c;

   private emk(ecq.a $$0) {
      this.c = $$0;
   }

   public static emk a(ecq.a $$0) {
      return new emk($$0);
   }

   @Override
   public Stream<ji> a_(emp $$0, azg $$1, ji $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new ji($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public ems<?> b() {
      return ems.k;
   }
}
