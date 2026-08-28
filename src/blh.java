import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class blh extends bkr {
   public blh(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(true, biw.D, () -> DSL.and(biw.A.in($$0), DSL.optionalFields("CustomName", biw.z.in($$0), DSL.taggedChoiceLazy("id", a(), $$1))));
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerBlockEntities($$0);
      $$0.register($$1, "minecraft:beacon", () -> b($$0));
      $$0.register($$1, "minecraft:banner", () -> b($$0));
      $$0.register($$1, "minecraft:brewing_stand", () -> a($$0));
      $$0.register($$1, "minecraft:chest", () -> a($$0));
      $$0.register($$1, "minecraft:trapped_chest", () -> a($$0));
      $$0.register($$1, "minecraft:dispenser", () -> a($$0));
      $$0.register($$1, "minecraft:dropper", () -> a($$0));
      $$0.register($$1, "minecraft:enchanting_table", () -> b($$0));
      $$0.register($$1, "minecraft:furnace", () -> a($$0));
      $$0.register($$1, "minecraft:hopper", () -> a($$0));
      $$0.register($$1, "minecraft:shulker_box", () -> a($$0));
      return $$1;
   }

   public static TypeTemplate a(Schema $$0) {
      return DSL.optionalFields("Items", DSL.list(biw.t.in($$0)), "CustomName", biw.z.in($$0));
   }

   public static TypeTemplate b(Schema $$0) {
      return DSL.optionalFields("CustomName", biw.z.in($$0));
   }
}
