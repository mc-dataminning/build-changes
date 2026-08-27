import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eid(akg<ehy> c, bnw<akg<ehy>> d) implements eia {
   static Codec<eid> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akg.a(le.aM).fieldOf("alias").forGetter(eid::c), bnw.b(akg.a(le.aM)).fieldOf("targets").forGetter(eid::d)).apply($$0, eid::new)
   );

   @Override
   public void a(ayg $$0, BiConsumer<akg<ehy>, akg<ehy>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (akg<ehy>)$$1x.b()));
   }

   @Override
   public Stream<akg<ehy>> a() {
      return this.d.e().stream().map(bny.b::b);
   }

   @Override
   public Codec<eid> b() {
      return a;
   }
}
