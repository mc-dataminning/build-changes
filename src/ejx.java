import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ejx extends ejv {
   public static final MapCodec<ejx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqp.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bqp.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, ejx::new)
   );
   private final bqp c;
   private final bqp d;

   public static ejx a(bqp $$0, bqp $$1) {
      return new ejx($$0, $$1);
   }

   public static ejx a(bqp $$0) {
      return new ejx(bqm.a(0), $$0);
   }

   public static ejx b(bqp $$0) {
      return new ejx($$0, bqm.a(0));
   }

   private ejx(bqp $$0, bqp $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<je> a_(ejt $$0, azk $$1, je $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new je($$3, $$4, $$5));
   }

   @Override
   public ejw<?> b() {
      return ejw.n;
   }
}
