import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dtx extends due {
   public static final Codec<dtx> a = RecordCodecBuilder.create($$0 -> $$0.group(dkh.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, dtx::new));
   private final dkh.a c;

   private dtx(dkh.a $$0) {
      this.c = $$0;
   }

   public static dtx a(dkh.a $$0) {
      return new dtx($$0);
   }

   @Override
   public Stream<gv> a_(duc $$0, art $$1, gv $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new gv($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public duf<?> b() {
      return duf.k;
   }
}
