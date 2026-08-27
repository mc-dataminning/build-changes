import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eau(ahf<eap> c, bil<ahf<eap>> d) implements ear {
   static Codec<eau> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahf.a(ke.aG).fieldOf("alias").forGetter(eau::c), bil.b(ahf.a(ke.aG)).fieldOf("targets").forGetter(eau::d)).apply($$0, eau::new)
   );

   @Override
   public void a(auv $$0, BiConsumer<ahf<eap>, ahf<eap>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ahf<eap>)$$1x.b()));
   }

   @Override
   public Stream<ahf<eap>> a() {
      return this.d.e().stream().map(bin.b::b);
   }

   @Override
   public Codec<eau> b() {
      return a;
   }
}
