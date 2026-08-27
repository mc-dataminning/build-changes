import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Objects;

public class avy extends azj {
   public static final Map<String, String> a = ImmutableMap.builder().put("minecraft:puffer_fish_spawn_egg", "minecraft:pufferfish_spawn_egg").build();

   public avy(Schema $$0, boolean $$1) {
      super("EntityPufferfishRenameFix", $$0, $$1);
   }

   @Override
   protected String a(String $$0) {
      return Objects.equals("minecraft:puffer_fish", $$0) ? "minecraft:pufferfish" : $$0;
   }
}
