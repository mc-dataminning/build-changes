import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ekl(boq<List<ekh>> c) implements ekh {
   static MapCodec<ekl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(boq.b(Codec.list(ekh.b)).fieldOf("groups").forGetter(ekl::c)).apply($$0, ekl::new));

   @Override
   public void a(ayo $$0, BiConsumer<akj<ekf>, akj<ekf>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<akj<ekf>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(ekh::a);
   }

   @Override
   public MapCodec<ekl> b() {
      return a;
   }
}
