import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bcq extends bfe {
   public bcq(Schema $$0) {
      super($$0, false, "EntityPaintingFieldsRenameFix", bgf.z, "minecraft:painting");
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      return azu.a(azu.a($$0, "Motive", "variant"), "Facing", "facing");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}
