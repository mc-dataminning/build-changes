import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dqi implements dpu {
   public static final Codec<dqi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dqc.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dqi::new)
   );
   public final List<dqc.a> b;

   public dqi(dfd $$0, dfd $$1) {
      this(ImmutableList.of(dqc.a(new dya($$0), $$1)));
   }

   public dqi(List<dqc.a> $$0) {
      this.b = $$0;
   }
}
