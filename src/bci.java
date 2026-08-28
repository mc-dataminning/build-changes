import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;

public class bci extends DataFix {
   public bci(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      OpticFinder<Pair<String, Pair<Either<Pair<String, String>, Unit>, Pair<Either<?, Unit>, Dynamic<?>>>>> $$0 = DSL.typeFinder(
         this.getInputSchema().getType(bhy.t)
      );
      Type<?> $$1 = this.getInputSchema().getType(bhy.B);
      return TypeRewriteRule.seq(
         this.a($$0, $$1, "minecraft:llama"),
         new TypeRewriteRule[]{this.a($$0, $$1, "minecraft:trader_llama"), this.a($$0, $$1, "minecraft:mule"), this.a($$0, $$1, "minecraft:donkey")}
      );
   }

   private TypeRewriteRule a(
      OpticFinder<Pair<String, Pair<Either<Pair<String, String>, Unit>, Pair<Either<?, Unit>, Dynamic<?>>>>> $$0, Type<?> $$1, String $$2
   ) {
      Type<?> $$3 = this.getInputSchema().getChoiceType(bhy.B, $$2);
      OpticFinder<?> $$4 = DSL.namedChoice($$2, $$3);
      OpticFinder<?> $$5 = $$3.findField("Items");
      return this.fixTypeEverywhereTyped(
         "Fix non-zero indexing in chest horse type " + $$2,
         $$1,
         $$3x -> $$3x.updateTyped(
               $$4,
               $$2xx -> $$2xx.updateTyped(
                     $$5,
                     $$1xxx -> $$1xxx.update(
                           $$0,
                           $$0xxxx -> $$0xxxx.mapSecond(
                                 $$0xxxxx -> $$0xxxxx.mapSecond(
                                       $$0xxxxxx -> $$0xxxxxx.mapSecond(
                                             $$0xxxxxxx -> $$0xxxxxxx.update("Slot", $$0xxxxxxxx -> $$0xxxxxxxx.createByte((byte)($$0xxxxxxxx.asInt(2) - 2)))
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }
}
