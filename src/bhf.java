import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class bhf extends bgb {
   public bhf(Schema $$0) {
      super($$0, "OminousBannerRenameFix", $$0x -> $$0x.equals("minecraft:white_banner"));
   }

   private <T> Dynamic<T> a(Dynamic<T> $$0) {
      return $$0.update(
         "display",
         $$0x -> $$0x.update(
               "Name",
               $$0xx -> {
                  Optional<String> $$1 = $$0xx.asString().result();
                  return $$1.isPresent()
                     ? $$0xx.createString(
                        $$1.get().replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\"")
                     )
                     : $$0xx;
               }
            )
      );
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return af.a($$0, $$0.getType(), this::a);
   }
}
