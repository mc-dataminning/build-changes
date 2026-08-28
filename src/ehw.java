import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehw extends eie {
   public static final MapCodec<ehw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ehe.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ehw::new));
   private final ehe c;

   private ehw(ehe $$0) {
      this.c = $$0;
   }

   public static ehw a(ehe $$0) {
      return new ehw($$0);
   }

   public static ehw a(dza $$0, dza $$1) {
      return a(ehh.a($$0, $$1));
   }

   public static ehw b(dza $$0, dza $$1) {
      return a(ehg.a($$0, $$1));
   }

   @Override
   public Stream<ja> a_(eic $$0, ayo $$1, ja $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eif<?> b() {
      return eif.l;
   }
}
