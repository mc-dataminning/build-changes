import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class bew extends bfa {
   public bew(Schema $$0, String $$1) {
      super($$0, false, "Memory expiry data fix (" + $$1 + ")", bgd.B, $$1);
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.update("Brain", this::b);
   }

   private Dynamic<?> b(Dynamic<?> $$0) {
      return $$0.update("memories", this::c);
   }

   private Dynamic<?> c(Dynamic<?> $$0) {
      return $$0.updateMapValues(this::a);
   }

   private Pair<Dynamic<?>, Dynamic<?>> a(Pair<Dynamic<?>, Dynamic<?>> $$0) {
      return $$0.mapSecond(this::d);
   }

   private Dynamic<?> d(Dynamic<?> $$0) {
      return $$0.createMap(ImmutableMap.of($$0.createString("value"), $$0));
   }
}
