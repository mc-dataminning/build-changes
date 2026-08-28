import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class enp implements enb {
   public static final Codec<enp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(enj.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, enp::new)
   );
   public final List<enj.a> b;

   public enp(ebq $$0, ebq $$1) {
      this(ImmutableList.of(enj.a(new evt($$0), $$1)));
   }

   public enp(List<enj.a> $$0) {
      this.b = $$0;
   }
}
