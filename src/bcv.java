import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bcv extends bhr {
   public bcv(Schema $$0, boolean $$1) {
      super($$0, $$1, "CatTypeFix", bix.D, "minecraft:cat");
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.get("CatType").asInt(0) == 9 ? $$0.set("CatType", $$0.createInt(10)) : $$0;
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}
