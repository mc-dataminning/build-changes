import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dyf extends dym {
   public static final Codec<dyf> a = RecordCodecBuilder.create($$0 -> $$0.group(dop.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, dyf::new));
   private final dop.a c;

   private dyf(dop.a $$0) {
      this.c = $$0;
   }

   public static dyf a(dop.a $$0) {
      return new dyf($$0);
   }

   @Override
   public Stream<hx> a_(dyk $$0, auu $$1, hx $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new hx($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public dyn<?> b() {
      return dyn.k;
   }
}
