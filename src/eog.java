import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eog extends eon {
   public static final MapCodec<eog> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eel.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, eog::new)
   );
   private final eel.a c;

   private eog(eel.a $$0) {
      this.c = $$0;
   }

   public static eog a(eel.a $$0) {
      return new eog($$0);
   }

   @Override
   public Stream<jj> a_(eol $$0, azs $$1, jj $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new jj($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public eoo<?> b() {
      return eoo.k;
   }
}
