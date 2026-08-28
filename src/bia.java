import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.function.Function;

public class bia extends DataFix {
   final String a;
   final Map<String, String> b;

   public bia(Schema $$0, String $$1, Map<String, String> $$2) {
      super($$0, false);
      this.a = $$1;
      this.b = $$2;
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bhw.t);
      OpticFinder<?> $$1 = $$0.findField("tag");
      return this.fixTypeEverywhereTyped(this.a, $$0, $$1x -> $$1x.updateTyped($$1, $$0xx -> $$0xx.update(DSL.remainderFinder(), this::a)));
   }

   private Dynamic<?> a(Dynamic<?> $$0) {
      $$0 = this.a($$0, "Enchantments");
      return this.a($$0, "StoredEnchantments");
   }

   private Dynamic<?> a(Dynamic<?> $$0, String $$1) {
      return $$0.update(
         $$1,
         $$0x -> (Dynamic)$$0x.asStreamOpt()
               .map(
                  $$0xx -> $$0xx.map(
                        $$0xxx -> $$0xxx.update(
                              "id",
                              $$1x -> (Dynamic)$$1x.asString()
                                    .map($$1xx -> $$0xxx.createString(this.b.getOrDefault(bjk.a($$1xx), $$1xx)))
                                    .mapOrElse(Function.identity(), $$1xx -> $$1x)
                           )
                     )
               )
               .map($$0x::createList)
               .mapOrElse(Function.identity(), $$1x -> $$0x)
      );
   }
}
