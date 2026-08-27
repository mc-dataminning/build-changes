import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eiy(boe<List<eiu>> c) implements eiu {
   static MapCodec<eiy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(boe.b(Codec.list(eiu.b)).fieldOf("groups").forGetter(eiy::c)).apply($$0, eiy::new));

   @Override
   public void a(ayk $$0, BiConsumer<akl<eis>, akl<eis>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<akl<eis>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(eiu::a);
   }

   @Override
   public MapCodec<eiy> b() {
      return a;
   }
}
