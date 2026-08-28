import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ent extends enr {
   public static final MapCodec<ent> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bso.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bso.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, ent::new)
   );
   private final bso c;
   private final bso d;

   public static ent a(bso $$0, bso $$1) {
      return new ent($$0, $$1);
   }

   public static ent a(bso $$0) {
      return new ent(bsl.a(0), $$0);
   }

   public static ent b(bso $$0) {
      return new ent($$0, bsl.a(0));
   }

   private ent(bso $$0, bso $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<jh> a_(enp $$0, bam $$1, jh $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new jh($$3, $$4, $$5));
   }

   @Override
   public ens<?> b() {
      return ens.n;
   }
}
