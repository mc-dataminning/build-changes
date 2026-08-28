import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bix extends bgp {
   private static final String a = "CanPickUpLoot";

   public bix(Schema $$0) {
      super($$0, true, "Villager CanPickUpLoot default value", bhu.B, "Villager");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), bix::a);
   }

   private static Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.set("CanPickUpLoot", $$0.createBoolean(true));
   }
}
