import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dus implements dug {
   public static final Codec<dus> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dus::new, dtw.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), dys.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dtw> b;
   public final ih<dys> c;

   public dus(List<dtw> $$0, ih<dys> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<drp<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
