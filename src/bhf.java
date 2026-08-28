import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import org.slf4j.Logger;

public class bhf extends bbh {
   private static final Logger b = LogUtils.getLogger();

   public bhf(Schema $$0) {
      super($$0, bit.a);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(this.a);
      OpticFinder<?> $$1 = $$0.findField("CustomBossEvents");
      OpticFinder<?> $$2 = DSL.typeFinder(DSL.and(DSL.optional(DSL.field("Name", this.getInputSchema().getTypeRaw(bit.z))), DSL.remainderType()));
      return this.fixTypeEverywhereTyped("LevelUUIDFix", $$0, $$2x -> $$2x.update(DSL.remainderFinder(), $$0xx -> {
            $$0xx = this.c($$0xx);
            return this.b($$0xx);
         }).updateTyped($$1, $$1xx -> $$1xx.updateTyped($$2, $$0xxx -> $$0xxx.update(DSL.remainderFinder(), this::d))));
   }

   private Dynamic<?> b(Dynamic<?> $$0) {
      return a($$0, "WanderingTraderId", "WanderingTraderId").orElse($$0);
   }

   private Dynamic<?> c(Dynamic<?> $$0) {
      return $$0.update(
         "DimensionData",
         $$0x -> $$0x.updateMapValues(
               $$0xx -> $$0xx.mapSecond($$0xxx -> $$0xxx.update("DragonFight", $$0xxxx -> c($$0xxxx, "DragonUUID", "Dragon").orElse($$0xxxx)))
            )
      );
   }

   private Dynamic<?> d(Dynamic<?> $$0) {
      return $$0.update("Players", $$1 -> $$0.createList($$1.asStream().map($$0xx -> (Dynamic)a($$0xx).orElseGet(() -> {
               b.warn("CustomBossEvents contains invalid UUIDs.");
               return $$0xx;
            }))));
   }
}
