import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Set;

public class bjf extends DataFix {
   private static final Set<String> a = Set.of(
      "minecraft:horse",
      "minecraft:skeleton_horse",
      "minecraft:zombie_horse",
      "minecraft:donkey",
      "minecraft:mule",
      "minecraft:camel",
      "minecraft:llama",
      "minecraft:trader_llama"
   );
   private static final Set<String> b = Set.of("minecraft:pig", "minecraft:strider");
   private static final String c = "Saddle";
   private static final String d = "saddle";

   public bjf(Schema $$0) {
      super($$0, true);
   }

   protected TypeRewriteRule makeRule() {
      TaggedChoiceType<String> $$0 = this.getInputSchema().findChoiceType(bix.D);
      OpticFinder<Pair<String, ?>> $$1 = DSL.typeFinder($$0);
      Type<?> $$2 = this.getInputSchema().getType(bix.D);
      Type<?> $$3 = this.getOutputSchema().getType(bix.D);
      Type<?> $$4 = bbd.a($$2, $$2, $$3);
      return this.fixTypeEverywhereTyped("SaddleEquipmentSlotFix", $$2, $$3, $$3x -> {
         String $$4x = $$3x.getOptional($$1).<String>map(Pair::getFirst).map(bks::a).orElse("");
         Typed<?> $$5 = bbd.a($$4, $$3x);
         if (a.contains($$4x)) {
            return af.a($$5, $$3, bjf::a);
         } else {
            return b.contains($$4x) ? af.a($$5, $$3, bjf::b) : bbd.a($$3, $$3x);
         }
      });
   }

   private static Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.get("SaddleItem").result().isEmpty() ? $$0 : c($$0.renameField("SaddleItem", "saddle"));
   }

   private static Dynamic<?> b(Dynamic<?> $$0) {
      boolean $$1 = $$0.get("Saddle").asBoolean(false);
      $$0 = $$0.remove("Saddle");
      if (!$$1) {
         return $$0;
      } else {
         Dynamic<?> $$2 = $$0.emptyMap().set("id", $$0.createString("minecraft:saddle")).set("count", $$0.createInt(1));
         return c($$0.set("saddle", $$2));
      }
   }

   private static Dynamic<?> c(Dynamic<?> $$0) {
      Dynamic<?> $$1 = $$0.get("drop_chances").orElseEmptyMap().set("saddle", $$0.createFloat(2.0F));
      return $$0.set("drop_chances", $$1);
   }
}
