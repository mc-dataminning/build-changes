import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejh implements eit {
   public static final Codec<ejh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ejb.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, ejh::new)
   );
   public final List<ejb.a> b;

   public ejh(dxo $$0, dxo $$1) {
      this(ImmutableList.of(ejb.a(new erj($$0), $$1)));
   }

   public ejh(List<ejb.a> $$0) {
      this.b = $$0;
   }
}
