import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eda(bkg<List<ecw>> c) implements ecw {
   static Codec<eda> a = RecordCodecBuilder.create($$0 -> $$0.group(bkg.b(Codec.list(ecw.b)).fieldOf("groups").forGetter(eda::c)).apply($$0, eda::new));

   @Override
   public void a(awp $$0, BiConsumer<aix<ecu>, aix<ecu>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<aix<ecu>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(ecw::a);
   }

   @Override
   public Codec<eda> b() {
      return a;
   }
}
