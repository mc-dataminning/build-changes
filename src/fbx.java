import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class fbx extends fau {
   public static final MapCodec<fbx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(ki.a, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.b)).apply($$0, fbx::new)
   );
   private final Map<ki<?>, Boolean> b;

   private fbx(List<fcq> $$0, Map<ki<?>, Boolean> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   protected czd a(czd $$0, ezh $$1) {
      $$0.a(kj.q, dch.c, $$0x -> {
         for (Entry<ki<?>, Boolean> $$1x : this.b.entrySet()) {
            boolean $$2 = $$1x.getValue();
            $$0x = $$0x.a($$1x.getKey(), !$$2);
         }

         return $$0x;
      });
      return $$0;
   }

   @Override
   public faw<fbx> b() {
      return fax.P;
   }
}
