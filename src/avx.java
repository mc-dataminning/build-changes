import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.Arrays;
import java.util.function.Function;

public class avx extends DataFix {
   public avx(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      Schema $$0 = this.getInputSchema();
      return this.fixTypeEverywhereTyped("EntityProjectileOwner", $$0.getType(ayz.x), this::a);
   }

   private Typed<?> a(Typed<?> $$0) {
      $$0 = this.a($$0, "minecraft:egg", this::d);
      $$0 = this.a($$0, "minecraft:ender_pearl", this::d);
      $$0 = this.a($$0, "minecraft:experience_bottle", this::d);
      $$0 = this.a($$0, "minecraft:snowball", this::d);
      $$0 = this.a($$0, "minecraft:potion", this::d);
      $$0 = this.a($$0, "minecraft:potion", this::c);
      $$0 = this.a($$0, "minecraft:llama_spit", this::b);
      $$0 = this.a($$0, "minecraft:arrow", this::a);
      $$0 = this.a($$0, "minecraft:spectral_arrow", this::a);
      return this.a($$0, "minecraft:trident", this::a);
   }

   private Dynamic<?> a(Dynamic<?> $$0) {
      long $$1 = $$0.get("OwnerUUIDMost").asLong(0L);
      long $$2 = $$0.get("OwnerUUIDLeast").asLong(0L);
      return this.a($$0, $$1, $$2).remove("OwnerUUIDMost").remove("OwnerUUIDLeast");
   }

   private Dynamic<?> b(Dynamic<?> $$0) {
      OptionalDynamic<?> $$1 = $$0.get("Owner");
      long $$2 = $$1.get("OwnerUUIDMost").asLong(0L);
      long $$3 = $$1.get("OwnerUUIDLeast").asLong(0L);
      return this.a($$0, $$2, $$3).remove("Owner");
   }

   private Dynamic<?> c(Dynamic<?> $$0) {
      OptionalDynamic<?> $$1 = $$0.get("Potion");
      return $$0.set("Item", $$1.orElseEmptyMap()).remove("Potion");
   }

   private Dynamic<?> d(Dynamic<?> $$0) {
      String $$1 = "owner";
      OptionalDynamic<?> $$2 = $$0.get("owner");
      long $$3 = $$2.get("M").asLong(0L);
      long $$4 = $$2.get("L").asLong(0L);
      return this.a($$0, $$3, $$4).remove("owner");
   }

   private Dynamic<?> a(Dynamic<?> $$0, long $$1, long $$2) {
      String $$3 = "OwnerUUID";
      return $$1 != 0L && $$2 != 0L ? $$0.set("OwnerUUID", $$0.createIntList(Arrays.stream(a($$1, $$2)))) : $$0;
   }

   private static int[] a(long $$0, long $$1) {
      return new int[]{(int)($$0 >> 32), (int)$$0, (int)($$1 >> 32), (int)$$1};
   }

   private Typed<?> a(Typed<?> $$0, String $$1, Function<Dynamic<?>, Dynamic<?>> $$2) {
      Type<?> $$3 = this.getInputSchema().getChoiceType(ayz.x, $$1);
      Type<?> $$4 = this.getOutputSchema().getChoiceType(ayz.x, $$1);
      return $$0.updateTyped(DSL.namedChoice($$1, $$3), $$4, $$1x -> $$1x.update(DSL.remainderFinder(), $$2));
   }
}
