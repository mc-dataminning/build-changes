import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eli(bok<List<ele>> c) implements ele {
   static Codec<eli> a = RecordCodecBuilder.create($$0 -> $$0.group(bok.b(Codec.list(ele.b)).fieldOf("groups").forGetter(eli::c)).apply($$0, eli::new));

   @Override
   public void a(ayt $$0, BiConsumer<aks<elc>, aks<elc>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<aks<elc>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(ele::a);
   }

   @Override
   public Codec<eli> b() {
      return a;
   }
}
