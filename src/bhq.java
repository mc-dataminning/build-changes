import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class bhq extends bhr {
   public bhq(Schema $$0, String $$1, TypeReference $$2, String $$3) {
      super($$0, true, $$1, $$2, $$3);
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      Type<?> $$1 = this.getOutputSchema().getChoiceType(this.b, this.a);
      return bbd.a($$1, $$0);
   }
}
