import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eni extends enq {
   public static final MapCodec<eni> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(emq.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eni::new));
   private final emq c;

   private eni(emq $$0) {
      this.c = $$0;
   }

   public static eni a(emq $$0) {
      return new eni($$0);
   }

   public static eni a(eei $$0, eei $$1) {
      return a(emt.a($$0, $$1));
   }

   public static eni b(eei $$0, eei $$1) {
      return a(ems.a($$0, $$1));
   }

   @Override
   public Stream<ji> a_(eno $$0, azh $$1, ji $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public enr<?> b() {
      return enr.l;
   }
}
