import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class fcz extends fbw {
   public static final MapCodec<fcz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(kk.a, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.b)).apply($$0, fcz::new)
   );
   private final Map<kk<?>, Boolean> b;

   private fcz(List<fds> $$0, Map<kk<?>, Boolean> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   protected daa a(daa $$0, faj $$1) {
      $$0.a(kl.q, dde.c, $$0x -> {
         for (Entry<kk<?>, Boolean> $$1x : this.b.entrySet()) {
            boolean $$2 = $$1x.getValue();
            $$0x = $$0x.a($$1x.getKey(), !$$2);
         }

         return $$0x;
      });
      return $$0;
   }

   @Override
   public fby<fcz> b() {
      return fbz.P;
   }
}
