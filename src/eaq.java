import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eaq(ahf<eap> c, ahf<eap> d) implements ear {
   static Codec<eaq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahf.a(ke.aG).fieldOf("alias").forGetter(eaq::c), ahf.a(ke.aG).fieldOf("target").forGetter(eaq::d)).apply($$0, eaq::new)
   );

   @Override
   public void a(auv $$0, BiConsumer<ahf<eap>, ahf<eap>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ahf<eap>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<eaq> b() {
      return a;
   }
}
