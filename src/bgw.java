import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class bgw extends bbj {
   public bgw(Schema $$0) {
      super($$0, bix.t);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder<Pair<String, String>> $$0 = DSL.fieldFinder("id", DSL.named(bix.F.typeName(), bks.a()));
      return this.fixTypeEverywhereTyped("ItemStackUUIDFix", this.getInputSchema().getType(this.a), $$1 -> {
         OpticFinder<?> $$2 = $$1.getType().findField("tag");
         return $$1.updateTyped($$2, $$2x -> $$2x.update(DSL.remainderFinder(), $$2xx -> {
               $$2xx = this.b($$2xx);
               if ($$1.getOptional($$0).map($$0xxxx -> "minecraft:player_head".equals($$0xxxx.getSecond())).orElse(false)) {
                  $$2xx = this.c($$2xx);
               }

               return $$2xx;
            }));
      });
   }

   private Dynamic<?> b(Dynamic<?> $$0) {
      return $$0.update("AttributeModifiers", $$1 -> $$0.createList($$1.asStream().map($$0xx -> (Dynamic)c($$0xx, "UUID", "UUID").orElse($$0xx))));
   }

   private Dynamic<?> c(Dynamic<?> $$0) {
      return $$0.update("SkullOwner", $$0x -> a($$0x, "Id", "Id").orElse($$0x));
   }
}
