import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class bdx extends bei {
   public bdx(Schema $$0, boolean $$1) {
      super("EntityHorseSplitFix", $$0, $$1);
   }

   @Override
   protected Pair<String, Typed<?>> a(String $$0, Typed<?> $$1) {
      if (Objects.equals("EntityHorse", $$0)) {
         Dynamic<?> $$2 = (Dynamic<?>)$$1.get(DSL.remainderFinder());
         int $$3 = $$2.get("Type").asInt(0);

         String $$4 = switch ($$3) {
            case 1 -> "Donkey";
            case 2 -> "Mule";
            case 3 -> "ZombieHorse";
            case 4 -> "SkeletonHorse";
            default -> "Horse";
         };
         Type<?> $$5 = (Type<?>)this.getOutputSchema().findChoiceType(bhy.B).types().get($$4);
         return Pair.of($$4, ae.a($$1, $$5, $$0x -> $$0x.remove("Type")));
      } else {
         return Pair.of($$0, $$1);
      }
   }
}
