import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.Function;

public class baz extends DataFix {
   private final String a;
   private final Function<String, String> b;

   public baz(Schema $$0, boolean $$1, String $$2, Function<String, String> $$3) {
      super($$0, $$1);
      this.a = $$2;
      this.b = $$3;
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         this.a, this.getInputSchema().getType(bic.p), $$0 -> $$0.update(DSL.remainderFinder(), $$0x -> $$0x.updateMapValues($$1 -> {
                  String $$2 = ((Dynamic)$$1.getFirst()).asString("");
                  return $$1.mapFirst($$2x -> $$0x.createString(this.b.apply($$2)));
               }))
      );
   }
}
