import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class fbd extends faa {
   public static final MapCodec<fbd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(ki.a, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.b)).apply($$0, fbd::new)
   );
   private final Map<ki<?>, Boolean> b;

   private fbd(List<fbw> $$0, Map<ki<?>, Boolean> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   protected cys a(cys $$0, eyn $$1) {
      $$0.a(kj.q, dbw.c, $$0x -> {
         for (Entry<ki<?>, Boolean> $$1x : this.b.entrySet()) {
            boolean $$2 = $$1x.getValue();
            $$0x = $$0x.a($$1x.getKey(), !$$2);
         }

         return $$0x;
      });
      return $$0;
   }

   @Override
   public fac<fbd> b() {
      return fad.P;
   }
}
