import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public abstract class bbd extends DataFix {
   private final String a;

   public bbd(Schema $$0, String $$1) {
      super($$0, false);
      this.a = $$1;
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(this.a, this.getInputSchema().getType(biq.u), $$0 -> $$0.update(DSL.remainderFinder(), this::a));
   }

   private Dynamic<?> a(Dynamic<?> $$0) {
      Optional<String> $$1 = $$0.get("Name").asString().result().map(bkj::a);
      return $$1.isPresent() && this.a($$1.get()) ? $$0.update("Properties", $$1x -> this.a($$1.get(), $$1x)) : $$0;
   }

   protected abstract boolean a(String var1);

   protected abstract <T> Dynamic<T> a(String var1, Dynamic<T> var2);
}
