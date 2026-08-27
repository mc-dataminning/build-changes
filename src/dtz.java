import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dtz extends dug {
   public static final Codec<dtz> a = RecordCodecBuilder.create($$0 -> $$0.group(dkj.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, dtz::new));
   private final dkj.a c;

   private dtz(dkj.a $$0) {
      this.c = $$0;
   }

   public static dtz a(dkj.a $$0) {
      return new dtz($$0);
   }

   @Override
   public Stream<gu> a_(due $$0, aru $$1, gu $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new gu($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public duh<?> b() {
      return duh.k;
   }
}
