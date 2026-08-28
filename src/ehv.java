import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehv extends eid {
   public static final MapCodec<ehv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ehd.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ehv::new));
   private final ehd c;

   private ehv(ehd $$0) {
      this.c = $$0;
   }

   public static ehv a(ehd $$0) {
      return new ehv($$0);
   }

   public static ehv a(dyz $$0, dyz $$1) {
      return a(ehg.a($$0, $$1));
   }

   public static ehv b(dyz $$0, dyz $$1) {
      return a(ehf.a($$0, $$1));
   }

   @Override
   public Stream<ja> a_(eib $$0, ayo $$1, ja $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eie<?> b() {
      return eie.l;
   }
}
