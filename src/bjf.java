import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import org.slf4j.Logger;

public class bjf extends bbz {
   private static final Logger b = LogUtils.getLogger();

   public bjf(Schema $$0) {
      super($$0, biw.l);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "SavedDataUUIDFix",
         this.getInputSchema().getType(this.a),
         $$0 -> $$0.update(
               DSL.remainderFinder(),
               $$0x -> $$0x.update(
                     "data",
                     $$0xx -> $$0xx.update(
                           "Raids",
                           $$0xxx -> $$0xxx.createList(
                                 $$0xxx.asStream()
                                    .map(
                                       $$0xxxx -> $$0xxxx.update(
                                             "HeroesOfTheVillage",
                                             $$0xxxxx -> $$0xxxxx.createList(
                                                   $$0xxxxx.asStream().map($$0xxxxxx -> (Dynamic)d($$0xxxxxx, "UUIDMost", "UUIDLeast").orElseGet(() -> {
                                                         b.warn("HeroesOfTheVillage contained invalid UUIDs.");
                                                         return $$0xxxxxx;
                                                      }))
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }
}
