import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eme implements elq {
   public static final Codec<eme> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ely.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, eme::new)
   );
   public final List<ely.a> b;

   public eme(eah $$0, eah $$1) {
      this(ImmutableList.of(ely.a(new euh($$0), $$1)));
   }

   public eme(List<ely.a> $$0) {
      this.b = $$0;
   }
}
