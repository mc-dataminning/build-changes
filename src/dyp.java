import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dyp extends dyn {
   public static final Codec<dyp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bjg.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bjg.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, dyp::new)
   );
   private final bjg c;
   private final bjg d;

   public static dyp a(bjg $$0, bjg $$1) {
      return new dyp($$0, $$1);
   }

   public static dyp a(bjg $$0) {
      return new dyp(bjd.a(0), $$0);
   }

   public static dyp b(bjg $$0) {
      return new dyp($$0, bjd.a(0));
   }

   private dyp(bjg $$0, bjg $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<hx> a_(dyl $$0, auv $$1, hx $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new hx($$3, $$4, $$5));
   }

   @Override
   public dyo<?> b() {
      return dyo.n;
   }
}
