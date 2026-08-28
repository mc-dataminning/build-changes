import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eqa(brr<List<epw>> c) implements epw {
   static MapCodec<eqa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(brr.b(Codec.list(epw.b)).fieldOf("groups").forGetter(eqa::c)).apply($$0, eqa::new));

   @Override
   public void a(bam $$0, BiConsumer<aly<epu>, aly<epu>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<aly<epu>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(epw::a);
   }

   @Override
   public MapCodec<eqa> b() {
      return a;
   }
}
