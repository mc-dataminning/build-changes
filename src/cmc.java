import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class cmc {
   private static final Codec<cjc> c = arh.a(
      jd.i.q(),
      (Function<cjc, DataResult<cjc>>)($$0 -> $$0 == cjk.a ? DataResult.error(() -> "Crafting result must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<cjh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(c.fieldOf("item").forGetter(cjh::d), arh.a(arh.j, "count", Integer.valueOf(1)).forGetter(cjh::L)).apply($$0, cjh::new)
   );
   static final Codec<cjh> b = arh.<cjc>a(
         jd.i.q(),
         (Function<cjc, DataResult<cjc>>)($$0 -> $$0 == cjk.a ? DataResult.error(() -> "Empty ingredient not allowed here") : DataResult.success($$0))
      )
      .xmap(cjh::new, cjh::d);
}
