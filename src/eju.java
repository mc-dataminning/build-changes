import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eju(boz<List<ejq>> c) implements ejq {
   static MapCodec<eju> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(boz.b(Codec.list(ejq.b)).fieldOf("groups").forGetter(eju::c)).apply($$0, eju::new));

   @Override
   public void a(azc $$0, BiConsumer<ala<ejo>, ala<ejo>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ala<ejo>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(ejq::a);
   }

   @Override
   public MapCodec<eju> b() {
      return a;
   }
}
