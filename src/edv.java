import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record edv(bkv<List<edr>> c) implements edr {
   static Codec<edv> a = RecordCodecBuilder.create($$0 -> $$0.group(bkv.b(Codec.list(edr.b)).fieldOf("groups").forGetter(edv::c)).apply($$0, edv::new));

   @Override
   public void a(awt $$0, BiConsumer<ajb<edp>, ajb<edp>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ajb<edp>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(edr::a);
   }

   @Override
   public Codec<edv> b() {
      return a;
   }
}
