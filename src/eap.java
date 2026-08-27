import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eap(ahf<eao> c, ahf<eao> d) implements eaq {
   static Codec<eap> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahf.a(ke.aG).fieldOf("alias").forGetter(eap::c), ahf.a(ke.aG).fieldOf("target").forGetter(eap::d)).apply($$0, eap::new)
   );

   @Override
   public void a(auu $$0, BiConsumer<ahf<eao>, ahf<eao>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ahf<eao>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<eap> b() {
      return a;
   }
}
