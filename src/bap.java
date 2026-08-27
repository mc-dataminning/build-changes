import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import org.slf4j.Logger;

public class bap extends awa {
   private static final Logger b = LogUtils.getLogger();

   public bap(Schema $$0) {
      super($$0, bbv.a);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "LevelUUIDFix",
         this.getInputSchema().getType(this.a),
         $$0 -> $$0.updateTyped(DSL.remainderFinder(), $$0x -> $$0x.update(DSL.remainderFinder(), $$0xx -> {
                  $$0xx = this.d($$0xx);
                  $$0xx = this.c($$0xx);
                  return this.b($$0xx);
               }))
      );
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
      return $$0.update(
         "CustomBossEvents",
         $$0x -> $$0x.updateMapValues(
               $$0xx -> $$0xx.mapSecond(
                     $$0xxx -> $$0xxx.update("Players", $$1 -> $$0xxx.createList($$1.asStream().map($$0xxxxx -> (Dynamic)a($$0xxxxx).orElseGet(() -> {
                                 b.warn("CustomBossEvents contains invalid UUIDs.");
                                 return $$0xxxxx;
                              }))))
                  )
            )
      );
   }
}
