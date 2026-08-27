import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bao extends bex {
   public bao(Schema $$0, boolean $$1) {
      super($$0, $$1, "BlockEntitySignTextStrictJsonFix", bfy.s, "Sign");
   }

   private Dynamic<?> a(Dynamic<?> $$0, String $$1) {
      return $$0.update($$1, azi::b);
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), $$0x -> {
         $$0x = this.a($$0x, "Text1");
         $$0x = this.a($$0x, "Text2");
         $$0x = this.a($$0x, "Text3");
         return this.a($$0x, "Text4");
      });
   }
}
