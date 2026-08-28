import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class ben extends DataFix {
   public ben(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.update(
         "pages", $$1 -> (Dynamic)DataFixUtils.orElse($$1.asStreamOpt().map($$0xx -> $$0xx.map(azn::b)).map($$0::createList).result(), $$0.emptyList())
      );
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bgh.t);
      OpticFinder<?> $$1 = $$0.findField("tag");
      return this.fixTypeEverywhereTyped(
         "ItemWrittenBookPagesStrictJsonFix", $$0, $$1x -> $$1x.updateTyped($$1, $$0xx -> $$0xx.update(DSL.remainderFinder(), this::a))
      );
   }
}
