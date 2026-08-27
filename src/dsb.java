import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dsb implements drn {
   public static final Codec<dsb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(drv.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dsb::new)
   );
   public final List<drv.a> b;

   public dsb(dgw $$0, dgw $$1) {
      this(ImmutableList.of(drv.a(new eaa($$0), $$1)));
   }

   public dsb(List<drv.a> $$0) {
      this.b = $$0;
   }
}
