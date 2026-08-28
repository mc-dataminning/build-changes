import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class etb {
   private static final BiMap<ale, eta> t = HashBiMap.create();
   public static final Codec<eta> a = ale.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((eta)t.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         t.inverse()::get
      );
   public static final eta b = a("empty", $$0 -> {
   });
   public static final eta c = a("chest", $$0 -> $$0.a(etc.f).b(etc.a));
   public static final eta d = a("command", $$0 -> $$0.a(etc.f).b(etc.a));
   public static final eta e = a("selector", $$0 -> $$0.a(etc.f).a(etc.a));
   public static final eta f = a("fishing", $$0 -> $$0.a(etc.f).a(etc.i).b(etc.a));
   public static final eta g = a("entity", $$0 -> $$0.a(etc.a).a(etc.f).a(etc.c).b(etc.d).b(etc.e).b(etc.b));
   public static final eta h = a("equipment", $$0 -> $$0.a(etc.f).a(etc.a));
   public static final eta i = a("archaeology", $$0 -> $$0.a(etc.f).b(etc.a));
   public static final eta j = a("gift", $$0 -> $$0.a(etc.f).a(etc.a));
   public static final eta k = a("barter", $$0 -> $$0.a(etc.a));
   public static final eta l = a("vault", $$0 -> $$0.a(etc.f).b(etc.a));
   public static final eta m = a("advancement_reward", $$0 -> $$0.a(etc.a).a(etc.f));
   public static final eta n = a("advancement_entity", $$0 -> $$0.a(etc.a).a(etc.f));
   public static final eta o = a("advancement_location", $$0 -> $$0.a(etc.a).a(etc.f).a(etc.i).a(etc.g));
   public static final eta p = a("block_use", $$0 -> $$0.a(etc.a).a(etc.f).a(etc.g));
   public static final eta q = a("generic", $$0 -> $$0.a(etc.a).a(etc.b).a(etc.c).a(etc.d).a(etc.e).a(etc.f).a(etc.g).a(etc.h).a(etc.i).a(etc.j));
   public static final eta r = a("block", $$0 -> $$0.a(etc.g).a(etc.f).a(etc.i).b(etc.a).b(etc.h).b(etc.j));
   public static final eta s = a("shearing", $$0 -> $$0.a(etc.f).b(etc.a));

   private static eta a(String $$0, Consumer<eta.a> $$1) {
      eta.a $$2 = new eta.a();
      $$1.accept($$2);
      eta $$3 = $$2.a();
      ale $$4 = new ale($$0);
      eta $$5 = (eta)t.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
