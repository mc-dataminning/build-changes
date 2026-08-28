import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.stream.Stream;

public class bef extends DataFix {
   public bef(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bgq.t);
      OpticFinder<?> $$1 = $$0.findField("tag");
      return this.fixTypeEverywhereTyped(
         "Item Lore componentize",
         $$0,
         $$1x -> $$1x.updateTyped(
               $$1,
               $$0xx -> $$0xx.update(
                     DSL.remainderFinder(),
                     $$0xxx -> $$0xxx.update(
                           "display",
                           $$0xxxx -> $$0xxxx.update(
                                 "Lore",
                                 $$0xxxxx -> (Dynamic)DataFixUtils.orElse($$0xxxxx.asStreamOpt().map(bef::a).map($$0xxxxx::createList).result(), $$0xxxxx)
                              )
                        )
                  )
            )
      );
   }

   private static <T> Stream<Dynamic<T>> a(Stream<Dynamic<T>> $$0) {
      return $$0.map(azu::a);
   }
}
