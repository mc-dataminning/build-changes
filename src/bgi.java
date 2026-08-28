import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.Set;

public class bgi extends DataFix {
   private final Set<String> a;

   public bgi(Schema $$0, boolean $$1, Set<String> $$2) {
      super($$0, $$1);
      this.a = $$2;
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bit.t);
      OpticFinder<Pair<String, String>> $$1 = DSL.fieldFinder("id", DSL.named(bit.F.typeName(), bko.a()));
      OpticFinder<?> $$2 = $$0.findField("tag");
      OpticFinder<?> $$3 = $$2.type().findField("BlockEntityTag");
      return this.fixTypeEverywhereTyped("ItemRemoveBlockEntityTagFix", $$0, $$3x -> {
         Optional<Pair<String, String>> $$4 = $$3x.getOptional($$1);
         if ($$4.isPresent() && this.a.contains($$4.get().getSecond())) {
            Optional<? extends Typed<?>> $$5 = $$3x.getOptionalTyped($$2);
            if ($$5.isPresent()) {
               Typed<?> $$6 = (Typed<?>)$$5.get();
               Optional<? extends Typed<?>> $$7 = $$6.getOptionalTyped($$3);
               if ($$7.isPresent()) {
                  Optional<? extends Dynamic<?>> $$8 = $$6.write().result();
                  Dynamic<?> $$9 = (Dynamic<?>)($$8.isPresent() ? $$8.get() : (Dynamic)$$6.get(DSL.remainderFinder()));
                  Dynamic<?> $$10 = $$9.remove("BlockEntityTag");
                  Optional<? extends Pair<? extends Typed<?>, ?>> $$11 = $$2.type().readTyped($$10).result();
                  if ($$11.isEmpty()) {
                     return $$3x;
                  }

                  return $$3x.set($$2, (Typed)$$11.get().getFirst());
               }
            }
         }

         return $$3x;
      });
   }
}
