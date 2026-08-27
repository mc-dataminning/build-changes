import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class ecp implements ecd {
   public static final Codec<ecp> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(ecp::new, ebt.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), egp.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<ebt> b;
   public final ix<egp> c;

   public ecp(List<ebt> $$0, ix<egp> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dzm<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
