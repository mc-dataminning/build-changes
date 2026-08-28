import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class bed extends bfv {
   public bed(Schema $$0) {
      super($$0, false, "Remove filtered text from signs", bgx.s, "minecraft:sign");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), $$0x -> $$0x.remove("FilteredText1").remove("FilteredText2").remove("FilteredText3").remove("FilteredText4"));
   }
}
