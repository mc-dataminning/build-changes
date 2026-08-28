import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egi implements efu {
   public static final Codec<egi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(egc.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, egi::new)
   );
   public final List<egc.a> b;

   public egi(duo $$0, duo $$1) {
      this(ImmutableList.of(egc.a(new eoi($$0), $$1)));
   }

   public egi(List<egc.a> $$0) {
      this.b = $$0;
   }
}
