import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public abstract class bgr extends DataFix {
   private final String a;
   private final Predicate<String> b;

   public bgr(Schema $$0, String $$1, Predicate<String> $$2) {
      super($$0, false);
      this.a = $$1;
      this.b = $$2;
   }

   public final TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bit.t);
      return this.fixTypeEverywhereTyped(this.a, $$0, a($$0, this.b, this::a));
   }

   public static UnaryOperator<Typed<?>> a(Type<?> $$0, Predicate<String> $$1, UnaryOperator<Typed<?>> $$2) {
      OpticFinder<Pair<String, String>> $$3 = DSL.fieldFinder("id", DSL.named(bit.F.typeName(), bko.a()));
      OpticFinder<?> $$4 = $$0.findField("tag");
      return $$4x -> {
         Optional<Pair<String, String>> $$5 = $$4x.getOptional($$3);
         return $$5.isPresent() && $$1.test((String)$$5.get().getSecond()) ? $$4x.updateTyped($$4, $$2) : $$4x;
      };
   }

   protected abstract Typed<?> a(Typed<?> var1);
}
