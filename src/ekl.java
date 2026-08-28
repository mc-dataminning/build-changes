import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ekl extends ekj {
   public static final MapCodec<ekl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqu.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bqu.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, ekl::new)
   );
   private final bqu c;
   private final bqu d;

   public static ekl a(bqu $$0, bqu $$1) {
      return new ekl($$0, $$1);
   }

   public static ekl a(bqu $$0) {
      return new ekl(bqr.a(0), $$0);
   }

   public static ekl b(bqu $$0) {
      return new ekl($$0, bqr.a(0));
   }

   private ekl(bqu $$0, bqu $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<je> a_(ekh $$0, azl $$1, je $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new je($$3, $$4, $$5));
   }

   @Override
   public ekk<?> b() {
      return ekk.n;
   }
}
