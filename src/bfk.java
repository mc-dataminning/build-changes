import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class bfk extends DataFix {
   public bfk(Schema $$0) {
      super($$0, true);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getTypeRaw(bit.t);
      Type<?> $$1 = this.getOutputSchema().getTypeRaw(bit.t);
      OpticFinder<?> $$2 = $$0.findField("id");
      return this.a($$0, $$1, $$2);
   }

   private <ItemStackOld, ItemStackNew> TypeRewriteRule a(Type<ItemStackOld> $$0, Type<ItemStackNew> $$1, OpticFinder<?> $$2) {
      Type<Pair<String, Pair<Either<List<ItemStackOld>, Unit>, Pair<Either<List<ItemStackOld>, Unit>, Pair<Either<ItemStackOld, Unit>, Either<ItemStackOld, Unit>>>>>> $$3 = DSL.named(
         bit.A.typeName(),
         DSL.and(
            DSL.optional(DSL.field("ArmorItems", DSL.list($$0))),
            DSL.optional(DSL.field("HandItems", DSL.list($$0))),
            DSL.optional(DSL.field("body_armor_item", $$0)),
            DSL.optional(DSL.field("saddle", $$0))
         )
      );
      Type<Pair<String, Either<Pair<Either<ItemStackNew, Unit>, Pair<Either<ItemStackNew, Unit>, Pair<Either<ItemStackNew, Unit>, Pair<Either<ItemStackNew, Unit>, Pair<Either<ItemStackNew, Unit>, Pair<Either<ItemStackNew, Unit>, Pair<Either<ItemStackNew, Unit>, Pair<Either<ItemStackNew, Unit>, Dynamic<?>>>>>>>>>, Unit>>> $$4 = DSL.named(
         bit.A.typeName(),
         DSL.optional(
            DSL.field(
               "equipment",
               DSL.and(
                  DSL.optional(DSL.field("mainhand", $$1)),
                  DSL.optional(DSL.field("offhand", $$1)),
                  DSL.optional(DSL.field("feet", $$1)),
                  DSL.and(
                     DSL.optional(DSL.field("legs", $$1)),
                     DSL.optional(DSL.field("chest", $$1)),
                     DSL.optional(DSL.field("head", $$1)),
                     DSL.and(DSL.optional(DSL.field("body", $$1)), DSL.optional(DSL.field("saddle", $$1)), DSL.remainderType())
                  )
               )
            )
         )
      );
      if (!$$3.equals(this.getInputSchema().getType(bit.A))) {
         throw new IllegalStateException("Input entity_equipment type does not match expected");
      } else if (!$$4.equals(this.getOutputSchema().getType(bit.A))) {
         throw new IllegalStateException("Output entity_equipment type does not match expected");
      } else {
         return this.fixTypeEverywhere(
            "EquipmentFormatFix",
            $$3,
            $$4,
            $$2x -> {
               Predicate<ItemStackOld> $$3x = $$3xx -> {
                  Typed<ItemStackOld> $$4x = new Typed($$0, $$2x, $$3xx);
                  return $$4x.getOptional($$2).isEmpty();
               };
               return $$2xx -> {
                  String $$3xx = (String)$$2xx.getFirst();
                  Pair<Either<List<ItemStackOld>, Unit>, Pair<Either<List<ItemStackOld>, Unit>, Pair<Either<ItemStackOld, Unit>, Either<ItemStackOld, Unit>>>> $$4x = (Pair<Either<List<ItemStackOld>, Unit>, Pair<Either<List<ItemStackOld>, Unit>, Pair<Either<ItemStackOld, Unit>, Either<ItemStackOld, Unit>>>>)$$2xx.getSecond();
                  List<ItemStackOld> $$5 = (List<ItemStackOld>)((Either)$$4x.getFirst()).map(Function.identity(), $$0xxx -> List.of());
                  List<ItemStackOld> $$6 = (List<ItemStackOld>)((Either)((Pair)$$4x.getSecond()).getFirst()).map(Function.identity(), $$0xxx -> List.of());
                  Either<ItemStackOld, Unit> $$7 = (Either<ItemStackOld, Unit>)((Pair)((Pair)$$4x.getSecond()).getSecond()).getFirst();
                  Either<ItemStackOld, Unit> $$8 = (Either<ItemStackOld, Unit>)((Pair)((Pair)$$4x.getSecond()).getSecond()).getSecond();
                  Either<ItemStackOld, Unit> $$9 = a(0, $$5, $$3x);
                  Either<ItemStackOld, Unit> $$10 = a(1, $$5, $$3x);
                  Either<ItemStackOld, Unit> $$11 = a(2, $$5, $$3x);
                  Either<ItemStackOld, Unit> $$12 = a(3, $$5, $$3x);
                  Either<ItemStackOld, Unit> $$13 = a(0, $$6, $$3x);
                  Either<ItemStackOld, Unit> $$14 = a(1, $$6, $$3x);
                  return a($$7, $$8, $$9, $$10, $$11, $$12, $$13, $$14)
                     ? Pair.of($$3xx, Either.right(Unit.INSTANCE))
                     : Pair.of(
                        $$3xx,
                        Either.left(
                           Pair.of(
                              $$13, Pair.of($$14, Pair.of($$9, Pair.of($$10, Pair.of($$11, Pair.of($$12, Pair.of($$7, Pair.of($$8, new Dynamic($$2x))))))))
                           )
                        )
                     );
               };
            }
         );
      }
   }

   @SafeVarargs
   private static boolean a(Either<?, Unit>... $$0) {
      for (Either<?, Unit> $$1 : $$0) {
         if ($$1.right().isEmpty()) {
            return false;
         }
      }

      return true;
   }

   private static <ItemStack> Either<ItemStack, Unit> a(int $$0, List<ItemStack> $$1, Predicate<ItemStack> $$2) {
      if ($$0 >= $$1.size()) {
         return Either.right(Unit.INSTANCE);
      } else {
         ItemStack $$3 = $$1.get($$0);
         return $$2.test($$3) ? Either.right(Unit.INSTANCE) : Either.left($$3);
      }
   }
}
