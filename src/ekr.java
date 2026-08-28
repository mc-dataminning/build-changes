import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ekr extends eky {
   public static final MapCodec<ekr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eaz.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ekr::new)
   );
   private final eaz.a c;

   private ekr(eaz.a $$0) {
      this.c = $$0;
   }

   public static ekr a(eaz.a $$0) {
      return new ekr($$0);
   }

   @Override
   public Stream<jg> a_(ekw $$0, azr $$1, jg $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new jg($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public ekz<?> b() {
      return ekz.k;
   }
}
