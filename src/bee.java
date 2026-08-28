import com.google.common.collect.Lists;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class bee extends DataFix {
   public bee(Schema $$0) {
      super($$0, true);
   }

   public TypeRewriteRule makeRule() {
      return this.a(this.getInputSchema().getTypeRaw(bit.t), this.getOutputSchema().getTypeRaw(bit.t));
   }

   private <ItemStackOld, ItemStackNew> TypeRewriteRule a(Type<ItemStackOld> $$0, Type<ItemStackNew> $$1) {
      Type<Pair<String, Either<List<ItemStackOld>, Unit>>> $$2 = DSL.named(bit.A.typeName(), DSL.optional(DSL.field("Equipment", DSL.list($$0))));
      Type<Pair<String, Pair<Either<List<ItemStackNew>, Unit>, Pair<Either<List<ItemStackNew>, Unit>, Pair<Either<ItemStackNew, Unit>, Either<ItemStackNew, Unit>>>>>> $$3 = DSL.named(
         bit.A.typeName(),
         DSL.and(
            DSL.optional(DSL.field("ArmorItems", DSL.list($$1))),
            DSL.optional(DSL.field("HandItems", DSL.list($$1))),
            DSL.optional(DSL.field("body_armor_item", $$1)),
            DSL.optional(DSL.field("saddle", $$1))
         )
      );
      if (!$$2.equals(this.getInputSchema().getType(bit.A))) {
         throw new IllegalStateException("Input entity_equipment type does not match expected");
      } else if (!$$3.equals(this.getOutputSchema().getType(bit.A))) {
         throw new IllegalStateException("Output entity_equipment type does not match expected");
      } else {
         return TypeRewriteRule.seq(
            this.fixTypeEverywhereTyped(
               "EntityEquipmentToArmorAndHandFix - drop chances", this.getInputSchema().getType(bit.D), $$0x -> $$0x.update(DSL.remainderFinder(), bee::a)
            ),
            this.fixTypeEverywhere(
               "EntityEquipmentToArmorAndHandFix - equipment",
               $$2,
               $$3,
               $$1x -> {
                  ItemStackNew $$2x = (ItemStackNew)((Pair)$$1.read(new Dynamic($$1x).emptyMap())
                        .result()
                        .orElseThrow(() -> new IllegalStateException("Could not parse newly created empty itemstack.")))
                     .getFirst();
                  Either<ItemStackNew, Unit> $$3x = Either.right(DSL.unit());
                  return $$2xx -> $$2xx.mapSecond($$2xxx -> {
                        List<ItemStackOld> $$3xx = (List<ItemStackOld>)$$2xxx.map(Function.identity(), $$0xxxx -> List.of());
                        Either<List<ItemStackNew>, Unit> $$4 = Either.right(DSL.unit());
                        Either<List<ItemStackNew>, Unit> $$5 = Either.right(DSL.unit());
                        if (!$$3xx.isEmpty()) {
                           $$4 = Either.left(Lists.newArrayList(new Object[]{$$3xx.getFirst(), $$2x}));
                        }

                        if ($$3xx.size() > 1) {
                           List<ItemStackNew> $$6 = Lists.newArrayList(new Object[]{$$2x, $$2x, $$2x, $$2x});

                           for (int $$7 = 1; $$7 < Math.min($$3xx.size(), 5); $$7++) {
                              $$6.set($$7 - 1, (ItemStackNew)$$3xx.get($$7));
                           }

                           $$5 = Either.left($$6);
                        }

                        return Pair.of($$5, Pair.of($$4, Pair.of($$3x, $$3x)));
                     });
               }
            )
         );
      }
   }

   private static Dynamic<?> a(Dynamic<?> $$0) {
      Optional<? extends Stream<? extends Dynamic<?>>> $$1 = $$0.get("DropChances").asStreamOpt().result();
      $$0 = $$0.remove("DropChances");
      if ($$1.isPresent()) {
         Iterator<Float> $$2 = Stream.concat($$1.get().map($$0x -> $$0x.asFloat(0.0F)), Stream.generate(() -> 0.0F)).iterator();
         float $$3 = $$2.next();
         if ($$0.get("HandDropChances").result().isEmpty()) {
            $$0 = $$0.set("HandDropChances", $$0.createList(Stream.of($$3, 0.0F).map($$0::createFloat)));
         }

         if ($$0.get("ArmorDropChances").result().isEmpty()) {
            $$0 = $$0.set("ArmorDropChances", $$0.createList(Stream.of($$2.next(), $$2.next(), $$2.next(), $$2.next()).map($$0::createFloat)));
         }
      }

      return $$0;
   }
}
