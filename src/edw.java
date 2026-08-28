import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edw implements edi {
   public static final Codec<edw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(edq.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, edw::new)
   );
   public final List<edq.a> b;

   public edw(dsh $$0, dsh $$1) {
      this(ImmutableList.of(edq.a(new elv($$0), $$1)));
   }

   public edw(List<edq.a> $$0) {
      this.b = $$0;
   }
}
