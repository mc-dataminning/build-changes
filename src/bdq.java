import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bdq extends DataFix {
   private final String a;
   private final String b;
   private final String c;

   public bdq(Schema $$0, String $$1, String $$2) {
      this($$0, $$1, $$2, $$2);
   }

   public bdq(Schema $$0, String $$1, String $$2, String $$3) {
      super($$0, false);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public final TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bix.w);
      return this.fixTypeEverywhereTyped(this.a, $$0, $$0x -> $$0x.update(DSL.remainderFinder(), $$0xx -> {
            Optional<? extends Dynamic<?>> $$1 = $$0xx.get(this.b).result();
            if ($$1.isEmpty()) {
               return $$0xx;
            } else {
               Dynamic<?> $$2 = this.a($$1.get());
               return $$0xx.remove(this.b).setFieldIfPresent(this.c, Optional.ofNullable($$2));
            }
         }));
   }

   @Nullable
   protected abstract <T> Dynamic<T> a(Dynamic<T> var1);
}
