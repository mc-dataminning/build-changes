import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bik extends bgp {
   public bik(Schema $$0, boolean $$1) {
      super($$0, $$1, "StriderGravityFix", bhu.B, "minecraft:strider");
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.get("NoGravity").asBoolean(false) ? $$0.set("NoGravity", $$0.createBoolean(false)) : $$0;
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}
