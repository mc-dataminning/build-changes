import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import java.util.Map;

public class bjc extends DataFix {
   private final String a;
   private final Map<String, String> b;

   public bjc(Schema $$0, String $$1, Map<String, String> $$2) {
      super($$0, false);
      this.a = $$1;
      this.b = $$2;
   }

   protected TypeRewriteRule makeRule() {
      return TypeRewriteRule.seq(this.b(), this.a());
   }

   private TypeRewriteRule a() {
      Type<?> $$0 = this.getOutputSchema().getType(bin.H);
      Type<?> $$1 = this.getInputSchema().getType(bin.H);
      OpticFinder<?> $$2 = $$1.findField("CriteriaType");
      TaggedChoiceType<?> $$3 = (TaggedChoiceType<?>)$$2.type()
         .findChoiceType("type", -1)
         .orElseThrow(() -> new IllegalStateException("Can't find choice type for criteria"));
      Type<?> $$4 = (Type<?>)$$3.types().get("minecraft:custom");
      if ($$4 == null) {
         throw new IllegalStateException("Failed to find custom criterion type variant");
      } else {
         OpticFinder<?> $$5 = DSL.namedChoice("minecraft:custom", $$4);
         OpticFinder<String> $$6 = DSL.fieldFinder("id", bkb.a());
         return this.fixTypeEverywhereTyped(
            this.a,
            $$1,
            $$0,
            $$3x -> $$3x.updateTyped($$2, $$2xx -> $$2xx.updateTyped($$5, $$1xxx -> $$1xxx.update($$6, $$0xxxx -> this.b.getOrDefault($$0xxxx, $$0xxxx))))
         );
      }
   }

   private TypeRewriteRule b() {
      Type<?> $$0 = this.getOutputSchema().getType(bin.g);
      Type<?> $$1 = this.getInputSchema().getType(bin.g);
      OpticFinder<?> $$2 = $$1.findField("stats");
      OpticFinder<?> $$3 = $$2.type().findField("minecraft:custom");
      OpticFinder<String> $$4 = bkb.a().finder();
      return this.fixTypeEverywhereTyped(
         this.a,
         $$1,
         $$0,
         $$3x -> $$3x.updateTyped($$2, $$2xx -> $$2xx.updateTyped($$3, $$1xxx -> $$1xxx.update($$4, $$0xxxx -> this.b.getOrDefault($$0xxxx, $$0xxxx))))
      );
   }
}
