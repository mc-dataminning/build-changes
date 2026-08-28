import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class fbg {
   private static final BiMap<ale, baw> y = HashBiMap.create();
   public static final Codec<baw> a = ale.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((baw)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final baw b = a("empty", $$0 -> {
   });
   public static final baw c = a("chest", $$0 -> $$0.a(fbh.f).b(fbh.a));
   public static final baw d = a("command", $$0 -> $$0.a(fbh.f).b(fbh.a));
   public static final baw e = a("selector", $$0 -> $$0.a(fbh.f).a(fbh.a));
   public static final baw f = a("fishing", $$0 -> $$0.a(fbh.f).a(fbh.i).b(fbh.a));
   public static final baw g = a("entity", $$0 -> $$0.a(fbh.a).a(fbh.f).a(fbh.c).b(fbh.d).b(fbh.e).b(fbh.b));
   public static final baw h = a("equipment", $$0 -> $$0.a(fbh.f).a(fbh.a));
   public static final baw i = a("archaeology", $$0 -> $$0.a(fbh.f).a(fbh.a).a(fbh.i));
   public static final baw j = a("gift", $$0 -> $$0.a(fbh.f).a(fbh.a));
   public static final baw k = a("barter", $$0 -> $$0.a(fbh.a));
   public static final baw l = a("vault", $$0 -> $$0.a(fbh.f).b(fbh.a).b(fbh.i));
   public static final baw m = a("advancement_reward", $$0 -> $$0.a(fbh.a).a(fbh.f));
   public static final baw n = a("advancement_entity", $$0 -> $$0.a(fbh.a).a(fbh.f));
   public static final baw o = a("advancement_location", $$0 -> $$0.a(fbh.a).a(fbh.f).a(fbh.i).a(fbh.g));
   public static final baw p = a("block_use", $$0 -> $$0.a(fbh.a).a(fbh.f).a(fbh.g));
   public static final baw q = a("generic", $$0 -> $$0.a(fbh.a).a(fbh.b).a(fbh.c).a(fbh.d).a(fbh.e).a(fbh.f).a(fbh.g).a(fbh.h).a(fbh.i).a(fbh.j));
   public static final baw r = a("block", $$0 -> $$0.a(fbh.g).a(fbh.f).a(fbh.i).b(fbh.a).b(fbh.h).b(fbh.j));
   public static final baw s = a("shearing", $$0 -> $$0.a(fbh.f).a(fbh.a).a(fbh.i));
   public static final baw t = a("enchanted_damage", $$0 -> $$0.a(fbh.a).a(fbh.k).a(fbh.f).a(fbh.c).b(fbh.e).b(fbh.d));
   public static final baw u = a("enchanted_item", $$0 -> $$0.a(fbh.i).a(fbh.k));
   public static final baw v = a("enchanted_location", $$0 -> $$0.a(fbh.a).a(fbh.k).a(fbh.f).a(fbh.l));
   public static final baw w = a("enchanted_entity", $$0 -> $$0.a(fbh.a).a(fbh.k).a(fbh.f));
   public static final baw x = a("hit_block", $$0 -> $$0.a(fbh.a).a(fbh.k).a(fbh.f).a(fbh.g));

   private static baw a(String $$0, Consumer<baw.a> $$1) {
      baw.a $$2 = new baw.a();
      $$1.accept($$2);
      baw $$3 = $$2.a();
      ale $$4 = ale.b($$0);
      baw $$5 = (baw)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
