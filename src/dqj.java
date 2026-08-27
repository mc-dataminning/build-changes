import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dqj implements dpv {
   public static final Codec<dqj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dqd.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dqj::new)
   );
   public final List<dqd.a> b;

   public dqj(dfe $$0, dfe $$1) {
      this(ImmutableList.of(dqd.a(new dyb($$0), $$1)));
   }

   public dqj(List<dqd.a> $$0) {
      this.b = $$0;
   }
}
