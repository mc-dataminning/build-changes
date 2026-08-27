import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class egl extends egs {
   public static final MapCodec<egl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwv.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, egl::new)
   );
   private final dwv.a c;

   private egl(dwv.a $$0) {
      this.c = $$0;
   }

   public static egl a(dwv.a $$0) {
      return new egl($$0);
   }

   @Override
   public Stream<io> a_(egq $$0, aym $$1, io $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new io($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public egt<?> b() {
      return egt.k;
   }
}
