import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Objects;

public class beu extends bjk {
   public static final Map<String, String> a = ImmutableMap.builder().put("minecraft:illager_beast_spawn_egg", "minecraft:ravager_spawn_egg").build();

   public beu(Schema $$0, boolean $$1) {
      super("EntityRavagerRenameFix", $$0, $$1);
   }

   @Override
   protected String a(String $$0) {
      return Objects.equals("minecraft:illager_beast", $$0) ? "minecraft:ravager" : $$0;
   }
}
