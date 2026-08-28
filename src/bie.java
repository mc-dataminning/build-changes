import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class bie extends DataFix {
   public bie(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   protected TypeRewriteRule makeRule() {
      Type<Pair<String, Dynamic<?>>> $$0 = DSL.named(bhx.q.typeName(), DSL.remainderType());
      if (!Objects.equals($$0, this.getInputSchema().getType(bhx.q))) {
         throw new IllegalStateException("Poi type is not what was expected.");
      } else {
         return this.fixTypeEverywhere("POI reorganization", $$0, $$0x -> $$0xx -> $$0xx.mapSecond(bie::a));
      }
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0) {
      Map<Dynamic<T>, Dynamic<T>> $$1 = Maps.newHashMap();

      for (int $$2 = 0; $$2 < 16; $$2++) {
         String $$3 = String.valueOf($$2);
         Optional<Dynamic<T>> $$4 = $$0.get($$3).result();
         if ($$4.isPresent()) {
            Dynamic<T> $$5 = $$4.get();
            Dynamic<T> $$6 = $$0.createMap(ImmutableMap.of($$0.createString("Records"), $$5));
            $$1.put($$0.createInt($$2), $$6);
            $$0 = $$0.remove($$3);
         }
      }

      return $$0.set("Sections", $$0.createMap($$1));
   }
}
