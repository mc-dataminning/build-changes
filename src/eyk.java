import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class eyk {
   private static final BiMap<aku, baj> y = HashBiMap.create();
   public static final Codec<baj> a = aku.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((baj)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final baj b = a("empty", $$0 -> {
   });
   public static final baj c = a("chest", $$0 -> $$0.a(eyl.f).b(eyl.a));
   public static final baj d = a("command", $$0 -> $$0.a(eyl.f).b(eyl.a));
   public static final baj e = a("selector", $$0 -> $$0.a(eyl.f).a(eyl.a));
   public static final baj f = a("fishing", $$0 -> $$0.a(eyl.f).a(eyl.i).b(eyl.a));
   public static final baj g = a("entity", $$0 -> $$0.a(eyl.a).a(eyl.f).a(eyl.c).b(eyl.d).b(eyl.e).b(eyl.b));
   public static final baj h = a("equipment", $$0 -> $$0.a(eyl.f).a(eyl.a));
   public static final baj i = a("archaeology", $$0 -> $$0.a(eyl.f).a(eyl.a).a(eyl.i));
   public static final baj j = a("gift", $$0 -> $$0.a(eyl.f).a(eyl.a));
   public static final baj k = a("barter", $$0 -> $$0.a(eyl.a));
   public static final baj l = a("vault", $$0 -> $$0.a(eyl.f).b(eyl.a).b(eyl.i));
   public static final baj m = a("advancement_reward", $$0 -> $$0.a(eyl.a).a(eyl.f));
   public static final baj n = a("advancement_entity", $$0 -> $$0.a(eyl.a).a(eyl.f));
   public static final baj o = a("advancement_location", $$0 -> $$0.a(eyl.a).a(eyl.f).a(eyl.i).a(eyl.g));
   public static final baj p = a("block_use", $$0 -> $$0.a(eyl.a).a(eyl.f).a(eyl.g));
   public static final baj q = a("generic", $$0 -> $$0.a(eyl.a).a(eyl.b).a(eyl.c).a(eyl.d).a(eyl.e).a(eyl.f).a(eyl.g).a(eyl.h).a(eyl.i).a(eyl.j));
   public static final baj r = a("block", $$0 -> $$0.a(eyl.g).a(eyl.f).a(eyl.i).b(eyl.a).b(eyl.h).b(eyl.j));
   public static final baj s = a("shearing", $$0 -> $$0.a(eyl.f).a(eyl.a).a(eyl.i));
   public static final baj t = a("enchanted_damage", $$0 -> $$0.a(eyl.a).a(eyl.k).a(eyl.f).a(eyl.c).b(eyl.e).b(eyl.d));
   public static final baj u = a("enchanted_item", $$0 -> $$0.a(eyl.i).a(eyl.k));
   public static final baj v = a("enchanted_location", $$0 -> $$0.a(eyl.a).a(eyl.k).a(eyl.f).a(eyl.l));
   public static final baj w = a("enchanted_entity", $$0 -> $$0.a(eyl.a).a(eyl.k).a(eyl.f));
   public static final baj x = a("hit_block", $$0 -> $$0.a(eyl.a).a(eyl.k).a(eyl.f).a(eyl.g));

   private static baj a(String $$0, Consumer<baj.a> $$1) {
      baj.a $$2 = new baj.a();
      $$1.accept($$2);
      baj $$3 = $$2.a();
      aku $$4 = aku.b($$0);
      baj $$5 = (baj)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
