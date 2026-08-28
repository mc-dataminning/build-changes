import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ekx extends ele {
   public static final MapCodec<ekx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebf.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ekx::new)
   );
   private final ebf.a c;

   private ekx(ebf.a $$0) {
      this.c = $$0;
   }

   public static ekx a(ebf.a $$0) {
      return new ekx($$0);
   }

   @Override
   public Stream<jh> a_(elc $$0, azs $$1, jh $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new jh($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public elf<?> b() {
      return elf.k;
   }
}
