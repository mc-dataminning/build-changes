import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class duc extends duj {
   public static final Codec<duc> a = RecordCodecBuilder.create($$0 -> $$0.group(dkm.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, duc::new));
   private final dkm.a c;

   private duc(dkm.a $$0) {
      this.c = $$0;
   }

   public static duc a(dkm.a $$0) {
      return new duc($$0);
   }

   @Override
   public Stream<gw> a_(duh $$0, ash $$1, gw $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new gw($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public duk<?> b() {
      return duk.k;
   }
}
