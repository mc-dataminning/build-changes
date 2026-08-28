import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class fce extends fbb {
   public static final MapCodec<fce> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(kj.a, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.b)).apply($$0, fce::new)
   );
   private final Map<kj<?>, Boolean> b;

   private fce(List<fcx> $$0, Map<kj<?>, Boolean> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   protected czk a(czk $$0, ezo $$1) {
      $$0.a(kk.q, dco.c, $$0x -> {
         for (Entry<kj<?>, Boolean> $$1x : this.b.entrySet()) {
            boolean $$2 = $$1x.getValue();
            $$0x = $$0x.a($$1x.getKey(), !$$2);
         }

         return $$0x;
      });
      return $$0;
   }

   @Override
   public fbd<fce> b() {
      return fbe.P;
   }
}
