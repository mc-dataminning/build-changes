import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class enf implements emr {
   public static final Codec<enf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(emz.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, enf::new)
   );
   public final List<emz.a> b;

   public enf(ebg $$0, ebg $$1) {
      this(ImmutableList.of(emz.a(new evj($$0), $$1)));
   }

   public enf(List<emz.a> $$0) {
      this.b = $$0;
   }
}
