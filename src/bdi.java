import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.DoubleUnaryOperator;

public class bdi extends bgt {
   private final String a;
   private final DoubleUnaryOperator b;

   public bdi(Schema $$0, String $$1, String $$2, String $$3, DoubleUnaryOperator $$4) {
      super($$0, false, $$1, bhy.B, $$2);
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }

   private Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.update("attributes", $$1 -> $$0.createList($$1.asStream().map($$0xx -> {
            String $$1x = bjm.a($$0xx.get("id").asString(""));
            if (!$$1x.equals(this.a)) {
               return $$0xx;
            } else {
               double $$2 = $$0xx.get("base").asDouble(0.0);
               return $$0xx.set("base", $$0xx.createDouble(this.b.applyAsDouble($$2)));
            }
         })));
   }
}
