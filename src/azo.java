import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.function.Predicate;

public abstract class azo extends DataFix {
   private final String a;
   private final Predicate<String> b;

   public azo(Schema $$0, String $$1, Predicate<String> $$2) {
      super($$0, false);
      this.a = $$1;
      this.b = $$2;
   }

   public final TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bbg.t);
      OpticFinder<Pair<String, String>> $$1 = DSL.fieldFinder("id", DSL.named(bbg.z.typeName(), bco.a()));
      OpticFinder<?> $$2 = $$0.findField("tag");
      return this.fixTypeEverywhereTyped(
         this.a,
         $$0,
         $$2x -> {
            Optional<Pair<String, String>> $$3 = $$2x.getOptional($$1);
            return $$3.isPresent() && this.b.test((String)$$3.get().getSecond())
               ? $$2x.updateTyped($$2, $$0xx -> $$0xx.update(DSL.remainderFinder(), this::a))
               : $$2x;
         }
      );
   }

   protected abstract <T> Dynamic<T> a(Dynamic<T> var1);
}
