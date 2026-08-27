import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class bel extends bdk {
   public bel(Schema $$0) {
      super($$0, "OminousBannerRenameFix", $$0x -> $$0x.equals("minecraft:white_banner"));
   }

   @Override
   protected <T> Dynamic<T> a(Dynamic<T> $$0) {
      Optional<? extends Dynamic<?>> $$1 = $$0.get("display").result();
      if ($$1.isPresent()) {
         Dynamic<?> $$2 = (Dynamic<?>)$$1.get();
         Optional<String> $$3 = $$2.get("Name").asString().result();
         if ($$3.isPresent()) {
            String $$4 = $$3.get();
            $$4 = $$4.replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\"");
            $$2 = $$2.set("Name", $$2.createString($$4));
         }

         return $$0.set("display", $$2);
      } else {
         return $$0;
      }
   }
}
