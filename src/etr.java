import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class etr {
   private static final BiMap<akk, etq> x = HashBiMap.create();
   public static final Codec<etq> a = akk.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((etq)x.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         x.inverse()::get
      );
   public static final etq b = a("empty", $$0 -> {
   });
   public static final etq c = a("chest", $$0 -> $$0.a(ets.f).b(ets.a));
   public static final etq d = a("command", $$0 -> $$0.a(ets.f).b(ets.a));
   public static final etq e = a("selector", $$0 -> $$0.a(ets.f).a(ets.a));
   public static final etq f = a("fishing", $$0 -> $$0.a(ets.f).a(ets.i).b(ets.a));
   public static final etq g = a("entity", $$0 -> $$0.a(ets.a).a(ets.f).a(ets.c).b(ets.d).b(ets.e).b(ets.b));
   public static final etq h = a("equipment", $$0 -> $$0.a(ets.f).a(ets.a));
   public static final etq i = a("archaeology", $$0 -> $$0.a(ets.f).b(ets.a));
   public static final etq j = a("gift", $$0 -> $$0.a(ets.f).a(ets.a));
   public static final etq k = a("barter", $$0 -> $$0.a(ets.a));
   public static final etq l = a("vault", $$0 -> $$0.a(ets.f).b(ets.a));
   public static final etq m = a("advancement_reward", $$0 -> $$0.a(ets.a).a(ets.f));
   public static final etq n = a("advancement_entity", $$0 -> $$0.a(ets.a).a(ets.f));
   public static final etq o = a("advancement_location", $$0 -> $$0.a(ets.a).a(ets.f).a(ets.i).a(ets.g));
   public static final etq p = a("block_use", $$0 -> $$0.a(ets.a).a(ets.f).a(ets.g));
   public static final etq q = a("generic", $$0 -> $$0.a(ets.a).a(ets.b).a(ets.c).a(ets.d).a(ets.e).a(ets.f).a(ets.g).a(ets.h).a(ets.i).a(ets.j));
   public static final etq r = a("block", $$0 -> $$0.a(ets.g).a(ets.f).a(ets.i).b(ets.a).b(ets.h).b(ets.j));
   public static final etq s = a("shearing", $$0 -> $$0.a(ets.f).b(ets.a));
   public static final etq t = a("enchanted_damage", $$0 -> $$0.a(ets.a).a(ets.k).a(ets.f).a(ets.c).b(ets.e).b(ets.d));
   public static final etq u = a("enchanted_item", $$0 -> $$0.a(ets.i).a(ets.k));
   public static final etq v = a("enchanted_location", $$0 -> $$0.a(ets.a).a(ets.k).a(ets.f).a(ets.l));
   public static final etq w = a("enchanted_entity", $$0 -> $$0.a(ets.a).a(ets.k).a(ets.f));

   private static etq a(String $$0, Consumer<etq.a> $$1) {
      etq.a $$2 = new etq.a();
      $$1.accept($$2);
      etq $$3 = $$2.a();
      akk $$4 = new akk($$0);
      etq $$5 = (etq)x.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
