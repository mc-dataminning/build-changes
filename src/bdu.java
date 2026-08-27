import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bdu extends DataFix {
   public bdu(Schema $$0) {
      super($$0, false);
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0) {
      return $$0.update("banners", $$0x -> $$0x.createList($$0x.asStream().map($$0xx -> $$0xx.update("Pos", ays::a))));
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "MapBannerBlockPosFormatFix", this.getInputSchema().getType(bfa.j), $$0 -> $$0.update(DSL.remainderFinder(), $$0x -> $$0x.update("data", bdu::a))
      );
   }
}
