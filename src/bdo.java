import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class bdo extends bdw {
   public bdo(Schema $$0) {
      super("EntityMinecartIdentifiersFix", $$0, true);
   }

   @Override
   protected Pair<String, Typed<?>> a(String $$0, Typed<?> $$1) {
      if (!$$0.equals("Minecart")) {
         return Pair.of($$0, $$1);
      } else {
         int $$2 = ((Dynamic)$$1.getOrCreate(DSL.remainderFinder())).get("Type").asInt(0);

         String $$3 = switch ($$2) {
            case 1 -> "MinecartChest";
            case 2 -> "MinecartFurnace";
            default -> "MinecartRideable";
         };
         Type<?> $$4 = (Type<?>)this.getOutputSchema().findChoiceType(bhk.B).types().get($$3);
         return Pair.of($$3, ad.a($$1, $$4, $$0x -> $$0x.remove("Type")));
      }
   }
}
