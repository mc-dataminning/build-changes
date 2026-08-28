import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record elf(bpb<List<elb>> c) implements elb {
   static MapCodec<elf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bpb.b(Codec.list(elb.b)).fieldOf("groups").forGetter(elf::c)).apply($$0, elf::new));

   @Override
   public void a(ayw $$0, BiConsumer<akq<ekz>, akq<ekz>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<akq<ekz>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(elb::a);
   }

   @Override
   public MapCodec<elf> b() {
      return a;
   }
}
