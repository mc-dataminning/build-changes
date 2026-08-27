import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dtw extends due {
   public static final Codec<dtw> a = RecordCodecBuilder.create($$0 -> $$0.group(dte.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dtw::new));
   private final dte c;

   private dtw(dte $$0) {
      this.c = $$0;
   }

   public static dtw a(dte $$0) {
      return new dtw($$0);
   }

   public static dtw a(dlb $$0, dlb $$1) {
      return a(dth.a($$0, $$1));
   }

   public static dtw b(dlb $$0, dlb $$1) {
      return a(dtg.a($$0, $$1));
   }

   @Override
   public Stream<gv> a_(duc $$0, art $$1, gv $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public duf<?> b() {
      return duf.l;
   }
}
