import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ean implements dzz {
   public static final Codec<ean> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(eah.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, ean::new)
   );
   public final List<eah.a> b;

   public ean(doz $$0, doz $$1) {
      this(ImmutableList.of(eah.a(new eim($$0), $$1)));
   }

   public ean(List<eah.a> $$0) {
      this.b = $$0;
   }
}
