import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Codec;
import com.mojang.serialization.OptionalDynamic;
import java.util.List;

public class bcr extends DataFix {
   private static final Codec<List<Float>> a = Codec.FLOAT.listOf();

   public bcr(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "EntityRedundantChanceTagsFix", this.getInputSchema().getType(bgd.B), $$0 -> $$0.update(DSL.remainderFinder(), $$0x -> {
               if (a($$0x.get("HandDropChances"), 2)) {
                  $$0x = $$0x.remove("HandDropChances");
               }

               if (a($$0x.get("ArmorDropChances"), 4)) {
                  $$0x = $$0x.remove("ArmorDropChances");
               }

               return $$0x;
            })
      );
   }

   private static boolean a(OptionalDynamic<?> $$0, int $$1) {
      return $$0.flatMap(a::parse).map($$1x -> $$1x.size() == $$1 && $$1x.stream().allMatch($$0xx -> $$0xx == 0.0F)).result().orElse(false);
   }
}
