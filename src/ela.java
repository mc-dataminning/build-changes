import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ela extends eli {
   public static final MapCodec<ela> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eki.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ela::new));
   private final eki c;

   private ela(eki $$0) {
      this.c = $$0;
   }

   public static ela a(eki $$0) {
      return new ela($$0);
   }

   public static ela a(ecd $$0, ecd $$1) {
      return a(ekl.a($$0, $$1));
   }

   public static ela b(ecd $$0, ecd $$1) {
      return a(ekk.a($$0, $$1));
   }

   @Override
   public Stream<jh> a_(elg $$0, azv $$1, jh $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public elj<?> b() {
      return elj.l;
   }
}
