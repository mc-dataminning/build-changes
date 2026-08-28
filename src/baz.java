import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class baz extends bgr {
   public baz(Schema $$0) {
      super($$0, false, "AreaEffectCloudPotionFix", bhw.B, "minecraft:area_effect_cloud");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }

   private <T> Dynamic<T> a(Dynamic<T> $$0) {
      Optional<Dynamic<T>> $$1 = $$0.get("Color").result();
      Optional<Dynamic<T>> $$2 = $$0.get("effects").result();
      Optional<Dynamic<T>> $$3 = $$0.get("Potion").result();
      $$0 = $$0.remove("Color").remove("effects").remove("Potion");
      if ($$1.isEmpty() && $$2.isEmpty() && $$3.isEmpty()) {
         return $$0;
      } else {
         Dynamic<T> $$4 = $$0.emptyMap();
         if ($$1.isPresent()) {
            $$4 = $$4.set("custom_color", $$1.get());
         }

         if ($$2.isPresent()) {
            $$4 = $$4.set("custom_effects", $$2.get());
         }

         if ($$3.isPresent()) {
            $$4 = $$4.set("potion", $$3.get());
         }

         return $$0.set("potion_contents", $$4);
      }
   }
}
