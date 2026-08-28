import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class biv extends DataFix {
   public biv(Schema $$0) {
      super($$0, true);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bjb.D);
      Type<?> $$1 = this.getOutputSchema().getType(bjb.D);
      return this.fixTypeEverywhereTyped("Fix Arrow stored weapon", $$0, $$1, bbf.a(this.a("minecraft:arrow"), this.a("minecraft:spectral_arrow")));
   }

   private Function<Typed<?>, Typed<?>> a(String $$0) {
      Type<?> $$1 = this.getInputSchema().getChoiceType(bjb.D, $$0);
      Type<?> $$2 = this.getOutputSchema().getChoiceType(bjb.D, $$0);
      return a($$0, $$1, $$2);
   }

   private static <T> Function<Typed<?>, Typed<?>> a(String $$0, Type<?> $$1, Type<T> $$2) {
      OpticFinder<?> $$3 = DSL.namedChoice($$0, $$1);
      return $$2x -> $$2x.updateTyped($$3, $$2, $$1xx -> ag.a($$1xx, $$2, UnaryOperator.identity()));
   }
}
