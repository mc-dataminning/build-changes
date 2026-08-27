import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dqq implements dqc {
   public static final Codec<dqq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dqk.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dqq::new)
   );
   public final List<dqk.a> b;

   public dqq(dfl $$0, dfl $$1) {
      this(ImmutableList.of(dqk.a(new dyi($$0), $$1)));
   }

   public dqq(List<dqk.a> $$0) {
      this.b = $$0;
   }
}
