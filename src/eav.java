import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eav(bil<List<ear>> c) implements ear {
   static Codec<eav> a = RecordCodecBuilder.create($$0 -> $$0.group(bil.b(Codec.list(ear.b)).fieldOf("groups").forGetter(eav::c)).apply($$0, eav::new));

   @Override
   public void a(auv $$0, BiConsumer<ahf<eap>, ahf<eap>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ahf<eap>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(ear::a);
   }

   @Override
   public Codec<eav> b() {
      return a;
   }
}
