import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class cne {
   private static final Codec<cke> c = asg.a(
      jy.i.q(),
      (Function<cke, DataResult<cke>>)($$0 -> $$0 == ckm.a ? DataResult.error(() -> "Crafting result must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<ckj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(c.fieldOf("item").forGetter(ckj::d), asg.a(asg.j, "count", Integer.valueOf(1)).forGetter(ckj::L)).apply($$0, ckj::new)
   );
   static final Codec<ckj> b = asg.<cke>a(
         jy.i.q(),
         (Function<cke, DataResult<cke>>)($$0 -> $$0 == ckm.a ? DataResult.error(() -> "Empty ingredient not allowed here") : DataResult.success($$0))
      )
      .xmap(ckj::new, ckj::d);
}
