import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dwv extends dwt {
   public static final Codec<dwv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(big.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), big.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, dwv::new)
   );
   private final big c;
   private final big d;

   public static dwv a(big $$0, big $$1) {
      return new dwv($$0, $$1);
   }

   public static dwv a(big $$0) {
      return new dwv(bid.a(0), $$0);
   }

   public static dwv b(big $$0) {
      return new dwv($$0, bid.a(0));
   }

   private dwv(big $$0, big $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<hx> a_(dwr $$0, atw $$1, hx $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new hx($$3, $$4, $$5));
   }

   @Override
   public dwu<?> b() {
      return dwu.n;
   }
}
