import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eio implements eia {
   public static final Codec<eio> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(eii.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, eio::new)
   );
   public final List<eii.a> b;

   public eio(dwv $$0, dwv $$1) {
      this(ImmutableList.of(eii.a(new eqq($$0), $$1)));
   }

   public eio(List<eii.a> $$0) {
      this.b = $$0;
   }
}
