import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eaw implements eai {
   public static final Codec<eaw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(eaq.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, eaw::new)
   );
   public final List<eaq.a> b;

   public eaw(dpi $$0, dpi $$1) {
      this(ImmutableList.of(eaq.a(new eiv($$0), $$1)));
   }

   public eaw(List<eaq.a> $$0) {
      this.b = $$0;
   }
}
