import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eqb extends eqi {
   public static final MapCodec<eqb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egg.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, eqb::new)
   );
   private final egg.a c;

   private eqb(egg.a $$0) {
      this.c = $$0;
   }

   public static eqb a(egg.a $$0) {
      return new eqb($$0);
   }

   @Override
   public Stream<iu> a_(eqg $$0, azv $$1, iu $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new iu($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public eqj<?> b() {
      return eqj.k;
   }
}
