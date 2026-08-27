import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eeh extends eeo {
   public static final Codec<eeh> a = RecordCodecBuilder.create($$0 -> $$0.group(dur.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, eeh::new));
   private final dur.a c;

   private eeh(dur.a $$0) {
      this.c = $$0;
   }

   public static eeh a(dur.a $$0) {
      return new eeh($$0);
   }

   @Override
   public Stream<ib> a_(eem $$0, axr $$1, ib $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new ib($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public eep<?> b() {
      return eep.k;
   }
}
