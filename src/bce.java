import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bce extends bhm {
   public bce(Schema $$0, boolean $$1) {
      super($$0, $$1, "BlockEntityKeepPacked", biq.s, "DUMMY");
   }

   private static Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.set("keepPacked", $$0.createBoolean(true));
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), bce::a);
   }
}
