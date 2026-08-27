import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import java.util.Objects;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class ayf extends bdh {
   private static final String a = "minecraft:wolf";
   private static final ajh b = new ajh("generic.max_health");

   public ayf(Schema $$0) {
      super($$0, false, "FixWolfHealth", beh.y, "minecraft:wolf");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(
         DSL.remainderFinder(),
         $$0x -> {
            MutableBoolean $$1 = new MutableBoolean(false);
            $$0x = $$0x.update(
               "Attributes",
               $$1x -> $$1x.createList($$1x.asStream().map($$1xx -> Objects.equals(ajh.a($$1xx.get("Name").asString("")), b) ? $$1xx.update("Base", $$1xxx -> {
                        if ($$1xxx.asDouble(0.0) == 20.0) {
                           $$1.setTrue();
                           return $$1xxx.createDouble(40.0);
                        } else {
                           return $$1xxx;
                        }
                     }) : $$1xx))
            );
            if ($$1.isTrue()) {
               $$0x = $$0x.update("Health", $$0xx -> $$0xx.createFloat($$0xx.asFloat(0.0F) * 2.0F));
            }

            return $$0x;
         }
      );
   }
}
