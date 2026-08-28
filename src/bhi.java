import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bhi extends DataFix {
   private final String a;
   private final String b;
   private final String c;

   public bhi(Schema $$0, boolean $$1, String $$2, String $$3, String $$4) {
      super($$0, $$1);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         this.a,
         this.getInputSchema().getType(bhv.e),
         $$0 -> $$0.update(
               DSL.remainderFinder(), $$0x -> (Dynamic)DataFixUtils.orElse($$0x.get(this.b).result().map($$1 -> $$0x.set(this.c, $$1).remove(this.b)), $$0x)
            )
      );
   }
}
