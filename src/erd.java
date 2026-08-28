import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class erd extends erk {
   public static final MapCodec<erd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehf.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, erd::new)
   );
   private final ehf.a c;

   private erd(ehf.a $$0) {
      this.c = $$0;
   }

   public static erd a(ehf.a $$0) {
      return new erd($$0);
   }

   @Override
   public Stream<iw> a_(eri $$0, azz $$1, iw $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new iw($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public erl<?> b() {
      return erl.k;
   }
}
