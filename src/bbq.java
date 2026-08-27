import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bbq extends bee {
   public bbq(Schema $$0) {
      super($$0, false, "EntityPaintingFieldsRenameFix", bff.z, "minecraft:painting");
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      return ayu.a(ayu.a($$0, "Motive", "variant"), "Facing", "facing");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}
