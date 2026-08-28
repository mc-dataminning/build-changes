import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class fcj extends fbg {
   public static final MapCodec<fcj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(kj.a, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.b)).apply($$0, fcj::new)
   );
   private final Map<kj<?>, Boolean> b;

   private fcj(List<fdc> $$0, Map<kj<?>, Boolean> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   protected czn a(czn $$0, ezt $$1) {
      $$0.a(kk.q, dcr.c, $$0x -> {
         for (Entry<kj<?>, Boolean> $$1x : this.b.entrySet()) {
            boolean $$2 = $$1x.getValue();
            $$0x = $$0x.a($$1x.getKey(), !$$2);
         }

         return $$0x;
      });
      return $$0;
   }

   @Override
   public fbi<fcj> b() {
      return fbj.P;
   }
}
