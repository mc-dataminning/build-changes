import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eeq extends eex {
   public static final Codec<eeq> a = RecordCodecBuilder.create($$0 -> $$0.group(dva.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, eeq::new));
   private final dva.a c;

   private eeq(dva.a $$0) {
      this.c = $$0;
   }

   public static eeq a(dva.a $$0) {
      return new eeq($$0);
   }

   @Override
   public Stream<id> a_(eev $$0, axt $$1, id $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new id($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public eey<?> b() {
      return eey.k;
   }
}
