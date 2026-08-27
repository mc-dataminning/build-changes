import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dra extends drh {
   public static final Codec<dra> a = RecordCodecBuilder.create($$0 -> $$0.group(dhk.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, dra::new));
   private final dhk.a c;

   private dra(dhk.a $$0) {
      this.c = $$0;
   }

   public static dra a(dhk.a $$0) {
      return new dra($$0);
   }

   @Override
   public Stream<gu> a_(drf $$0, apf $$1, gu $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new gu($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public dri<?> b() {
      return dri.k;
   }
}
