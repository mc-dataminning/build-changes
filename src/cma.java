import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class cma {
   private static final Codec<cja> c = arf.a(
      jb.i.q(),
      (Function<cja, DataResult<cja>>)($$0 -> $$0 == cji.a ? DataResult.error(() -> "Crafting result must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<cjf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(c.fieldOf("item").forGetter(cjf::d), arf.a(arf.j, "count", Integer.valueOf(1)).forGetter(cjf::L)).apply($$0, cjf::new)
   );
   static final Codec<cjf> b = arf.<cja>a(
         jb.i.q(),
         (Function<cja, DataResult<cja>>)($$0 -> $$0 == cji.a ? DataResult.error(() -> "Empty ingredient not allowed here") : DataResult.success($$0))
      )
      .xmap(cjf::new, cjf::d);
}
