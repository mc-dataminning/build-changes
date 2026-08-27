import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dwr implements dwd {
   public static final Codec<dwr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dwl.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dwr::new)
   );
   public final List<dwl.a> b;

   public dwr(dlj $$0, dlj $$1) {
      this(ImmutableList.of(dwl.a(new eeq($$0), $$1)));
   }

   public dwr(List<dwl.a> $$0) {
      this.b = $$0;
   }
}
