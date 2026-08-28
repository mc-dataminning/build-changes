import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class bjb extends bhu {
   public bjb(Schema $$0) {
      super($$0, false, "RemoveEmptyItemInSuspiciousBlockFix", biz.s, "minecraft:brushable_block");
   }

   @Override
   protected <T> Dynamic<T> a(Dynamic<T> $$0) {
      Optional<Dynamic<T>> $$1 = $$0.get("item").result();
      return $$1.isPresent() && b($$1.get()) ? $$0.remove("item") : $$0;
   }

   private static boolean b(Dynamic<?> $$0) {
      String $$1 = bku.a($$0.get("id").asString("minecraft:air"));
      int $$2 = $$0.get("count").asInt(0);
      return $$1.equals("minecraft:air") || $$2 == 0;
   }
}
