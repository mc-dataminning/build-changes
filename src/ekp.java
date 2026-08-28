import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ekp extends ekn {
   public static final MapCodec<ekp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqx.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bqx.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, ekp::new)
   );
   private final bqx c;
   private final bqx d;

   public static ekp a(bqx $$0, bqx $$1) {
      return new ekp($$0, $$1);
   }

   public static ekp a(bqx $$0) {
      return new ekp(bqu.a(0), $$0);
   }

   public static ekp b(bqx $$0) {
      return new ekp($$0, bqu.a(0));
   }

   private ekp(bqx $$0, bqx $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<jf> a_(ekl $$0, azn $$1, jf $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new jf($$3, $$4, $$5));
   }

   @Override
   public eko<?> b() {
      return eko.n;
   }
}
