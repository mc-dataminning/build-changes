import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class drg implements dqs {
   public static final Codec<drg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dra.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, drg::new)
   );
   public final List<dra.a> b;

   public drg(dgb $$0, dgb $$1) {
      this(ImmutableList.of(dra.a(new dyy($$0), $$1)));
   }

   public drg(List<dra.a> $$0) {
      this.b = $$0;
   }
}
