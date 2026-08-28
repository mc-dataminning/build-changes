import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eio implements eic {
   public static final Codec<eio> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(eio::new, ehs.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), emq.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<ehs> b;
   public final jr<emq> c;

   public eio(List<ehs> $$0, jr<emq> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<efk<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
