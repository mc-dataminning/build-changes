import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class bch extends bfd {
   public bch(Schema $$0) {
      super($$0, false, "EntityGoatMissingStateFix", bgg.B, "minecraft:goat");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), $$0x -> $$0x.set("HasLeftHorn", $$0x.createBoolean(true)).set("HasRightHorn", $$0x.createBoolean(true)));
   }
}
