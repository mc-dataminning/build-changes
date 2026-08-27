import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dqd implements dpp {
   public static final Codec<dqd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dpx.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dqd::new)
   );
   public final List<dpx.a> b;

   public dqd(dey $$0, dey $$1) {
      this(ImmutableList.of(dpx.a(new dxv($$0), $$1)));
   }

   public dqd(List<dpx.a> $$0) {
      this.b = $$0;
   }
}
