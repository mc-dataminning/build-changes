import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eil extends eit {
   public static final MapCodec<eil> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eht.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eil::new));
   private final eht c;

   private eil(eht $$0) {
      this.c = $$0;
   }

   public static eil a(eht $$0) {
      return new eil($$0);
   }

   public static eil a(dzp $$0, dzp $$1) {
      return a(ehw.a($$0, $$1));
   }

   public static eil b(dzp $$0, dzp $$1) {
      return a(ehv.a($$0, $$1));
   }

   @Override
   public Stream<jd> a_(eir $$0, ayv $$1, jd $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eiu<?> b() {
      return eiu.l;
   }
}
