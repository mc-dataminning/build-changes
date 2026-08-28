import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ekb extends ekj {
   public static final MapCodec<ekb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ejj.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ekb::new));
   private final ejj c;

   private ekb(ejj $$0) {
      this.c = $$0;
   }

   public static ekb a(ejj $$0) {
      return new ekb($$0);
   }

   public static ekb a(ebe $$0, ebe $$1) {
      return a(ejm.a($$0, $$1));
   }

   public static ekb b(ebe $$0, ebe $$1) {
      return a(ejl.a($$0, $$1));
   }

   @Override
   public Stream<je> a_(ekh $$0, azl $$1, je $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public ekk<?> b() {
      return ekk.l;
   }
}
