import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class efa {
   private static final BiMap<aex, eez> p = HashBiMap.create();
   public static final Codec<eez> a = aex.a
      .comapFlatMap(
         $$0 -> Optional.ofNullable((eez)p.get($$0))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + $$0 + "'")),
         p.inverse()::get
      );
   public static final eez b = a("empty", $$0 -> {
   });
   public static final eez c = a("chest", $$0 -> $$0.a(efb.f).b(efb.a));
   public static final eez d = a("command", $$0 -> $$0.a(efb.f).b(efb.a));
   public static final eez e = a("selector", $$0 -> $$0.a(efb.f).a(efb.a));
   public static final eez f = a("fishing", $$0 -> $$0.a(efb.f).a(efb.i).b(efb.a));
   public static final eez g = a("entity", $$0 -> $$0.a(efb.a).a(efb.f).a(efb.c).b(efb.d).b(efb.e).b(efb.b));
   public static final eez h = a("archaeology", $$0 -> $$0.a(efb.f).b(efb.a));
   public static final eez i = a("gift", $$0 -> $$0.a(efb.f).a(efb.a));
   public static final eez j = a("barter", $$0 -> $$0.a(efb.a));
   public static final eez k = a("advancement_reward", $$0 -> $$0.a(efb.a).a(efb.f));
   public static final eez l = a("advancement_entity", $$0 -> $$0.a(efb.a).a(efb.f));
   public static final eez m = a("advancement_location", $$0 -> $$0.a(efb.a).a(efb.f).a(efb.i).a(efb.g));
   public static final eez n = a("generic", $$0 -> $$0.a(efb.a).a(efb.b).a(efb.c).a(efb.d).a(efb.e).a(efb.f).a(efb.g).a(efb.h).a(efb.i).a(efb.j));
   public static final eez o = a("block", $$0 -> $$0.a(efb.g).a(efb.f).a(efb.i).b(efb.a).b(efb.h).b(efb.j));

   private static eez a(String $$0, Consumer<eez.a> $$1) {
      eez.a $$2 = new eez.a();
      $$1.accept($$2);
      eez $$3 = $$2.a();
      aex $$4 = new aex($$0);
      eez $$5 = (eez)p.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }
}
