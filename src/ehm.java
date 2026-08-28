import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class ehm implements eha {
   public static final Codec<ehm> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(ehm::new, egq.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), elm.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<egq> b;
   public final jq<elm> c;

   public ehm(List<egq> $$0, jq<elm> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eei<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
