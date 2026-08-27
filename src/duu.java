import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class duu implements dug {
   public static final Codec<duu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(duo.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, duu::new)
   );
   public final List<duo.a> b;

   public duu(djp $$0, djp $$1) {
      this(ImmutableList.of(duo.a(new ect($$0), $$1)));
   }

   public duu(List<duo.a> $$0) {
      this.b = $$0;
   }
}
