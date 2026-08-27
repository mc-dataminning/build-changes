import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Objects;

public class awh extends azc {
   public static final Map<String, String> a = ImmutableMap.builder().put("minecraft:zombie_pigman_spawn_egg", "minecraft:zombified_piglin_spawn_egg").build();

   public awh(Schema $$0) {
      super("EntityZombifiedPiglinRenameFix", $$0, true);
   }

   @Override
   protected String a(String $$0) {
      return Objects.equals("minecraft:zombie_pigman", $$0) ? "minecraft:zombified_piglin" : $$0;
   }
}
