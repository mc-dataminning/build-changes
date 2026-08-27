import com.google.common.collect.Lists;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Objects;

public class axn extends DataFix {
   private static final List<String> a = Lists.newArrayList(new String[]{"MinecartRideable", "MinecartChest", "MinecartFurnace"});

   public axn(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType<String> $$0 = this.getInputSchema().findChoiceType(bax.x);
      TaggedChoiceType<String> $$1 = this.getOutputSchema().findChoiceType(bax.x);
      return this.fixTypeEverywhere(
         "EntityMinecartIdentifiersFix",
         $$0,
         $$1,
         $$2 -> $$3 -> {
               if (!Objects.equals($$3.getFirst(), "Minecart")) {
                  return $$3;
               } else {
                  Typed<? extends Pair<String, ?>> $$4 = (Typed<? extends Pair<String, ?>>)$$0.point($$2, "Minecart", $$3.getSecond())
                     .orElseThrow(IllegalStateException::new);
                  Dynamic<?> $$5 = (Dynamic<?>)$$4.getOrCreate(DSL.remainderFinder());
                  int $$6 = $$5.get("Type").asInt(0);
                  String $$7;
                  if ($$6 > 0 && $$6 < a.size()) {
                     $$7 = a.get($$6);
                  } else {
                     $$7 = "MinecartRideable";
                  }

                  return Pair.of(
                     $$7,
                     (DataResult)$$4.write()
                        .map($$2xx -> ((Type)$$1.types().get($$7)).read($$2xx))
                        .result()
                        .orElseThrow(() -> new IllegalStateException("Could not read the new minecart."))
                  );
               }
            }
      );
   }
}
