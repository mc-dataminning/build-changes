import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;

public class bib extends DataFix {
   public bib(Schema $$0) {
      super($$0, false);
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bjb.s);
      Type<?> $$1 = this.getInputSchema().getType(bjb.t);
      TaggedChoiceType<?> $$2 = this.getInputSchema().findChoiceType(bjb.s);
      OpticFinder<Pair<String, String>> $$3 = DSL.fieldFinder("id", DSL.named(bjb.F.typeName(), bkw.a()));
      OpticFinder<?> $$4 = $$0.findField("components");
      OpticFinder<?> $$5 = $$1.findField("components");
      OpticFinder<?> $$6 = $$4.type().findField("minecraft:item_name");
      OpticFinder<Pair<String, String>> $$7 = DSL.typeFinder(this.getInputSchema().getType(bjb.z));
      return TypeRewriteRule.seq(this.fixTypeEverywhereTyped("Ominous Banner block entity common rarity to uncommon rarity fix", $$0, $$4x -> {
         Object $$5x = ((Pair)$$4x.get($$2.finder())).getFirst();
         return $$5x.equals("minecraft:banner") ? this.a($$4x, $$4, $$6, $$7) : $$4x;
      }), this.fixTypeEverywhereTyped("Ominous Banner item stack common rarity to uncommon rarity fix", $$1, $$4x -> {
         String $$5x = $$4x.getOptional($$3).<String>map(Pair::getSecond).orElse("");
         return $$5x.equals("minecraft:white_banner") ? this.a($$4x, $$5, $$6, $$7) : $$4x;
      }));
   }

   private Typed<?> a(Typed<?> $$0, OpticFinder<?> $$1, OpticFinder<?> $$2, OpticFinder<Pair<String, String>> $$3) {
      return $$0.updateTyped(
         $$1,
         $$2x -> {
            boolean $$3x = $$2x.getOptionalTyped($$2)
               .flatMap($$1xx -> $$1xx.getOptional($$3))
               .<String>map(Pair::getSecond)
               .flatMap(bbg::d)
               .filter($$0xx -> $$0xx.equals("block.minecraft.ominous_banner"))
               .isPresent();
            return $$3x
               ? $$2x.updateTyped($$2, $$1xx -> $$1xx.set($$3, Pair.of(bjb.z.typeName(), bbg.b("block.minecraft.ominous_banner"))))
                  .update(DSL.remainderFinder(), $$0xx -> $$0xx.set("minecraft:rarity", $$0xx.createString("uncommon")))
               : $$2x;
         }
      );
   }
}
