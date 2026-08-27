import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record egw(bmk<List<egs>> c) implements egs {
   static Codec<egw> a = RecordCodecBuilder.create($$0 -> $$0.group(bmk.b(Codec.list(egs.b)).fieldOf("groups").forGetter(egw::c)).apply($$0, egw::new));

   @Override
   public void a(axr $$0, BiConsumer<ajs<egq>, ajs<egq>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ajs<egq>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(egs::a);
   }

   @Override
   public Codec<egw> b() {
      return a;
   }
}
