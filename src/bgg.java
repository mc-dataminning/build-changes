import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class bgg extends DataFix {
   public bgg(Schema $$0) {
      super($$0, false);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder<?> $$0 = this.a("minecraft:vex");
      OpticFinder<?> $$1 = this.a("minecraft:phantom");
      OpticFinder<?> $$2 = this.a("minecraft:turtle");
      List<OpticFinder<?>> $$3 = List.of(
         this.a("minecraft:item_frame"), this.a("minecraft:glow_item_frame"), this.a("minecraft:painting"), this.a("minecraft:leash_knot")
      );
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped(
            "InlineBlockPosFormatFix - player", this.getInputSchema().getType(bjb.b), $$0x -> $$0x.update(DSL.remainderFinder(), this::a)
         ),
         this.fixTypeEverywhereTyped(
            "InlineBlockPosFormatFix - entity",
            this.getInputSchema().getType(bjb.D),
            $$4 -> {
               $$4 = $$4.update(DSL.remainderFinder(), this::b)
                  .updateTyped($$0, $$0xx -> $$0xx.update(DSL.remainderFinder(), this::c))
                  .updateTyped($$1, $$0xx -> $$0xx.update(DSL.remainderFinder(), this::d))
                  .updateTyped($$2, $$0xx -> $$0xx.update(DSL.remainderFinder(), this::e));

               for (OpticFinder<?> $$5 : $$3) {
                  $$4 = $$4.updateTyped($$5, $$0xx -> $$0xx.update(DSL.remainderFinder(), this::f));
               }

               return $$4;
            }
         )
      );
   }

   private OpticFinder<?> a(String $$0) {
      return DSL.namedChoice($$0, this.getInputSchema().getChoiceType(bjb.D, $$0));
   }

   private Dynamic<?> a(Dynamic<?> $$0) {
      $$0 = this.b($$0);
      Optional<Number> $$1 = $$0.get("SpawnX").asNumber().result();
      Optional<Number> $$2 = $$0.get("SpawnY").asNumber().result();
      Optional<Number> $$3 = $$0.get("SpawnZ").asNumber().result();
      if ($$1.isPresent() && $$2.isPresent() && $$3.isPresent()) {
         Dynamic<?> $$4 = $$0.createMap(Map.of($$0.createString("pos"), bbf.a($$0, $$1.get().intValue(), $$2.get().intValue(), $$3.get().intValue())));
         $$4 = Dynamic.copyField($$0, "SpawnAngle", $$4, "angle");
         $$4 = Dynamic.copyField($$0, "SpawnDimension", $$4, "dimension");
         $$4 = Dynamic.copyField($$0, "SpawnForced", $$4, "forced");
         $$0 = $$0.remove("SpawnX").remove("SpawnY").remove("SpawnZ").remove("SpawnAngle").remove("SpawnDimension").remove("SpawnForced");
         $$0 = $$0.set("respawn", $$4);
      }

      Optional<? extends Dynamic<?>> $$5 = $$0.get("enteredNetherPosition").result();
      if ($$5.isPresent()) {
         $$0 = $$0.remove("enteredNetherPosition")
            .set(
               "entered_nether_pos",
               $$0.createList(
                  Stream.of(
                     $$0.createDouble($$5.get().get("x").asDouble(0.0)),
                     $$0.createDouble($$5.get().get("y").asDouble(0.0)),
                     $$0.createDouble($$5.get().get("z").asDouble(0.0))
                  )
               )
            );
      }

      return $$0;
   }

   private Dynamic<?> b(Dynamic<?> $$0) {
      return bbf.a($$0, "SleepingX", "SleepingY", "SleepingZ", "sleeping_pos");
   }

   private Dynamic<?> c(Dynamic<?> $$0) {
      return bbf.a($$0.renameField("LifeTicks", "life_ticks"), "BoundX", "BoundY", "BoundZ", "bound_pos");
   }

   private Dynamic<?> d(Dynamic<?> $$0) {
      return bbf.a($$0.renameField("Size", "size"), "AX", "AY", "AZ", "anchor_pos");
   }

   private Dynamic<?> e(Dynamic<?> $$0) {
      $$0 = $$0.remove("TravelPosX").remove("TravelPosY").remove("TravelPosZ");
      $$0 = bbf.a($$0, "HomePosX", "HomePosY", "HomePosZ", "home_pos");
      return $$0.renameField("HasEgg", "has_egg");
   }

   private Dynamic<?> f(Dynamic<?> $$0) {
      return bbf.a($$0, "TileX", "TileY", "TileZ", "block_pos");
   }
}
