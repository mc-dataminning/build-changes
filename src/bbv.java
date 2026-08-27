import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import java.util.function.Function;

public class bbv extends azx {
   public bbv(Schema $$0, boolean $$1) {
      super($$0, $$1, "Villager trade fix", bax.x, "minecraft:villager");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      OpticFinder<?> $$1 = $$0.getType().findField("Offers");
      OpticFinder<?> $$2 = $$1.type().findField("Recipes");
      if (!($$2.type() instanceof ListType<?> $$4)) {
         throw new IllegalStateException("Recipes are expected to be a list.");
      } else {
         Type<?> $$5 = $$4.getElement();
         OpticFinder<?> $$6 = DSL.typeFinder($$5);
         OpticFinder<?> $$7 = $$5.findField("buy");
         OpticFinder<?> $$8 = $$5.findField("buyB");
         OpticFinder<?> $$9 = $$5.findField("sell");
         OpticFinder<Pair<String, String>> $$10 = DSL.fieldFinder("id", DSL.named(bax.z.typeName(), bcf.a()));
         Function<Typed<?>, Typed<?>> $$11 = $$1x -> this.a($$10, $$1x);
         return $$0.updateTyped(
            $$1,
            $$6x -> $$6x.updateTyped(
                  $$2, $$5xx -> $$5xx.updateTyped($$6, $$4xxx -> $$4xxx.updateTyped($$7, $$11).updateTyped($$8, $$11).updateTyped($$9, $$11))
               )
         );
      }
   }

   private Typed<?> a(OpticFinder<Pair<String, String>> $$0, Typed<?> $$1) {
      return $$1.update($$0, $$0x -> $$0x.mapSecond($$0xx -> Objects.equals($$0xx, "minecraft:carved_pumpkin") ? "minecraft:pumpkin" : $$0xx));
   }
}
