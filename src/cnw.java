import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class cnw {
   private static final Codec<ckw> c = asq.a(
      jy.i.q(),
      (Function<ckw, DataResult<ckw>>)($$0 -> $$0 == cle.a ? DataResult.error(() -> "Crafting result must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<clb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(c.fieldOf("item").forGetter(clb::d), asq.a(asq.j, "count", Integer.valueOf(1)).forGetter(clb::L)).apply($$0, clb::new)
   );
   static final Codec<clb> b = asq.<ckw>a(
         jy.i.q(),
         (Function<ckw, DataResult<ckw>>)($$0 -> $$0 == cle.a ? DataResult.error(() -> "Empty ingredient not allowed here") : DataResult.success($$0))
      )
      .xmap(clb::new, clb::d);
}
