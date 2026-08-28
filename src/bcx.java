import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class bcx extends DataFix {
   public bcx(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("ContainerBlockEntityLockPredicateFix", this.getInputSchema().findChoiceType(bhy.s), bcx::a);
   }

   private static Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), $$0x -> $$0x.renameAndFixField("Lock", "lock", bgl::b));
   }
}
