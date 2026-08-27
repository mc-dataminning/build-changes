import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class egj extends egq {
   public static final MapCodec<egj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwt.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, egj::new)
   );
   private final dwt.a c;

   private egj(dwt.a $$0) {
      this.c = $$0;
   }

   public static egj a(dwt.a $$0) {
      return new egj($$0);
   }

   @Override
   public Stream<io> a_(ego $$0, ayk $$1, io $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new io($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public egr<?> b() {
      return egr.k;
   }
}
