import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eps extends eqa {
   public static final MapCodec<eps> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(epa.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eps::new));
   private final epa c;

   private eps(epa $$0) {
      this.c = $$0;
   }

   public static eps a(epa $$0) {
      return new eps($$0);
   }

   public static eps a(egs $$0, egs $$1) {
      return a(epd.a($$0, $$1));
   }

   public static eps b(egs $$0, egs $$1) {
      return a(epc.a($$0, $$1));
   }

   @Override
   public Stream<iu> a_(epy $$0, azv $$1, iu $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eqb<?> b() {
      return eqb.l;
   }
}
