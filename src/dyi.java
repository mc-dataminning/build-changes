import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dyi extends dyg {
   public static final Codec<dyi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bja.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bja.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, dyi::new)
   );
   private final bja c;
   private final bja d;

   public static dyi a(bja $$0, bja $$1) {
      return new dyi($$0, $$1);
   }

   public static dyi a(bja $$0) {
      return new dyi(bix.a(0), $$0);
   }

   public static dyi b(bja $$0) {
      return new dyi($$0, bix.a(0));
   }

   private dyi(bja $$0, bja $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<hx> a_(dye $$0, aup $$1, hx $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new hx($$3, $$4, $$5));
   }

   @Override
   public dyh<?> b() {
      return dyh.n;
   }
}
