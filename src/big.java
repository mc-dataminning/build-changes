import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

public abstract class big extends DataFix {
   private final String c;
   protected final String a;
   protected final TypeReference b;

   public big(Schema $$0, boolean $$1, String $$2, TypeReference $$3, String $$4) {
      super($$0, $$1);
      this.c = $$2;
      this.b = $$3;
      this.a = $$4;
   }

   public TypeRewriteRule makeRule() {
      OpticFinder<?> $$0 = DSL.namedChoice(this.a, this.getInputSchema().getChoiceType(this.b, this.a));
      return this.fixTypeEverywhereTyped(
         this.c,
         this.getInputSchema().getType(this.b),
         this.getOutputSchema().getType(this.b),
         $$1 -> $$1.updateTyped($$0, this.getOutputSchema().getChoiceType(this.b, this.a), this::a)
      );
   }

   protected abstract Typed<?> a(Typed<?> var1);
}
