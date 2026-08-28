import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record elh(bpb<List<eld>> c) implements eld {
   static MapCodec<elh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bpb.b(Codec.list(eld.b)).fieldOf("groups").forGetter(elh::c)).apply($$0, elh::new));

   @Override
   public void a(ayw $$0, BiConsumer<akq<elb>, akq<elb>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<akq<elb>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(eld::a);
   }

   @Override
   public MapCodec<elh> b() {
      return a;
   }
}
