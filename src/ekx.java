import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ekx(akp<ekw> c, akp<ekw> d) implements eky {
   static MapCodec<ekx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akp.a(lu.aU).fieldOf("alias").forGetter(ekx::c), akp.a(lu.aU).fieldOf("target").forGetter(ekx::d)).apply($$0, ekx::new)
   );

   @Override
   public void a(ayv $$0, BiConsumer<akp<ekw>, akp<ekw>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<akp<ekw>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<ekx> b() {
      return a;
   }
}
