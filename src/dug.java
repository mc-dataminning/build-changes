import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dug extends due {
   public static final Codec<dug> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bft.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bft.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, dug::new)
   );
   private final bft c;
   private final bft d;

   public static dug a(bft $$0, bft $$1) {
      return new dug($$0, $$1);
   }

   public static dug a(bft $$0) {
      return new dug(bfq.a(0), $$0);
   }

   public static dug b(bft $$0) {
      return new dug($$0, bfq.a(0));
   }

   private dug(bft $$0, bft $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<gv> a_(duc $$0, art $$1, gv $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new gv($$3, $$4, $$5));
   }

   @Override
   public duf<?> b() {
      return duf.n;
   }
}
