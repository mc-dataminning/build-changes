import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dqf implements dpr {
   public static final Codec<dqf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dpz.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dqf::new)
   );
   public final List<dpz.a> b;

   public dqf(dfa $$0, dfa $$1) {
      this(ImmutableList.of(dpz.a(new dxx($$0), $$1)));
   }

   public dqf(List<dpz.a> $$0) {
      this.b = $$0;
   }
}
