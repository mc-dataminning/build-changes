import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dxm implements dwy {
   public static final Codec<dxm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dxg.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dxm::new)
   );
   public final List<dxg.a> b;

   public dxm(dme $$0, dme $$1) {
      this(ImmutableList.of(dxg.a(new efl($$0), $$1)));
   }

   public dxm(List<dxg.a> $$0) {
      this.b = $$0;
   }
}
