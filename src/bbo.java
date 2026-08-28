import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.UnaryOperator;

public class bbo extends DataFix {
   private final String a;
   private final UnaryOperator<String> b;

   public bbo(Schema $$0, String $$1, UnaryOperator<String> $$2) {
      super($$0, false);
      this.a = $$1;
      this.b = $$2;
   }

   protected TypeRewriteRule makeRule() {
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped(this.a + " (Components)", this.getInputSchema().getType(biq.w), this::a),
         new TypeRewriteRule[]{
            this.fixTypeEverywhereTyped(this.a + " (Entity)", this.getInputSchema().getType(biq.D), this::b),
            this.fixTypeEverywhereTyped(this.a + " (Player)", this.getInputSchema().getType(biq.b), this::b)
         }
      );
   }

   private Typed<?> a(Typed<?> $$0) {
      return $$0.update(
         DSL.remainderFinder(),
         $$0x -> $$0x.update(
               "minecraft:attribute_modifiers",
               $$0xx -> $$0xx.update(
                     "modifiers",
                     $$0xxx -> (Dynamic)DataFixUtils.orElse($$0xxx.asStreamOpt().result().map($$0xxxx -> $$0xxxx.map(this::b)).map($$0xxx::createList), $$0xxx)
                  )
            )
      );
   }

   private Typed<?> b(Typed<?> $$0) {
      return $$0.update(
         DSL.remainderFinder(),
         $$0x -> $$0x.update(
               "attributes",
               $$0xx -> (Dynamic)DataFixUtils.orElse($$0xx.asStreamOpt().result().map($$0xxx -> $$0xxx.map(this::a)).map($$0xx::createList), $$0xx)
            )
      );
   }

   private Dynamic<?> a(Dynamic<?> $$0) {
      return baz.a($$0, "id", this.b);
   }

   private Dynamic<?> b(Dynamic<?> $$0) {
      return baz.a($$0, "type", this.b);
   }
}
