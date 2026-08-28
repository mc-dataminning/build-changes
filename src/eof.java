import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eof extends eon {
   public static final MapCodec<eof> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(enn.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eof::new));
   private final enn c;

   private eof(enn $$0) {
      this.c = $$0;
   }

   public static eof a(enn $$0) {
      return new eof($$0);
   }

   public static eof a(eff $$0, eff $$1) {
      return a(enq.a($$0, $$1));
   }

   public static eof b(eff $$0, eff $$1) {
      return a(enp.a($$0, $$1));
   }

   @Override
   public Stream<jj> a_(eol $$0, azs $$1, jj $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eoo<?> b() {
      return eoo.l;
   }
}
