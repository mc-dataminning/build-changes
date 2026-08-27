import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ebv implements ebh {
   public static final Codec<ebv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ebp.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, ebv::new)
   );
   public final List<ebp.a> b;

   public ebv(dqh $$0, dqh $$1) {
      this(ImmutableList.of(ebp.a(new eju($$0), $$1)));
   }

   public ebv(List<ebp.a> $$0) {
      this.b = $$0;
   }
}
