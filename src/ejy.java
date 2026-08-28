import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ejy(bpd<List<eju>> c) implements eju {
   static MapCodec<ejy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bpd.b(Codec.list(eju.b)).fieldOf("groups").forGetter(ejy::c)).apply($$0, ejy::new));

   @Override
   public void a(azg $$0, BiConsumer<ald<ejs>, ald<ejs>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ald<ejs>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(eju::a);
   }

   @Override
   public MapCodec<ejy> b() {
      return a;
   }
}
