import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eit extends eja {
   public static final Codec<eit> a = RecordCodecBuilder.create($$0 -> $$0.group(dyu.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, eit::new));
   private final dyu.a c;

   private eit(dyu.a $$0) {
      this.c = $$0;
   }

   public static eit a(dyu.a $$0) {
      return new eit($$0);
   }

   @Override
   public Stream<ir> a_(eiy $$0, ayt $$1, ir $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new ir($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public ejb<?> b() {
      return ejb.k;
   }
}
