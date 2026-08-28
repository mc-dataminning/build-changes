import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ept extends eqa {
   public static final MapCodec<ept> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(efy.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ept::new)
   );
   private final efy.a c;

   private ept(efy.a $$0) {
      this.c = $$0;
   }

   public static ept a(efy.a $$0) {
      return new ept($$0);
   }

   @Override
   public Stream<iu> a_(epy $$0, azv $$1, iu $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new iu($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public eqb<?> b() {
      return eqb.k;
   }
}
