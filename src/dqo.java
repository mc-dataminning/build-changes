import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dqo implements dqa {
   public static final Codec<dqo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dqi.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dqo::new)
   );
   public final List<dqi.a> b;

   public dqo(dfj $$0, dfj $$1) {
      this(ImmutableList.of(dqi.a(new dyg($$0), $$1)));
   }

   public dqo(List<dqi.a> $$0) {
      this.b = $$0;
   }
}
