import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dng implements dms {
   public static final Codec<dng> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dna.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dng::new)
   );
   public final List<dna.a> b;

   public dng(dcb $$0, dcb $$1) {
      this(ImmutableList.of(dna.a(new duy($$0), $$1)));
   }

   public dng(List<dna.a> $$0) {
      this.b = $$0;
   }
}
