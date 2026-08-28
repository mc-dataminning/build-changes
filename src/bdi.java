import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bdi extends bgp {
   public bdi(Schema $$0, boolean $$1) {
      super($$0, $$1, "EntityArmorStandSilentFix", bhu.B, "ArmorStand");
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.get("Silent").asBoolean(false) && !$$0.get("Marker").asBoolean(false) ? $$0.remove("Silent") : $$0;
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}
