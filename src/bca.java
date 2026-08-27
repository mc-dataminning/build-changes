import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class bca extends DataFix {
   public bca(Schema $$0) {
      super($$0, false);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder<Pair<String, Pair<Either<Pair<String, String>, Unit>, Pair<Either<?, Unit>, Dynamic<?>>>>> $$0 = DSL.typeFinder(
         this.getInputSchema().getType(bgf.t)
      );
      return this.fixTypeEverywhereTyped(
         "EmptyItemInHotbarFix", this.getInputSchema().getType(bgf.d), $$1 -> $$1.update($$0, $$0xx -> $$0xx.mapSecond($$0xxx -> {
                  Optional<String> $$1x = ((Either)$$0xxx.getFirst()).left().map(Pair::getSecond);
                  Dynamic<?> $$2 = (Dynamic<?>)((Pair)$$0xxx.getSecond()).getSecond();
                  boolean $$3 = $$1x.isEmpty() || $$1x.get().equals("minecraft:air");
                  boolean $$4 = $$2.get("Count").asInt(0) <= 0;
                  return !$$3 && !$$4 ? $$0xxx : Pair.of(Either.right(Unit.INSTANCE), Pair.of(Either.right(Unit.INSTANCE), $$2.emptyMap()));
               }))
      );
   }
}
