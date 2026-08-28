import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class bht extends DataFix {
   private final String a;
   private final UnaryOperator<String> b;

   public bht(Schema $$0, String $$1, UnaryOperator<String> $$2) {
      super($$0, false);
      this.a = $$1;
      this.b = $$2;
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         this.a,
         this.getInputSchema().getType(bhs.c),
         $$0 -> $$0.update(
               DSL.remainderFinder(), $$0x -> $$0x.update("Status", this::a).update("below_zero_retrogen", $$0xx -> $$0xx.update("target_status", this::a))
            )
      );
   }

   private <T> Dynamic<T> a(Dynamic<T> $$0) {
      Optional<Dynamic<T>> $$1 = $$0.asString().result().map(bjg::a).map(this.b).map($$0::createString);
      return (Dynamic<T>)DataFixUtils.orElse($$1, $$0);
   }
}
