import com.google.common.collect.Lists;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
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
import java.util.stream.Stream;

public class bdk extends DataFix {
   public bdk(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      return this.a(this.getInputSchema().getTypeRaw(bho.t));
   }

   private <IS> TypeRewriteRule a(Type<IS> $$0) {
      Type<Pair<Either<List<IS>, Unit>, Dynamic<?>>> $$1 = DSL.and(DSL.optional(DSL.field("Equipment", DSL.list($$0))), DSL.remainderType());
      Type<Pair<Either<List<IS>, Unit>, Pair<Either<List<IS>, Unit>, Pair<Either<IS, Unit>, Dynamic<?>>>>> $$2 = DSL.and(
         DSL.optional(DSL.field("ArmorItems", DSL.list($$0))),
         DSL.optional(DSL.field("HandItems", DSL.list($$0))),
         DSL.optional(DSL.field("body_armor_item", $$0)),
         DSL.remainderType()
      );
      OpticFinder<Pair<Either<List<IS>, Unit>, Dynamic<?>>> $$3 = DSL.typeFinder($$1);
      OpticFinder<List<IS>> $$4 = DSL.fieldFinder("Equipment", DSL.list($$0));
      return this.fixTypeEverywhereTyped(
         "EntityEquipmentToArmorAndHandFix",
         this.getInputSchema().getType(bho.B),
         this.getOutputSchema().getType(bho.B),
         $$4x -> {
            Either<List<IS>, Unit> $$5 = Either.right(DSL.unit());
            Either<List<IS>, Unit> $$6 = Either.right(DSL.unit());
            Either<IS, Unit> $$7 = Either.right(DSL.unit());
            Dynamic<?> $$8 = (Dynamic<?>)$$4x.getOrCreate(DSL.remainderFinder());
            Optional<List<IS>> $$9 = $$4x.getOptional($$4);
            if ($$9.isPresent()) {
               List<IS> $$10 = $$9.get();
               IS $$11 = (IS)((Pair)$$0.read($$8.emptyMap())
                     .result()
                     .orElseThrow(() -> new IllegalStateException("Could not parse newly created empty itemstack.")))
                  .getFirst();
               if (!$$10.isEmpty()) {
                  $$5 = Either.left(Lists.newArrayList(new Object[]{$$10.get(0), $$11}));
               }

               if ($$10.size() > 1) {
                  List<IS> $$12 = Lists.newArrayList(new Object[]{$$11, $$11, $$11, $$11});

                  for (int $$13 = 1; $$13 < Math.min($$10.size(), 5); $$13++) {
                     $$12.set($$13 - 1, $$10.get($$13));
                  }

                  $$6 = Either.left($$12);
               }
            }

            Dynamic<?> $$14 = $$8;
            Optional<? extends Stream<? extends Dynamic<?>>> $$15 = $$8.get("DropChances").asStreamOpt().result();
            if ($$15.isPresent()) {
               Iterator<? extends Dynamic<?>> $$16 = Stream.concat((Stream<? extends Dynamic<?>>)$$15.get(), Stream.generate(() -> $$14.createInt(0)))
                  .iterator();
               float $$17 = $$16.next().asFloat(0.0F);
               if ($$8.get("HandDropChances").result().isEmpty()) {
                  Dynamic<?> $$18 = $$8.createList(Stream.of($$17, 0.0F).map($$8::createFloat));
                  $$8 = $$8.set("HandDropChances", $$18);
               }

               if ($$8.get("ArmorDropChances").result().isEmpty()) {
                  Dynamic<?> $$19 = $$8.createList(
                     Stream.of($$16.next().asFloat(0.0F), $$16.next().asFloat(0.0F), $$16.next().asFloat(0.0F), $$16.next().asFloat(0.0F))
                        .map($$8::createFloat)
                  );
                  $$8 = $$8.set("ArmorDropChances", $$19);
               }

               $$8 = $$8.remove("DropChances");
            }

            return $$4x.set($$3, $$2, Pair.of($$5, Pair.of($$6, Pair.of($$7, $$8))));
         }
      );
   }
}
