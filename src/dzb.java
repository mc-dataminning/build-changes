import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record dzb(bhl<List<dyx>> c) implements dyx {
   static Codec<dzb> a = RecordCodecBuilder.create($$0 -> $$0.group(bhl.b(Codec.list(dyx.b)).fieldOf("groups").forGetter(dzb::c)).apply($$0, dzb::new));

   @Override
   public void a(atw $$0, BiConsumer<agl<dyv>, agl<dyv>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<agl<dyv>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(dyx::a);
   }

   @Override
   public Codec<dzb> b() {
      return a;
   }
}
