import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bec extends bgv {
   public bec(Schema $$0) {
      super($$0, false, "EntityPaintingFieldsRenameFix", bia.B, "minecraft:painting");
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.renameField("Motive", "variant").renameField("Facing", "facing");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}
