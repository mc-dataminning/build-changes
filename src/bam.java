import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class bam extends DataFix {
   private final String a;
   private final boolean b;
   private final String c;
   private final TypeReference d;

   public bam(Schema $$0, TypeReference $$1, String $$2, boolean $$3) {
      super($$0, true);
      this.b = $$3;
      this.c = $$2;
      this.a = "AddFlagIfNotPresentFix_" + this.c + "=" + this.b + " for " + $$0.getVersionKey();
      this.d = $$1;
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(this.d);
      return this.fixTypeEverywhereTyped(
         this.a,
         $$0,
         $$0x -> $$0x.update(
               DSL.remainderFinder(),
               $$0xx -> $$0xx.set(this.c, (Dynamic)DataFixUtils.orElseGet($$0xx.get(this.c).result(), () -> $$0xx.createBoolean(this.b)))
            )
      );
   }
}
