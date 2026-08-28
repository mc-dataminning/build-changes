import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class bio extends DataFix {
   private final String a;
   private final String b;
   private final String c;

   public bio(Schema $$0, boolean $$1, String $$2, String $$3, String $$4) {
      super($$0, $$1);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         this.a, this.getInputSchema().getType(bjd.e), $$0 -> $$0.update(DSL.remainderFinder(), $$0x -> $$0x.renameField(this.b, this.c))
      );
   }
}
