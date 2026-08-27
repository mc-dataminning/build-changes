import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class cmg {
   private static final Codec<cjg> c = arj.a(
      jb.i.q(),
      (Function<cjg, DataResult<cjg>>)($$0 -> $$0 == cjo.a ? DataResult.error(() -> "Crafting result must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<cjl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(c.fieldOf("item").forGetter(cjl::d), arj.a(arj.j, "count", Integer.valueOf(1)).forGetter(cjl::L)).apply($$0, cjl::new)
   );
   static final Codec<cjl> b = arj.<cjg>a(
         jb.i.q(),
         (Function<cjg, DataResult<cjg>>)($$0 -> $$0 == cjo.a ? DataResult.error(() -> "Empty ingredient not allowed here") : DataResult.success($$0))
      )
      .xmap(cjl::new, cjl::d);
}
