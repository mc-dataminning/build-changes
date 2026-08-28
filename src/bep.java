import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class bep extends bji {
   public bep(Schema $$0, boolean $$1) {
      super("EntityElderGuardianSplitFix", $$0, $$1);
   }

   @Override
   protected Pair<String, Dynamic<?>> a(String $$0, Dynamic<?> $$1) {
      return Pair.of(Objects.equals($$0, "Guardian") && $$1.get("Elder").asBoolean(false) ? "ElderGuardian" : $$0, $$1);
   }
}
