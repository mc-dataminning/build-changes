import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eew implements eei {
   public static final Codec<eew> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(eeq.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, eew::new)
   );
   public final List<eeq.a> b;

   public eew(dtc $$0, dtc $$1) {
      this(ImmutableList.of(eeq.a(new emx($$0), $$1)));
   }

   public eew(List<eeq.a> $$0) {
      this.b = $$0;
   }
}
