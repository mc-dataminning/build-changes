import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dyi implements dxu {
   public static final Codec<dyi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dyc.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dyi::new)
   );
   public final List<dyc.a> b;

   public dyi(dmz $$0, dmz $$1) {
      this(ImmutableList.of(dyc.a(new egh($$0), $$1)));
   }

   public dyi(List<dyc.a> $$0) {
      this.b = $$0;
   }
}
