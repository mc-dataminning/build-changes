import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emq implements emc {
   public static final Codec<emq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(emk.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, emq::new)
   );
   public final List<emk.a> b;

   public emq(eat $$0, eat $$1) {
      this(ImmutableList.of(emk.a(new eut($$0), $$1)));
   }

   public emq(List<emk.a> $$0) {
      this.b = $$0;
   }
}
