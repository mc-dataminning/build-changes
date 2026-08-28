import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class bdy extends bfq {
   public bdy(Schema $$0) {
      super($$0, false, "Remove filtered text from signs", bgs.s, "minecraft:sign");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), $$0x -> $$0x.remove("FilteredText1").remove("FilteredText2").remove("FilteredText3").remove("FilteredText4"));
   }
}
