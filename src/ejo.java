import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejo implements eja {
   public static final Codec<ejo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(eji.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, ejo::new)
   );
   public final List<eji.a> b;

   public ejo(dxv $$0, dxv $$1) {
      this(ImmutableList.of(eji.a(new erq($$0), $$1)));
   }

   public ejo(List<eji.a> $$0) {
      this.b = $$0;
   }
}
