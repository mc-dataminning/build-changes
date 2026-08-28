import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class bdf extends DataFix {
   public bdf(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("ContainerBlockEntityLockPredicateFix", this.getInputSchema().findChoiceType(bia.s), bdf::a);
   }

   private static Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), $$0x -> $$0x.renameAndFixField("Lock", "lock", bgn::b));
   }
}
