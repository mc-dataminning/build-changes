import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class ezh {
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
   public static final bbo c = a("chest", $$0 -> $$0.a(ezi.f).b(ezi.a));
   public static final bbo d = a("command", $$0 -> $$0.a(ezi.f).b(ezi.a));
   public static final bbo e = a("selector", $$0 -> $$0.a(ezi.f).a(ezi.a));
   public static final bbo f = a("fishing", $$0 -> $$0.a(ezi.f).a(ezi.i).b(ezi.a));
   public static final bbo g = a("entity", $$0 -> $$0.a(ezi.a).a(ezi.f).a(ezi.c).b(ezi.d).b(ezi.e).b(ezi.b));
   public static final bbo h = a("equipment", $$0 -> $$0.a(ezi.f).a(ezi.a));
   public static final bbo i = a("archaeology", $$0 -> $$0.a(ezi.f).a(ezi.a).a(ezi.i));
   public static final bbo j = a("gift", $$0 -> $$0.a(ezi.f).a(ezi.a));
   public static final bbo k = a("barter", $$0 -> $$0.a(ezi.a));
   public static final bbo l = a("vault", $$0 -> $$0.a(ezi.f).b(ezi.a).b(ezi.i));
   public static final bbo m = a("advancement_reward", $$0 -> $$0.a(ezi.a).a(ezi.f));
   public static final bbo n = a("advancement_entity", $$0 -> $$0.a(ezi.a).a(ezi.f));
   public static final bbo o = a("advancement_location", $$0 -> $$0.a(ezi.a).a(ezi.f).a(ezi.i).a(ezi.g));
   public static final bbo p = a("block_use", $$0 -> $$0.a(ezi.a).a(ezi.f).a(ezi.g));
   public static final bbo q = a("generic", $$0 -> $$0.a(ezi.a).a(ezi.b).a(ezi.c).a(ezi.d).a(ezi.e).a(ezi.f).a(ezi.g).a(ezi.h).a(ezi.i).a(ezi.j));
   public static final bbo r = a("block", $$0 -> $$0.a(ezi.g).a(ezi.f).a(ezi.i).b(ezi.a).b(ezi.h).b(ezi.j));
   public static final bbo s = a("shearing", $$0 -> $$0.a(ezi.f).a(ezi.a).a(ezi.i));
   public static final bbo t = a("enchanted_damage", $$0 -> $$0.a(ezi.a).a(ezi.k).a(ezi.f).a(ezi.c).b(ezi.e).b(ezi.d));
   public static final bbo u = a("enchanted_item", $$0 -> $$0.a(ezi.i).a(ezi.k));
   public static final bbo v = a("enchanted_location", $$0 -> $$0.a(ezi.a).a(ezi.k).a(ezi.f).a(ezi.l));
   public static final bbo w = a("enchanted_entity", $$0 -> $$0.a(ezi.a).a(ezi.k).a(ezi.f));
   public static final bbo x = a("hit_block", $$0 -> $$0.a(ezi.a).a(ezi.k).a(ezi.f).a(ezi.g));

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
