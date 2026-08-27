import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dty extends duf {
   public static final Codec<dty> a = RecordCodecBuilder.create($$0 -> $$0.group(dki.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, dty::new));
   private final dki.a c;

   private dty(dki.a $$0) {
      this.c = $$0;
   }

   public static dty a(dki.a $$0) {
      return new dty($$0);
   }

   @Override
   public Stream<gu> a_(dud $$0, aru $$1, gu $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new gu($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public dug<?> b() {
      return dug.k;
   }
}
