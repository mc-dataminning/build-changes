import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dyk implements dxw {
   public static final Codec<dyk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dye.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dyk::new)
   );
   public final List<dye.a> b;

   public dyk(dnb $$0, dnb $$1) {
      this(ImmutableList.of(dye.a(new egj($$0), $$1)));
   }

   public dyk(List<dye.a> $$0) {
      this.b = $$0;
   }
}
