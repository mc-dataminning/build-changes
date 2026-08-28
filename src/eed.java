import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eed implements edp {
   public static final Codec<eed> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(edx.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, eed::new)
   );
   public final List<edx.a> b;

   public eed(dsl $$0, dsl $$1) {
      this(ImmutableList.of(edx.a(new emd($$0), $$1)));
   }

   public eed(List<edx.a> $$0) {
      this.b = $$0;
   }
}
