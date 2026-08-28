import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public abstract class bgp extends DataFix {
   private final String a;
   private final String b;
   private final String c;

   public bgp(Schema $$0, String $$1, String $$2) {
      this($$0, $$1, $$2, $$2);
   }

   public bgp(Schema $$0, String $$1, String $$2, String $$3) {
      super($$0, false);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public final TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(biw.t);
      OpticFinder<?> $$1 = $$0.findField("components");
      return this.fixTypeEverywhereTyped(
         this.a, $$0, $$1x -> $$1x.updateTyped($$1, $$0xx -> $$0xx.update(DSL.remainderFinder(), $$0xxx -> $$0xxx.renameAndFixField(this.b, this.c, this::a)))
      );
   }

   protected abstract <T> Dynamic<T> a(Dynamic<T> var1);
}
