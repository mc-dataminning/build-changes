import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class epr extends epp {
   public static final MapCodec<epr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btd.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), btd.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, epr::new)
   );
   private final btd c;
   private final btd d;

   public static epr a(btd $$0, btd $$1) {
      return new epr($$0, $$1);
   }

   public static epr a(btd $$0) {
      return new epr(bta.a(0), $$0);
   }

   public static epr b(btd $$0) {
      return new epr($$0, bta.a(0));
   }

   private epr(btd $$0, btd $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<iu> a_(epn $$0, azt $$1, iu $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new iu($$3, $$4, $$5));
   }

   @Override
   public epq<?> b() {
      return epq.n;
   }
}
