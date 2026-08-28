import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eev implements eeh {
   public static final Codec<eev> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(eep.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, eev::new)
   );
   public final List<eep.a> b;

   public eev(dtc $$0, dtc $$1) {
      this(ImmutableList.of(eep.a(new emv($$0), $$1)));
   }

   public eev(List<eep.a> $$0) {
      this.b = $$0;
   }
}
