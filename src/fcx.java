import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class fcx extends fbu {
   public static final MapCodec<fcx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(kj.a, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.b)).apply($$0, fcx::new)
   );
   private final Map<kj<?>, Boolean> b;

   private fcx(List<fdq> $$0, Map<kj<?>, Boolean> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   protected czy a(czy $$0, fah $$1) {
      $$0.a(kk.q, ddc.c, $$0x -> {
         for (Entry<kj<?>, Boolean> $$1x : this.b.entrySet()) {
            boolean $$2 = $$1x.getValue();
            $$0x = $$0x.a($$1x.getKey(), !$$2);
         }

         return $$0x;
      });
      return $$0;
   }

   @Override
   public fbw<fcx> b() {
      return fbx.P;
   }
}
