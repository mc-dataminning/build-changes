import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.function.UnaryOperator;

public class bce extends DataFix {
   private final String a;
   private final UnaryOperator<String> b;

   public bce(Schema $$0, String $$1, UnaryOperator<String> $$2) {
      super($$0, false);
      this.a = $$1;
      this.b = $$2;
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bis.t);
      OpticFinder<?> $$1 = $$0.findField("tag");
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped(this.a + " (ItemStack)", $$0, $$1x -> $$1x.updateTyped($$1, this::a)),
         new TypeRewriteRule[]{
            this.fixTypeEverywhereTyped(this.a + " (Entity)", this.getInputSchema().getType(bis.B), this::b),
            this.fixTypeEverywhereTyped(this.a + " (Player)", this.getInputSchema().getType(bis.b), this::b)
         }
      );
   }

   private Dynamic<?> a(Dynamic<?> $$0) {
      return (Dynamic<?>)DataFixUtils.orElse($$0.asString().result().map(this.b).map($$0::createString), $$0);
   }

   private Typed<?> a(Typed<?> $$0) {
      return $$0.update(
         DSL.remainderFinder(),
         $$0x -> $$0x.update(
               "AttributeModifiers",
               $$0xx -> (Dynamic)DataFixUtils.orElse(
                     $$0xx.asStreamOpt().result().map($$0xxx -> $$0xxx.map($$0xxxx -> $$0xxxx.update("AttributeName", this::a))).map($$0xx::createList), $$0xx
                  )
            )
      );
   }

   private Typed<?> b(Typed<?> $$0) {
      return $$0.update(
         DSL.remainderFinder(),
         $$0x -> $$0x.update(
               "Attributes",
               $$0xx -> (Dynamic)DataFixUtils.orElse(
                     $$0xx.asStreamOpt().result().map($$0xxx -> $$0xxx.map($$0xxxx -> $$0xxxx.update("Name", this::a))).map($$0xx::createList), $$0xx
                  )
            )
      );
   }
}
