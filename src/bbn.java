import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Objects;
import java.util.Optional;

public class bbn extends DataFix {
   public bbn(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder<String> $$0 = DSL.fieldFinder("id", biz.a());
      return this.fixTypeEverywhereTyped(
         "BlockEntityCustomNameToComponentFix", this.getInputSchema().getType(bhm.s), $$1 -> $$1.update(DSL.remainderFinder(), $$2 -> {
               Optional<String> $$3 = $$1.getOptional($$0);
               return $$3.isPresent() && Objects.equals($$3.get(), "minecraft:command_block") ? $$2 : bdg.a($$2);
            })
      );
   }
}
