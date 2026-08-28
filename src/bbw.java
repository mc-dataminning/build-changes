import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bbw extends bau {
   public bbw(Schema $$0) {
      super($$0, bhw.s);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("BlockEntityUUIDFix", this.getInputSchema().getType(this.a), $$0 -> {
         $$0 = this.a($$0, "minecraft:conduit", this::c);
         return this.a($$0, "minecraft:skull", this::b);
      });
   }

   private Dynamic<?> b(Dynamic<?> $$0) {
      return $$0.get("Owner").get().map($$0x -> a($$0x, "Id", "Id").orElse($$0x)).map($$1 -> $$0.remove("Owner").set("SkullOwner", $$1)).result().orElse($$0);
   }

   private Dynamic<?> c(Dynamic<?> $$0) {
      return b($$0, "target_uuid", "Target").orElse($$0);
   }
}
