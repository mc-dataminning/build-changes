import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class fdj extends fcg {
   public static final MapCodec<fdj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(kk.a, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.b)).apply($$0, fdj::new)
   );
   private final Map<kk<?>, Boolean> b;

   private fdj(List<fec> $$0, Map<kk<?>, Boolean> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   protected dak a(dak $$0, fat $$1) {
      $$0.a(kl.q, ddo.c, $$0x -> {
         for (Entry<kk<?>, Boolean> $$1x : this.b.entrySet()) {
            boolean $$2 = $$1x.getValue();
            $$0x = $$0x.a($$1x.getKey(), !$$2);
         }

         return $$0x;
      });
      return $$0;
   }

   @Override
   public fci<fdj> b() {
      return fcj.P;
   }
}
