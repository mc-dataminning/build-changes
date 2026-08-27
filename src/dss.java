import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dss implements dse {
   public static final Codec<dss> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dsm.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dss::new)
   );
   public final List<dsm.a> b;

   public dss(dhn $$0, dhn $$1) {
      this(ImmutableList.of(dsm.a(new ear($$0), $$1)));
   }

   public dss(List<dsm.a> $$0) {
      this.b = $$0;
   }
}
