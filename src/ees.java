import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ees implements eee {
   public static final Codec<ees> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(eem.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, ees::new)
   );
   public final List<eem.a> b;

   public ees(dta $$0, dta $$1) {
      this(ImmutableList.of(eem.a(new ems($$0), $$1)));
   }

   public ees(List<eem.a> $$0) {
      this.b = $$0;
   }
}
