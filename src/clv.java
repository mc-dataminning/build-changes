import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class clv {
   private static final Codec<civ> c = arb.a(
      jd.i.q(),
      (Function<civ, DataResult<civ>>)($$0 -> $$0 == cjd.a ? DataResult.error(() -> "Crafting result must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<cja> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(c.fieldOf("item").forGetter(cja::d), arb.a(arb.j, "count", Integer.valueOf(1)).forGetter(cja::L)).apply($$0, cja::new)
   );
   static final Codec<cja> b = arb.<civ>a(
         jd.i.q(),
         (Function<civ, DataResult<civ>>)($$0 -> $$0 == cjd.a ? DataResult.error(() -> "Empty ingredient not allowed here") : DataResult.success($$0))
      )
      .xmap(cja::new, cja::d);
}
