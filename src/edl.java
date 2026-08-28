import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edl implements ecx {
   public static final Codec<edl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(edf.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, edl::new)
   );
   public final List<edf.a> b;

   public edl(drx $$0, drx $$1) {
      this(ImmutableList.of(edf.a(new elk($$0), $$1)));
   }

   public edl(List<edf.a> $$0) {
      this.b = $$0;
   }
}
