import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dwp implements dwd {
   public static final Codec<dwp> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dwp::new, dvt.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eap.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dvt> b;
   public final ij<eap> c;

   public dwp(List<dvt> $$0, ij<eap> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dtm<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
