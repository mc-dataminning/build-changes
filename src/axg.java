import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class axg extends axr {
   public axg(Schema $$0, boolean $$1) {
      super("EntityHorseSplitFix", $$0, $$1);
   }

   @Override
   protected Pair<String, Typed<?>> a(String $$0, Typed<?> $$1) {
      Dynamic<?> $$2 = (Dynamic<?>)$$1.get(DSL.remainderFinder());
      if (Objects.equals("EntityHorse", $$0)) {
         int $$3 = $$2.get("Type").asInt(0);

         String $$8 = switch ($$3) {
            default -> "Horse";
            case 1 -> "Donkey";
            case 2 -> "Mule";
            case 3 -> "ZombieHorse";
            case 4 -> "SkeletonHorse";
         };
         $$2.remove("Type");
         Type<?> $$9 = (Type<?>)this.getOutputSchema().findChoiceType(bat.x).types().get($$8);
         return Pair.of(
            $$8,
            (Typed)((Pair)$$1.write().flatMap($$9::readTyped).result().orElseThrow(() -> new IllegalStateException("Could not parse the new horse")))
               .getFirst()
         );
      } else {
         return Pair.of($$0, $$1);
      }
   }
}
