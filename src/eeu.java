import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eeu implements eei {
   public static final Codec<eeu> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(eeu::new, edy.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eiv.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<edy> b;
   public final jm<eiv> c;

   public eeu(List<edy> $$0, jm<eiv> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ebq<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
