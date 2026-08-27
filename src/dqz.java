import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dqz extends drh {
   public static final Codec<dqz> a = RecordCodecBuilder.create($$0 -> $$0.group(dqh.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dqz::new));
   private final dqh c;

   private dqz(dqh $$0) {
      this.c = $$0;
   }

   public static dqz a(dqh $$0) {
      return new dqz($$0);
   }

   public static dqz a(die $$0, die $$1) {
      return a(dqk.a($$0, $$1));
   }

   public static dqz b(die $$0, die $$1) {
      return a(dqj.a($$0, $$1));
   }

   @Override
   public Stream<gu> a_(drf $$0, apf $$1, gu $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public dri<?> b() {
      return dri.l;
   }
}
