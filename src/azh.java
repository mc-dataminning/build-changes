import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;

public class azh extends DataFix {
   private static final Map<String, String> a = ImmutableMap.builder()
      .put("down", "down_south")
      .put("up", "up_north")
      .put("north", "north_up")
      .put("south", "south_up")
      .put("west", "west_up")
      .put("east", "east_up")
      .build();

   public azh(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   private static Dynamic<?> a(Dynamic<?> $$0) {
      Optional<String> $$1 = $$0.get("Name").asString().result();
      return $$1.equals(Optional.of("minecraft:jigsaw")) ? $$0.update("Properties", $$0x -> {
         String $$1x = $$0x.get("facing").asString("north");
         return $$0x.remove("facing").set("orientation", $$0x.createString(a.getOrDefault($$1x, $$1x)));
      }) : $$0;
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("jigsaw_rotation_fix", this.getInputSchema().getType(bat.u), $$0 -> $$0.update(DSL.remainderFinder(), azh::a));
   }
}
