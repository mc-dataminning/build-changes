import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class end implements emp {
   public static final Codec<end> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(emx.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, end::new)
   );
   public final List<emx.a> b;

   public end(ebe $$0, ebe $$1) {
      this(ImmutableList.of(emx.a(new evh($$0), $$1)));
   }

   public end(List<emx.a> $$0) {
      this.b = $$0;
   }
}
