import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dud extends duk {
   public static final Codec<dud> a = RecordCodecBuilder.create($$0 -> $$0.group(dkn.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, dud::new));
   private final dkn.a c;

   private dud(dkn.a $$0) {
      this.c = $$0;
   }

   public static dud a(dkn.a $$0) {
      return new dud($$0);
   }

   @Override
   public Stream<gw> a_(dui $$0, arx $$1, gw $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new gw($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public dul<?> b() {
      return dul.k;
   }
}
