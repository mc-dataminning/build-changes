import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bcd extends ber {
   public bcd(Schema $$0) {
      super($$0, false, "EntityPaintingFieldsRenameFix", bfs.z, "minecraft:painting");
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      return azh.a(azh.a($$0, "Motive", "variant"), "Facing", "facing");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}
