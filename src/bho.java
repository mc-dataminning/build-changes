import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class bho extends bgt {
   public bho(Schema $$0) {
      super($$0, false, "PlayerHeadBlockProfileFix", bhy.s, "minecraft:skull");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }

   private <T> Dynamic<T> a(Dynamic<T> $$0) {
      Optional<Dynamic<T>> $$1 = $$0.get("SkullOwner").result();
      Optional<Dynamic<T>> $$2 = $$0.get("ExtraType").result();
      Optional<Dynamic<T>> $$3 = $$1.or(() -> $$2);
      if ($$3.isEmpty()) {
         return $$0;
      } else {
         $$0 = $$0.remove("SkullOwner").remove("ExtraType");
         return $$0.set("profile", bfs.a($$3.get()));
      }
   }
}
