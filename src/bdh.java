import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class bdh extends DataFix {
   public bdh(Schema $$0) {
      super($$0, true);
   }

   private static boolean a(String $$0) {
      return $$0.equals("minecraft:boat");
   }

   private static boolean b(String $$0) {
      return $$0.equals("minecraft:chest_boat");
   }

   private static boolean c(String $$0) {
      return a($$0) || b($$0);
   }

   private static String d(String $$0) {
      return switch ($$0) {
         case "spruce" -> "minecraft:spruce_boat";
         case "birch" -> "minecraft:birch_boat";
         case "jungle" -> "minecraft:jungle_boat";
         case "acacia" -> "minecraft:acacia_boat";
         case "cherry" -> "minecraft:cherry_boat";
         case "dark_oak" -> "minecraft:dark_oak_boat";
         case "mangrove" -> "minecraft:mangrove_boat";
         case "bamboo" -> "minecraft:bamboo_raft";
         default -> "minecraft:oak_boat";
      };
   }

   private static String e(String $$0) {
      return switch ($$0) {
         case "spruce" -> "minecraft:spruce_chest_boat";
         case "birch" -> "minecraft:birch_chest_boat";
         case "jungle" -> "minecraft:jungle_chest_boat";
         case "acacia" -> "minecraft:acacia_chest_boat";
         case "cherry" -> "minecraft:cherry_chest_boat";
         case "dark_oak" -> "minecraft:dark_oak_chest_boat";
         case "mangrove" -> "minecraft:mangrove_chest_boat";
         case "bamboo" -> "minecraft:bamboo_chest_raft";
         default -> "minecraft:oak_chest_boat";
      };
   }

   public TypeRewriteRule makeRule() {
      OpticFinder<String> $$0 = DSL.fieldFinder("id", bkl.a());
      Type<?> $$1 = this.getInputSchema().getType(bix.B);
      Type<?> $$2 = this.getOutputSchema().getType(bix.B);
      return this.fixTypeEverywhereTyped("BoatSplitFix", $$1, $$2, $$2x -> {
         Optional<String> $$3 = $$2x.getOptional($$0);
         if ($$3.isPresent() && c($$3.get())) {
            Dynamic<?> $$4 = (Dynamic<?>)$$2x.getOrCreate(DSL.remainderFinder());
            Optional<String> $$5 = $$4.get("Type").asString().result();
            String $$6;
            if (b($$3.get())) {
               $$6 = $$5.map(bdh::e).orElse("minecraft:oak_chest_boat");
            } else {
               $$6 = $$5.map(bdh::d).orElse("minecraft:oak_boat");
            }

            return bbu.a($$2, $$2x).update(DSL.remainderFinder(), $$0xx -> $$0xx.remove("Type")).set($$0, $$6);
         } else {
            return bbu.a($$2, $$2x);
         }
      });
   }
}
