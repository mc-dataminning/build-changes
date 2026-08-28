import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class biv extends bgn {
   private static final String a = "CanPickUpLoot";

   public biv(Schema $$0) {
      super($$0, true, "Villager CanPickUpLoot default value", bhs.B, "Villager");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), biv::a);
   }

   private static Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.set("CanPickUpLoot", $$0.createBoolean(true));
   }
}
