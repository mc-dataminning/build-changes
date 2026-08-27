import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public abstract class baw extends DataFix {
   private final String a;
   private final String b;
   private final TypeReference c;

   public baw(Schema $$0, boolean $$1, String $$2, TypeReference $$3, String $$4) {
      super($$0, $$1);
      this.a = $$2;
      this.c = $$3;
      this.b = $$4;
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(this.c);
      Type<?> $$1 = this.getInputSchema().getChoiceType(this.c, this.b);
      Type<?> $$2 = this.getOutputSchema().getType(this.c);
      Type<?> $$3 = this.getOutputSchema().getChoiceType(this.c, this.b);
      OpticFinder<?> $$4 = DSL.namedChoice(this.b, $$1);
      return this.fixTypeEverywhereTyped(this.a, $$0, $$2, $$2x -> $$2x.updateTyped($$4, $$3, $$1xx -> ac.a($$1xx, $$3, this::a)));
   }

   protected abstract <T> Dynamic<T> a(Dynamic<T> var1);
}
