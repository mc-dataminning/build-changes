import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bbp extends bgt {
   public bbp(Schema $$0, String $$1) {
      super($$0, false, "BlockEntityFurnaceBurnTimeFix" + $$1, bhy.s, $$1);
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      $$0 = $$0.renameField("CookTime", "cooking_time_spent");
      $$0 = $$0.renameField("CookTimeTotal", "cooking_total_time");
      $$0 = $$0.renameField("BurnTime", "lit_time_remaining");
      return $$0.setFieldIfPresent("lit_total_time", $$0.get("lit_time_remaining").result());
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}
