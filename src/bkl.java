import com.google.common.base.Suppliers;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import java.util.function.Supplier;

public class bkl extends bfk {
   private final Supplier<bkl.a> b = Suppliers.memoize(() -> {
      Type<?> $$0x = this.getInputSchema().getChoiceType(bjm.D, "minecraft:potion");
      Type<?> $$1 = bbq.a($$0x, this.getInputSchema().getType(bjm.D), this.getOutputSchema().getType(bjm.D));
      OpticFinder<?> $$2 = $$1.findField("Item");
      OpticFinder<Pair<String, String>> $$3 = DSL.fieldFinder("id", DSL.named(bjm.F.typeName(), blh.a()));
      return new bkl.a($$2, $$3);
   });

   public bkl(Schema $$0) {
      super("ThrownPotionSplitFix", $$0, true);
   }

   @Override
   protected Pair<String, Typed<?>> a(String $$0, Typed<?> $$1) {
      if (!$$0.equals("minecraft:potion")) {
         return Pair.of($$0, $$1);
      } else {
         String $$2 = this.b.get().a($$1);
         return "minecraft:lingering_potion".equals($$2) ? Pair.of("minecraft:lingering_potion", $$1) : Pair.of("minecraft:splash_potion", $$1);
      }
   }

   static record a(OpticFinder<?> a, OpticFinder<Pair<String, String>> b) {
      public String a(Typed<?> $$0) {
         return $$0.getOptionalTyped(this.a).flatMap($$0x -> $$0x.getOptional(this.b)).<String>map(Pair::getSecond).map(blh::a).orElse("");
      }
   }
}
