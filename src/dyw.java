import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record dyw(bhh<List<dys>> c) implements dys {
   static Codec<dyw> a = RecordCodecBuilder.create($$0 -> $$0.group(bhh.b(Codec.list(dys.b)).fieldOf("groups").forGetter(dyw::c)).apply($$0, dyw::new));

   @Override
   public void a(ats $$0, BiConsumer<agh<dyq>, agh<dyq>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<agh<dyq>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(dys::a);
   }

   @Override
   public Codec<dyw> b() {
      return a;
   }
}
