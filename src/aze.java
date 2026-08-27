import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class aze extends baq {
   public aze(Schema $$0) {
      super($$0, false, "Remove filtered text from signs", bbq.s, "minecraft:sign");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), $$0x -> $$0x.remove("FilteredText1").remove("FilteredText2").remove("FilteredText3").remove("FilteredText4"));
   }
}
