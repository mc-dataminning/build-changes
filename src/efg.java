import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class efg extends efn {
   public static final Codec<efg> a = RecordCodecBuilder.create($$0 -> $$0.group(dvq.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, efg::new));
   private final dvq.a c;

   private efg(dvq.a $$0) {
      this.c = $$0;
   }

   public static efg a(dvq.a $$0) {
      return new efg($$0);
   }

   @Override
   public Stream<im> a_(efl $$0, ayd $$1, im $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new im($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public efo<?> b() {
      return efo.k;
   }
}
