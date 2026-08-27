import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.UnaryOperator;

public class awu extends DataFix {
   private final String a;
   private final String b;
   private final UnaryOperator<String> c;

   public awu(Schema $$0, String $$1, String $$2, UnaryOperator<String> $$3) {
      super($$0, false);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(this.a, this.getInputSchema().getType(bax.p), $$0 -> $$0.update(DSL.remainderFinder(), this::a));
   }

   private Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.update(
         this.b,
         $$0x -> $$0x.update(
               "criteria",
               $$0xx -> $$0xx.updateMapValues(
                     $$0xxx -> $$0xxx.mapFirst(
                           $$0xxxx -> (Dynamic)DataFixUtils.orElse($$0xxxx.asString().map($$1 -> $$0xxxx.createString(this.c.apply($$1))).result(), $$0xxxx)
                        )
                  )
            )
      );
   }
}
