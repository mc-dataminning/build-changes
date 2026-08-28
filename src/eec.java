import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eec implements edo {
   public static final Codec<eec> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(edw.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, eec::new)
   );
   public final List<edw.a> b;

   public eec(dsk $$0, dsk $$1) {
      this(ImmutableList.of(edw.a(new emb($$0), $$1)));
   }

   public eec(List<edw.a> $$0) {
      this.b = $$0;
   }
}
