import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class eeu {
   private static final BiMap<aez, eet> p = HashBiMap.create();
   public static final Codec<eet> a = aez.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((eet)p.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         p.inverse()::get
      );
   public static final eet b = a("empty", $$0 -> {
   });
   public static final eet c = a("chest", $$0 -> $$0.a(eev.f).b(eev.a));
   public static final eet d = a("command", $$0 -> $$0.a(eev.f).b(eev.a));
   public static final eet e = a("selector", $$0 -> $$0.a(eev.f).a(eev.a));
   public static final eet f = a("fishing", $$0 -> $$0.a(eev.f).a(eev.i).b(eev.a));
   public static final eet g = a("entity", $$0 -> $$0.a(eev.a).a(eev.f).a(eev.c).b(eev.d).b(eev.e).b(eev.b));
   public static final eet h = a("archaeology", $$0 -> $$0.a(eev.f).b(eev.a));
   public static final eet i = a("gift", $$0 -> $$0.a(eev.f).a(eev.a));
   public static final eet j = a("barter", $$0 -> $$0.a(eev.a));
   public static final eet k = a("advancement_reward", $$0 -> $$0.a(eev.a).a(eev.f));
   public static final eet l = a("advancement_entity", $$0 -> $$0.a(eev.a).a(eev.f));
   public static final eet m = a("advancement_location", $$0 -> $$0.a(eev.a).a(eev.f).a(eev.i).a(eev.g));
   public static final eet n = a("generic", $$0 -> $$0.a(eev.a).a(eev.b).a(eev.c).a(eev.d).a(eev.e).a(eev.f).a(eev.g).a(eev.h).a(eev.i).a(eev.j));
   public static final eet o = a("block", $$0 -> $$0.a(eev.g).a(eev.f).a(eev.i).b(eev.a).b(eev.h).b(eev.j));

   private static eet a(String $$0, Consumer<eet.a> $$1) {
      eet.a $$2 = new eet.a();
      $$1.accept($$2);
      eet $$3 = $$2.a();
      aez $$4 = new aez($$0);
      eet $$5 = (eet)p.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
