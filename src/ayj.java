import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class ayj extends ayu {
   public ayj(Schema $$0, boolean $$1) {
      super("EntityHorseSplitFix", $$0, $$1);
   }

   @Override
   protected Pair<String, Typed<?>> a(String $$0, Typed<?> $$1) {
      Dynamic<?> $$2 = (Dynamic<?>)$$1.get(DSL.remainderFinder());
      if (Objects.equals("EntityHorse", $$0)) {
         int $$3 = $$2.get("Type").asInt(0);

         String $$4 = switch ($$3) {
            case 1 -> "Donkey";
            case 2 -> "Mule";
            case 3 -> "ZombieHorse";
            case 4 -> "SkeletonHorse";
            default -> "Horse";
         };
         $$2.remove("Type");
         Type<?> $$5 = (Type<?>)this.getOutputSchema().findChoiceType(bbw.x).types().get($$4);
         return Pair.of($$4, ac.a($$1, $$5, $$0x -> $$0x));
      } else {
         return Pair.of($$0, $$1);
      }
   }
}
