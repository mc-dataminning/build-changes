import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dul implements dtx {
   public static final Codec<dul> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(duf.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dul::new)
   );
   public final List<duf.a> b;

   public dul(djg $$0, djg $$1) {
      this(ImmutableList.of(duf.a(new eck($$0), $$1)));
   }

   public dul(List<duf.a> $$0) {
      this.b = $$0;
   }
}
