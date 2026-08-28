import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class eyj {
   private static final BiMap<akv, baj> y = HashBiMap.create();
   public static final Codec<baj> a = akv.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((baj)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final baj b = a("empty", $$0 -> {
   });
   public static final baj c = a("chest", $$0 -> $$0.a(eyk.f).b(eyk.a));
   public static final baj d = a("command", $$0 -> $$0.a(eyk.f).b(eyk.a));
   public static final baj e = a("selector", $$0 -> $$0.a(eyk.f).a(eyk.a));
   public static final baj f = a("fishing", $$0 -> $$0.a(eyk.f).a(eyk.i).b(eyk.a));
   public static final baj g = a("entity", $$0 -> $$0.a(eyk.a).a(eyk.f).a(eyk.c).b(eyk.d).b(eyk.e).b(eyk.b));
   public static final baj h = a("equipment", $$0 -> $$0.a(eyk.f).a(eyk.a));
   public static final baj i = a("archaeology", $$0 -> $$0.a(eyk.f).a(eyk.a).a(eyk.i));
   public static final baj j = a("gift", $$0 -> $$0.a(eyk.f).a(eyk.a));
   public static final baj k = a("barter", $$0 -> $$0.a(eyk.a));
   public static final baj l = a("vault", $$0 -> $$0.a(eyk.f).b(eyk.a).b(eyk.i));
   public static final baj m = a("advancement_reward", $$0 -> $$0.a(eyk.a).a(eyk.f));
   public static final baj n = a("advancement_entity", $$0 -> $$0.a(eyk.a).a(eyk.f));
   public static final baj o = a("advancement_location", $$0 -> $$0.a(eyk.a).a(eyk.f).a(eyk.i).a(eyk.g));
   public static final baj p = a("block_use", $$0 -> $$0.a(eyk.a).a(eyk.f).a(eyk.g));
   public static final baj q = a("generic", $$0 -> $$0.a(eyk.a).a(eyk.b).a(eyk.c).a(eyk.d).a(eyk.e).a(eyk.f).a(eyk.g).a(eyk.h).a(eyk.i).a(eyk.j));
   public static final baj r = a("block", $$0 -> $$0.a(eyk.g).a(eyk.f).a(eyk.i).b(eyk.a).b(eyk.h).b(eyk.j));
   public static final baj s = a("shearing", $$0 -> $$0.a(eyk.f).a(eyk.a).a(eyk.i));
   public static final baj t = a("enchanted_damage", $$0 -> $$0.a(eyk.a).a(eyk.k).a(eyk.f).a(eyk.c).b(eyk.e).b(eyk.d));
   public static final baj u = a("enchanted_item", $$0 -> $$0.a(eyk.i).a(eyk.k));
   public static final baj v = a("enchanted_location", $$0 -> $$0.a(eyk.a).a(eyk.k).a(eyk.f).a(eyk.l));
   public static final baj w = a("enchanted_entity", $$0 -> $$0.a(eyk.a).a(eyk.k).a(eyk.f));
   public static final baj x = a("hit_block", $$0 -> $$0.a(eyk.a).a(eyk.k).a(eyk.f).a(eyk.g));

   private static baj a(String $$0, Consumer<baj.a> $$1) {
      baj.a $$2 = new baj.a();
      $$1.accept($$2);
      baj $$3 = $$2.a();
      akv $$4 = akv.b($$0);
      baj $$5 = (baj)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
