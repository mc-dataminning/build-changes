import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;
import java.util.function.Supplier;

public class bnx extends bku {
   public bnx(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public static SequencedMap<String, Supplier<TypeTemplate>> a(Schema $$0) {
      SequencedMap<String, Supplier<TypeTemplate>> $$1 = new LinkedHashMap<>();
      $$1.put("minecraft:bees", () -> DSL.list(DSL.optionalFields("entity_data", biz.C.in($$0))));
      $$1.put("minecraft:block_entity_data", () -> biz.s.in($$0));
      $$1.put("minecraft:bundle_contents", () -> DSL.list(biz.t.in($$0)));
      $$1.put(
         "minecraft:can_break", () -> DSL.optionalFields("predicates", DSL.list(DSL.optionalFields("blocks", DSL.or(biz.E.in($$0), DSL.list(biz.E.in($$0))))))
      );
      $$1.put(
         "minecraft:can_place_on",
         () -> DSL.optionalFields("predicates", DSL.list(DSL.optionalFields("blocks", DSL.or(biz.E.in($$0), DSL.list(biz.E.in($$0))))))
      );
      $$1.put("minecraft:charged_projectiles", () -> DSL.list(biz.t.in($$0)));
      $$1.put("minecraft:container", () -> DSL.list(DSL.optionalFields("item", biz.t.in($$0))));
      $$1.put("minecraft:entity_data", () -> biz.C.in($$0));
      $$1.put("minecraft:pot_decorations", () -> DSL.list(biz.F.in($$0)));
      $$1.put("minecraft:food", () -> DSL.optionalFields("using_converts_to", biz.t.in($$0)));
      $$1.put("minecraft:custom_name", () -> biz.z.in($$0));
      $$1.put("minecraft:item_name", () -> biz.z.in($$0));
      $$1.put("minecraft:lore", () -> DSL.list(biz.z.in($$0)));
      $$1.put(
         "minecraft:written_book_content",
         () -> DSL.optionalFields("pages", DSL.list(DSL.or(DSL.optionalFields("raw", biz.z.in($$0), "filtered", biz.z.in($$0)), biz.z.in($$0))))
      );
      return $$1;
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(true, biz.w, () -> DSL.optionalFieldsLazy(a($$0)));
   }
}
