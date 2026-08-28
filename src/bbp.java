import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bbp extends DataFix {
   private final String a;
   private static final Set<String> b = Set.of("minecraft:empty", "minecraft:structure_starts", "minecraft:structure_references", "minecraft:biomes");

   public bbp(Schema $$0) {
      super($$0, false);
      this.a = "Blending Data Fix v" + $$0.getVersionKey();
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getOutputSchema().getType(bhs.c);
      return this.fixTypeEverywhereTyped(this.a, $$0, $$0x -> $$0x.update(DSL.remainderFinder(), $$0xx -> a($$0xx, $$0xx.get("__context"))));
   }

   private static Dynamic<?> a(Dynamic<?> $$0, OptionalDynamic<?> $$1) {
      $$0 = $$0.remove("blending_data");
      boolean $$2 = "minecraft:overworld".equals($$1.get("dimension").asString().result().orElse(""));
      Optional<? extends Dynamic<?>> $$3 = $$0.get("Status").result();
      if ($$2 && $$3.isPresent()) {
         String $$4 = bjg.a($$3.get().asString("empty"));
         Optional<? extends Dynamic<?>> $$5 = $$0.get("below_zero_retrogen").result();
         if (!b.contains($$4)) {
            $$0 = a($$0, 384, -64);
         } else if ($$5.isPresent()) {
            Dynamic<?> $$6 = (Dynamic<?>)$$5.get();
            String $$7 = bjg.a($$6.get("target_status").asString("empty"));
            if (!b.contains($$7)) {
               $$0 = a($$0, 256, 0);
            }
         }
      }

      return $$0;
   }

   private static Dynamic<?> a(Dynamic<?> $$0, int $$1, int $$2) {
      return $$0.set(
         "blending_data",
         $$0.createMap(Map.of($$0.createString("min_section"), $$0.createInt(ki.a($$2)), $$0.createString("max_section"), $$0.createInt(ki.a($$2 + $$1))))
      );
   }
}
