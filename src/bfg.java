import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bfg extends bhp {
   public bfg(Schema $$0, boolean $$1) {
      super($$0, $$1, "EntityWolfColorFix", bit.D, "minecraft:wolf");
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.update("CollarColor", $$0x -> $$0x.createByte((byte)(15 - $$0x.asInt(0))));
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}
