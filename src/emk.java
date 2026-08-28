import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class emk extends ems {
   public static final MapCodec<emk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(els.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, emk::new));
   private final els c;

   private emk(els $$0) {
      this.c = $$0;
   }

   public static emk a(els $$0) {
      return new emk($$0);
   }

   public static emk a(edl $$0, edl $$1) {
      return a(elv.a($$0, $$1));
   }

   public static emk b(edl $$0, edl $$1) {
      return a(elu.a($$0, $$1));
   }

   @Override
   public Stream<ji> a_(emq $$0, azh $$1, ji $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public emt<?> b() {
      return emt.l;
   }
}
