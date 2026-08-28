import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bkl extends bhv {
   private static final String c = "CanPickUpLoot";

   public bkl(Schema $$0) {
      super($$0, true, "Villager CanPickUpLoot default value", bjb.D, "Villager");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), bkl::a);
   }

   private static Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.set("CanPickUpLoot", $$0.createBoolean(true));
   }
}
