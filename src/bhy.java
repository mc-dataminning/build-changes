import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;

public class bhy extends DataFix {
   public bhy(Schema $$0) {
      super($$0, false);
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(biw.s);
      Type<?> $$1 = this.getInputSchema().getType(biw.t);
      TaggedChoiceType<?> $$2 = this.getInputSchema().findChoiceType(biw.s);
      OpticFinder<Pair<String, String>> $$3 = DSL.fieldFinder("id", DSL.named(biw.D.typeName(), bkk.a()));
      OpticFinder<?> $$4 = $$0.findField("components");
      OpticFinder<?> $$5 = $$1.findField("components");
      return TypeRewriteRule.seq(this.fixTypeEverywhereTyped("Ominous Banner block entity common rarity to uncommon rarity fix", $$0, $$2x -> {
         Object $$3x = ((Pair)$$2x.get($$2.finder())).getFirst();
         return $$3x.equals("minecraft:banner") ? this.a($$2x, $$4) : $$2x;
      }), this.fixTypeEverywhereTyped("Ominous Banner item stack common rarity to uncommon rarity fix", $$1, $$2x -> {
         String $$3x = $$2x.getOptional($$3).<String>map(Pair::getSecond).orElse("");
         return $$3x.equals("minecraft:white_banner") ? this.a($$2x, $$5) : $$2x;
      }));
   }

   private Typed<?> a(Typed<?> $$0, OpticFinder<?> $$1) {
      return $$0.updateTyped(
         $$1,
         $$0x -> $$0x.update(
               DSL.remainderFinder(),
               $$0xx -> {
                  boolean $$1x = $$0xx.get("minecraft:item_name")
                     .asString()
                     .result()
                     .flatMap(bbr::a)
                     .filter($$0xxx -> $$0xxx.equals("block.minecraft.ominous_banner"))
                     .isPresent();
                  return $$1x
                     ? $$0xx.set("minecraft:rarity", $$0xx.createString("uncommon"))
                        .set("minecraft:item_name", bbr.b($$0xx.getOps(), "block.minecraft.ominous_banner"))
                     : $$0xx;
               }
            )
      );
   }
}
