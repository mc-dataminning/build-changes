import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class bju extends DataFix {
   public bju(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      Type<Pair<String, Either<?, Pair<?, Pair<?, Pair<?, Dynamic<?>>>>>>> $$0 = this.getInputSchema().getType(biw.z);
      return this.fixTypeEverywhere(
         "TextComponentStringyFlagsFix",
         $$0,
         $$0x -> $$0xx -> $$0xx.mapSecond(
                  $$0xxx -> $$0xxx.mapRight(
                        $$0xxxx -> $$0xxxx.mapSecond(
                              $$0xxxxx -> $$0xxxxx.mapSecond(
                                    $$0xxxxxx -> $$0xxxxxx.mapSecond(
                                          $$0xxxxxxx -> $$0xxxxxxx.update("bold", bju::a)
                                                .update("italic", bju::a)
                                                .update("underlined", bju::a)
                                                .update("strikethrough", bju::a)
                                                .update("obfuscated", bju::a)
                                       )
                                 )
                           )
                     )
               )
      );
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0) {
      Optional<String> $$1 = $$0.asString().result();
      return $$1.isPresent() ? $$0.createBoolean(Boolean.parseBoolean($$1.get())) : $$0;
   }
}
