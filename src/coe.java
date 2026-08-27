import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class coe {
   private static final Codec<cle> c = asu.a(
      jy.i.q(),
      (Function<cle, DataResult<cle>>)($$0 -> $$0 == clm.a ? DataResult.error(() -> "Crafting result must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<clj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(c.fieldOf("item").forGetter(clj::d), asu.a(asu.j, "count", Integer.valueOf(1)).forGetter(clj::L)).apply($$0, clj::new)
   );
   static final Codec<clj> b = asu.<cle>a(
         jy.i.q(),
         (Function<cle, DataResult<cle>>)($$0 -> $$0 == clm.a ? DataResult.error(() -> "Empty ingredient not allowed here") : DataResult.success($$0))
      )
      .xmap(clj::new, clj::d);
}
