import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class coj {
   private static final Codec<clj> c = asy.a(
      kc.i.q(),
      (Function<clj, DataResult<clj>>)($$0 -> $$0 == clr.a ? DataResult.error(() -> "Crafting result must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<clo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(c.fieldOf("item").forGetter(clo::d), asy.a(asy.j, "count", Integer.valueOf(1)).forGetter(clo::L)).apply($$0, clo::new)
   );
   static final Codec<clo> b = asy.<clj>a(
         kc.i.q(),
         (Function<clj, DataResult<clj>>)($$0 -> $$0 == clr.a ? DataResult.error(() -> "Empty ingredient not allowed here") : DataResult.success($$0))
      )
      .xmap(clo::new, clo::d);
}
