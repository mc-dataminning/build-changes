import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ems(bpz<List<emo>> c) implements emo {
   static MapCodec<ems> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bpz.b(Codec.list(emo.b)).fieldOf("groups").forGetter(ems::c)).apply($$0, ems::new));

   @Override
   public void a(azl $$0, BiConsumer<alb<emm>, alb<emm>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<alb<emm>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(emo::a);
   }

   @Override
   public MapCodec<ems> b() {
      return a;
   }
}
