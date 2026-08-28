import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class ezi {
   private static final BiMap<alz, bbo> y = HashBiMap.create();
   public static final Codec<bbo> a = alz.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((bbo)y.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         y.inverse()::get
      );
   public static final bbo b = a("empty", $$0 -> {
   });
   public static final bbo c = a("chest", $$0 -> $$0.a(ezj.f).b(ezj.a));
   public static final bbo d = a("command", $$0 -> $$0.a(ezj.f).b(ezj.a));
   public static final bbo e = a("selector", $$0 -> $$0.a(ezj.f).a(ezj.a));
   public static final bbo f = a("fishing", $$0 -> $$0.a(ezj.f).a(ezj.i).b(ezj.a));
   public static final bbo g = a("entity", $$0 -> $$0.a(ezj.a).a(ezj.f).a(ezj.c).b(ezj.d).b(ezj.e).b(ezj.b));
   public static final bbo h = a("equipment", $$0 -> $$0.a(ezj.f).a(ezj.a));
   public static final bbo i = a("archaeology", $$0 -> $$0.a(ezj.f).a(ezj.a).a(ezj.i));
   public static final bbo j = a("gift", $$0 -> $$0.a(ezj.f).a(ezj.a));
   public static final bbo k = a("barter", $$0 -> $$0.a(ezj.a));
   public static final bbo l = a("vault", $$0 -> $$0.a(ezj.f).b(ezj.a).b(ezj.i));
   public static final bbo m = a("advancement_reward", $$0 -> $$0.a(ezj.a).a(ezj.f));
   public static final bbo n = a("advancement_entity", $$0 -> $$0.a(ezj.a).a(ezj.f));
   public static final bbo o = a("advancement_location", $$0 -> $$0.a(ezj.a).a(ezj.f).a(ezj.i).a(ezj.g));
   public static final bbo p = a("block_use", $$0 -> $$0.a(ezj.a).a(ezj.f).a(ezj.g));
   public static final bbo q = a("generic", $$0 -> $$0.a(ezj.a).a(ezj.b).a(ezj.c).a(ezj.d).a(ezj.e).a(ezj.f).a(ezj.g).a(ezj.h).a(ezj.i).a(ezj.j));
   public static final bbo r = a("block", $$0 -> $$0.a(ezj.g).a(ezj.f).a(ezj.i).b(ezj.a).b(ezj.h).b(ezj.j));
   public static final bbo s = a("shearing", $$0 -> $$0.a(ezj.f).a(ezj.a).a(ezj.i));
   public static final bbo t = a("enchanted_damage", $$0 -> $$0.a(ezj.a).a(ezj.k).a(ezj.f).a(ezj.c).b(ezj.e).b(ezj.d));
   public static final bbo u = a("enchanted_item", $$0 -> $$0.a(ezj.i).a(ezj.k));
   public static final bbo v = a("enchanted_location", $$0 -> $$0.a(ezj.a).a(ezj.k).a(ezj.f).a(ezj.l));
   public static final bbo w = a("enchanted_entity", $$0 -> $$0.a(ezj.a).a(ezj.k).a(ezj.f));
   public static final bbo x = a("hit_block", $$0 -> $$0.a(ezj.a).a(ezj.k).a(ezj.f).a(ezj.g));

   private static bbo a(String $$0, Consumer<bbo.a> $$1) {
      bbo.a $$2 = new bbo.a();
      $$1.accept($$2);
      bbo $$3 = $$2.a();
      alz $$4 = alz.b($$0);
      bbo $$5 = (bbo)y.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
