import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dyg extends dyn {
   public static final Codec<dyg> a = RecordCodecBuilder.create($$0 -> $$0.group(doq.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, dyg::new));
   private final doq.a c;

   private dyg(doq.a $$0) {
      this.c = $$0;
   }

   public static dyg a(doq.a $$0) {
      return new dyg($$0);
   }

   @Override
   public Stream<hx> a_(dyl $$0, auv $$1, hx $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new hx($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public dyo<?> b() {
      return dyo.k;
   }
}
