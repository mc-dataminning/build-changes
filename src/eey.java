import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eey implements eek {
   public static final Codec<eey> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ees.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, eey::new)
   );
   public final List<ees.a> b;

   public eey(dtc $$0, dtc $$1) {
      this(ImmutableList.of(ees.a(new emy($$0), $$1)));
   }

   public eey(List<ees.a> $$0) {
      this.b = $$0;
   }
}
