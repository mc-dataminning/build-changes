import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.FieldFinder;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.CompoundList.CompoundListType;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import java.util.List;

public class bgp extends DataFix {
   public bgp(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   protected static <A> Type<Pair<A, Dynamic<?>>> a(String $$0, Type<A> $$1) {
      return DSL.and(DSL.field($$0, $$1), DSL.remainderType());
   }

   protected static <A> Type<Pair<Either<A, Unit>, Dynamic<?>>> b(String $$0, Type<A> $$1) {
      return DSL.and(DSL.optional(DSL.field($$0, $$1)), DSL.remainderType());
   }

   protected static <A1, A2> Type<Pair<Either<A1, Unit>, Pair<Either<A2, Unit>, Dynamic<?>>>> a(String $$0, Type<A1> $$1, String $$2, Type<A2> $$3) {
      return DSL.and(DSL.optional(DSL.field($$0, $$1)), DSL.optional(DSL.field($$2, $$3)), DSL.remainderType());
   }

   protected TypeRewriteRule makeRule() {
      Schema $$0 = this.getInputSchema();
      Type<?> $$1 = DSL.taggedChoiceType(
         "type",
         DSL.string(),
         ImmutableMap.of(
            "minecraft:debug",
            DSL.remainderType(),
            "minecraft:flat",
            a($$0),
            "minecraft:noise",
            a(
               "biome_source",
               DSL.taggedChoiceType(
                  "type",
                  DSL.string(),
                  ImmutableMap.of(
                     "minecraft:fixed",
                     a("biome", $$0.getType(bhx.K)),
                     "minecraft:multi_noise",
                     DSL.list(a("biome", $$0.getType(bhx.K))),
                     "minecraft:checkerboard",
                     a("biomes", DSL.list($$0.getType(bhx.K))),
                     "minecraft:vanilla_layered",
                     DSL.remainderType(),
                     "minecraft:the_end",
                     DSL.remainderType()
                  )
               ),
               "settings",
               DSL.or(DSL.string(), a("default_block", $$0.getType(bhx.C), "default_fluid", $$0.getType(bhx.C)))
            )
         )
      );
      CompoundListType<String, ?> $$2 = DSL.compoundList(bjl.a(), a("generator", $$1));
      Type<?> $$3 = DSL.and($$2, DSL.remainderType());
      Type<?> $$4 = $$0.getType(bhx.M);
      FieldFinder<?> $$5 = new FieldFinder("dimensions", $$3);
      if (!$$4.findFieldType("dimensions").equals($$3)) {
         throw new IllegalStateException();
      } else {
         OpticFinder<? extends List<? extends Pair<String, ?>>> $$6 = $$2.finder();
         return this.fixTypeEverywhereTyped("MissingDimensionFix", $$4, $$3x -> $$3x.updateTyped($$5, $$3xx -> $$3xx.updateTyped($$6, $$2xxx -> {
                  if (!($$2xxx.getValue() instanceof List)) {
                     throw new IllegalStateException("List exptected");
                  } else if (((List)$$2xxx.getValue()).isEmpty()) {
                     Dynamic<?> $$3xxx = (Dynamic<?>)$$3x.get(DSL.remainderFinder());
                     Dynamic<?> $$4x = this.a($$3xxx);
                     return (Typed)DataFixUtils.orElse($$2.readTyped($$4x).result().map(Pair::getFirst), $$2xxx);
                  } else {
                     return $$2xxx;
                  }
               })));
      }
   }

   protected static Type<? extends Pair<? extends Either<? extends Pair<? extends Either<?, Unit>, ? extends Pair<? extends Either<? extends List<? extends Pair<? extends Either<?, Unit>, Dynamic<?>>>, Unit>, Dynamic<?>>>, Unit>, Dynamic<?>>> a(
      Schema $$0
   ) {
      return b("settings", a("biome", $$0.getType(bhx.K), "layers", DSL.list(b("block", $$0.getType(bhx.C)))));
   }

   private <T> Dynamic<T> a(Dynamic<T> $$0) {
      long $$1 = $$0.get("seed").asLong(0L);
      return new Dynamic($$0.getOps(), bjf.a($$0, $$1, bjf.a($$0, $$1), false));
   }
}
