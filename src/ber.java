import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class ber extends bhs {
   public ber(Schema $$0) {
      super($$0, false, "EntityGoatMissingStateFix", bix.B, "minecraft:goat");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), $$0x -> $$0x.set("HasLeftHorn", $$0x.createBoolean(true)).set("HasRightHorn", $$0x.createBoolean(true)));
   }
}
