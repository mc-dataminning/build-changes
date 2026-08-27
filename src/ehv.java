import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ehv(bna<List<ehr>> c) implements ehr {
   static Codec<ehv> a = RecordCodecBuilder.create($$0 -> $$0.group(bna.b(Codec.list(ehr.b)).fieldOf("groups").forGetter(ehv::c)).apply($$0, ehv::new));

   @Override
   public void a(ayd $$0, BiConsumer<ake<ehp>, ake<ehp>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ake<ehp>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(ehr::a);
   }

   @Override
   public Codec<ehv> b() {
      return a;
   }
}
