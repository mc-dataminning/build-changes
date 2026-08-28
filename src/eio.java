import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eio extends eiw {
   public static final MapCodec<eio> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ehw.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eio::new));
   private final ehw c;

   private eio(ehw $$0) {
      this.c = $$0;
   }

   public static eio a(ehw $$0) {
      return new eio($$0);
   }

   public static eio a(dzs $$0, dzs $$1) {
      return a(ehz.a($$0, $$1));
   }

   public static eio b(dzs $$0, dzs $$1) {
      return a(ehy.a($$0, $$1));
   }

   @Override
   public Stream<jd> a_(eiu $$0, ayw $$1, jd $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eix<?> b() {
      return eix.l;
   }
}
