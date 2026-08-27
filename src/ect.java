import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ect(bke<List<ecp>> c) implements ecp {
   static Codec<ect> a = RecordCodecBuilder.create($$0 -> $$0.group(bke.b(Codec.list(ecp.b)).fieldOf("groups").forGetter(ect::c)).apply($$0, ect::new));

   @Override
   public void a(awo $$0, BiConsumer<aix<ecn>, aix<ecn>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<aix<ecn>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(ecp::a);
   }

   @Override
   public Codec<ect> b() {
      return a;
   }
}
