import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eml implements elx {
   public static final Codec<eml> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(emf.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, eml::new)
   );
   public final List<emf.a> b;

   public eml(eao $$0, eao $$1) {
      this(ImmutableList.of(emf.a(new euo($$0), $$1)));
   }

   public eml(List<emf.a> $$0) {
      this.b = $$0;
   }
}
