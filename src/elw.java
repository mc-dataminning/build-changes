import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class elw implements eli {
   public static final Codec<elw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(elq.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, elw::new)
   );
   public final List<elq.a> b;

   public elw(dzz $$0, dzz $$1) {
      this(ImmutableList.of(elq.a(new etz($$0), $$1)));
   }

   public elw(List<elq.a> $$0) {
      this.b = $$0;
   }
}
