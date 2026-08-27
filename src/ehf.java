import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ehf(bmp<List<ehb>> c) implements ehb {
   static Codec<ehf> a = RecordCodecBuilder.create($$0 -> $$0.group(bmp.b(Codec.list(ehb.b)).fieldOf("groups").forGetter(ehf::c)).apply($$0, ehf::new));

   @Override
   public void a(axt $$0, BiConsumer<aju<egz>, aju<egz>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<aju<egz>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(ehb::a);
   }

   @Override
   public Codec<ehf> b() {
      return a;
   }
}
