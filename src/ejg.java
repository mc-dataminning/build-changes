import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejg implements eis {
   public static final Codec<ejg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(eja.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, ejg::new)
   );
   public final List<eja.a> b;

   public ejg(dxn $$0, dxn $$1) {
      this(ImmutableList.of(eja.a(new eri($$0), $$1)));
   }

   public ejg(List<eja.a> $$0) {
      this.b = $$0;
   }
}
